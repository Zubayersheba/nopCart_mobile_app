package nopcart_mobile_app;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.android.AndroidDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import java.lang.Exception;
import java.lang.Override;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import GeneratedUtils;


@DisplayName("nopcartversion2")
public class addToCartTestCaseImplementation implements ExceptionsReporter {
  public static AndroidDriver<? extends MobileElement> driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new AndroidDriver<>("fs7Aqt1fkyX50ldF_72aDAFaxi3wsFJ9fOzUrYAjZc8", getCapabilities(), "Md. Zubayer Alam Shuvo");
  }

  @DisplayName("nopcartversion2")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute() throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;

    // 1. Reset App
    GeneratedUtils.sleep(500);
    driver.resetApp();

    // 2. Make a Swipe to choose electronics category
    GeneratedUtils.sleep(500);
    (new TouchAction(driver)).press(PointOption.point(743,1013))
        				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
        				.moveTo(PointOption.point(282,1031)).release().perform();

    // 3. Make a Swipe 
    GeneratedUtils.sleep(500);
    (new TouchAction(driver)).press(PointOption.point(868,1028))
        				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
        				.moveTo(PointOption.point(581,1028)).release().perform();

    // 4. Click electronics category
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.view.ViewGroup[3]/android.widget.FrameLayout/android.widget.ImageView");
    driver.findElement(by).click();

    // 5. Make a Swipe gesture 
    GeneratedUtils.sleep(500);
    (new TouchAction(driver)).press(PointOption.point(543,1321))
        				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
        				.moveTo(PointOption.point(526,923)).release().perform();

    // 6. Make a Swipe gesture
    GeneratedUtils.sleep(500);
    (new TouchAction(driver)).press(PointOption.point(543,1385))
        				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
        				.moveTo(PointOption.point(526,810)).release().perform();

    // 7. Click Nokia Lumia 1020
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ImageView[1]");
    driver.findElement(by).click();

    // 8. Make a Swipe 
    GeneratedUtils.sleep(500);
    (new TouchAction(driver)).press(PointOption.point(534,1530))
        				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
        				.moveTo(PointOption.point(526,1051)).release().perform();

    // 9. Click 'Small'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.TextView[@text = 'Small']");
    driver.findElement(by).click();

    // 10. Click 'Large' radio button
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.RadioButton[@text = 'Large ']");
    driver.findElement(by).click();

    // 11. Click 'Done' to choose large option
    GeneratedUtils.sleep(500);
    by = By.id("com.nopstation.nopcommerce.nopstationcart:id/tvDone");
    driver.findElement(by).click();

    // 12. Click '+' to increment the value
    GeneratedUtils.sleep(500);
    by = By.id("com.nopstation.nopcommerce.nopstationcart:id/btnPlus");
    driver.findElement(by).click();

    // 13. Click 'ADD TO CART'
    GeneratedUtils.sleep(500);
    by = By.id("com.nopstation.nopcommerce.nopstationcart:id/btnAddToCart");
    driver.findElement(by).click();

  }

  @Override
  public ReportingDriver getDriver() {
    return (ReportingDriver) driver;
  }

  @AfterAll
  static void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }

  private static Stream provideParameters() throws Exception {
    return Stream.of(Arguments.of());
  }

  public static DesiredCapabilities getCapabilities() {
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
    capabilities.setCapability(MobileCapabilityType.UDID, "73a9ccfb0405");
    capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
    capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "YOUR_APP_PACKAGE");
    capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "YOUR_APP_ACTIVITY");
    capabilities.setCapability(MobileCapabilityType.APP, "APP_FILE_PATH");
    return capabilities;
  }
}
