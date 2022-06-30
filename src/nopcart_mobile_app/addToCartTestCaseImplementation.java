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


@DisplayName("addToCart")
public class Checkout implements ExceptionsReporter {
  public static AndroidDriver<? extends MobileElement> driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new AndroidDriver<>("fs7Aqt1fkyX50ldF_72aDAFaxi3wsFJ9fOzUrYAjZc8", getCapabilities(), "Md. Zubayer Alam Shuvo");
  }

  @DisplayName("checkout")
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

    // 2. Click 'NopStation Cart'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.ImageButton[@content-desc = 'NopStation Cart']");
    driver.findElement(by).click();

    // 3. Click 'Electronics'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.TextView[@text = 'Electronics']");
    driver.findElement(by).click();

    // 4. Make a Swipe gesture
    GeneratedUtils.sleep(500);
    (new TouchAction(driver)).press(PointOption.point(502,1475))
        				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(10000)))
        				.moveTo(PointOption.point(505,1127)).release().perform();

    // 5. Make a Swipe
    GeneratedUtils.sleep(500);
    (new TouchAction(driver)).press(PointOption.point(537,1681))
        				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
        				.moveTo(PointOption.point(531,938)).release().perform();

    // 6. Make a Swipe 
    GeneratedUtils.sleep(500);
    (new TouchAction(driver)).press(PointOption.point(531,1678))
        				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
        				.moveTo(PointOption.point(531,1074)).release().perform();

    // 7. Make a Swipe 
    GeneratedUtils.sleep(500);
    (new TouchAction(driver)).press(PointOption.point(531,1074))
        				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
        				.moveTo(PointOption.point(540,1490)).release().perform();

    // 8. Click 'nokialumia'
    GeneratedUtils.sleep(500);
    by = By.xpath("//androidx.drawerlayout.widget.DrawerLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.FrameLayout[1]//android.widget.ImageView[1]");
    driver.findElement(by).click();

    // 9. Make a Swipe 
    GeneratedUtils.sleep(500);
    (new TouchAction(driver)).press(PointOption.point(505,1626))
        				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(10000)))
        				.moveTo(PointOption.point(497,1176)).release().perform();

    // 10. Click 'Small'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.TextView[@text = 'Small']");
    driver.findElement(by).click();

    // 11. Click 'Large'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.RadioButton[@text = 'Large ']");
    driver.findElement(by).click();

    // 12. Click 'Done'
    GeneratedUtils.sleep(500);
    by = By.id("com.nopstation.nopcommerce.nopstationcart:id/tvDone");
    driver.findElement(by).click();

    // 13. Click '+'
    GeneratedUtils.sleep(500);
    by = By.id("com.nopstation.nopcommerce.nopstationcart:id/btnPlus");
    driver.findElement(by).click();

    // 14. Click 'ADD TO CART'
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