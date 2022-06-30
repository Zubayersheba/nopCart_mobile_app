package nopcart_mobile_app;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.testproject.addon.JavaAndroidExampleAddon;
import io.testproject.addon.MobileExtensions;
import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.android.AndroidDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import java.lang.Exception;
import java.lang.Override;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


@DisplayName("orderPlaceJourney")
public class orderPlaceJourney implements ExceptionsReporter {
  public static AndroidDriver<? extends MobileElement> driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new AndroidDriver<>("fs7Aqt1fkyX50ldF_72aDAFaxi3wsFJ9fOzUrYAjZc8", getCapabilities(), "Md. Zubayer Alam Shuvo");
  }


  @DisplayName("orderPlaceJourney")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute() throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MobileExtensions.HideKeyboardAndroid hideKeyboardAndroid;
    JavaAndroidExampleAddon.TypeRandomPhoneAction typeRandomPhoneAction;

    // 1. Reset App

    GeneratedUtils.sleep(500);
    driver.resetApp();

    // 2. Click 'Placeholder'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ImageButton");
    driver.findElement(by).click();

    // 3. Click 'ADD TO CART'
    GeneratedUtils.sleep(500);
    by = By.id("com.nopstation.nopcommerce.nopstationcart:id/btnAddToCart");
    driver.findElement(by).click();

    // 4. Click 'Placeholder1'
    GeneratedUtils.sleep(500);
    by = By.id("com.nopstation.nopcommerce.nopstationcart:id/counterIcon");
    driver.findElement(by).click();

    // 5. Click 'CHECKOUT'
    GeneratedUtils.sleep(500);
    by = By.id("com.nopstation.nopcommerce.nopstationcart:id/btnCheckOut");
    driver.findElement(by).click();

    // 6. Click 'Checkout as Guest'
    GeneratedUtils.sleep(500);
    by = By.id("com.nopstation.nopcommerce.nopstationcart:id/btnGuestCheckout");
    driver.findElement(by).click();

    // 7. Click 'First name'
    GeneratedUtils.sleep(500);
    by = By.id("com.nopstation.nopcommerce.nopstationcart:id/etFirstName");
    driver.findElement(by).click();

    // 8. Type 'Mike' in 'First name'
    GeneratedUtils.sleep(500);
    by = By.id("com.nopstation.nopcommerce.nopstationcart:id/etFirstName");
    driver.findElement(by).sendKeys("Mike");

    // 9. Make a Swipe 
    GeneratedUtils.sleep(500);
    (new TouchAction(driver)).press(PointOption.point(438,976))
        				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
        				.moveTo(PointOption.point(433,720)).release().perform();

    // 10. Type 'tyson' in 'Last name'
    GeneratedUtils.sleep(500);
    by = By.id("com.nopstation.nopcommerce.nopstationcart:id/etLastName");
    driver.findElement(by).sendKeys("tyson");

    // 11. Type 'mike@abc.com' in 'Email1'
    GeneratedUtils.sleep(500);
    by = By.id("com.nopstation.nopcommerce.nopstationcart:id/etEmail");
    driver.findElement(by).sendKeys("mike@abc.com");

    // 12. Make a Swipe 
    GeneratedUtils.sleep(500);
    (new TouchAction(driver)).press(PointOption.point(392,889))
        				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
        				.moveTo(PointOption.point(386,674)).release().perform();

    // 13. Click 'Select country'
    GeneratedUtils.sleep(500);
    by = By.id("android:id/text1");
    driver.findElement(by).click();

    // 14. Click 'United States of America'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.TextView[2][@text = 'United States of America']");
    driver.findElement(by).click();

    // 15. Click 'Select state'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.TextView[@text = 'Select state']");
    driver.findElement(by).click();

    // 16. Click 'AA (Armed Forces Americas)'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.TextView[@text = 'AA (Armed Forces Americas)']");
    driver.findElement(by).click();

    // 17. Type 'abc company' in 'Company'
    GeneratedUtils.sleep(500);
    by = By.id("com.nopstation.nopcommerce.nopstationcart:id/etCompanyName");
    driver.findElement(by).sendKeys("abc company");

    // 18. Make a Swipe 
    GeneratedUtils.sleep(500);
    (new TouchAction(driver)).press(PointOption.point(531,886))
        				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
        				.moveTo(PointOption.point(523,723)).release().perform();

    // 19. Type 'dakota' in 'City'
    GeneratedUtils.sleep(500);
    by = By.id("com.nopstation.nopcommerce.nopstationcart:id/etCity");
    driver.findElement(by).sendKeys("dakota");

    // 20. Make a Swipe 
    GeneratedUtils.sleep(500);
    (new TouchAction(driver)).press(PointOption.point(517,964))
        				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
        				.moveTo(PointOption.point(517,813)).release().perform();

    // 21. Type 'dakota town' in 'Street address'
    GeneratedUtils.sleep(500);
    by = By.id("com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress");
    driver.findElement(by).sendKeys("dakota town");

    // 22. Make a Swipe 
    GeneratedUtils.sleep(500);
    (new TouchAction(driver)).press(PointOption.point(424,868))
        				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
        				.moveTo(PointOption.point(421,720)).release().perform();

    // 23. Make a Swipe 
    GeneratedUtils.sleep(500);
    (new TouchAction(driver)).press(PointOption.point(613,836))
        				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
        				.moveTo(PointOption.point(610,688)).release().perform();

    // 24. Make a Swipe 
    GeneratedUtils.sleep(500);
    (new TouchAction(driver)).press(PointOption.point(348,813))
        				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
        				.moveTo(PointOption.point(337,717)).release().perform();

    // 25. Type '1234' in 'Zip / postal code'
    GeneratedUtils.sleep(500);
    by = By.id("com.nopstation.nopcommerce.nopstationcart:id/etZipCode");
    driver.findElement(by).sendKeys("1234");

    // 26. Make a Swipe 
    GeneratedUtils.sleep(500);
    (new TouchAction(driver)).press(PointOption.point(462,897))
        				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
        				.moveTo(PointOption.point(459,720)).release().perform();

    // 27. Run Type Random Phone Number
    GeneratedUtils.sleep(500);
    typeRandomPhoneAction = JavaAndroidExampleAddon.typeRandomPhoneAction("+1",10);
    by = By.id("com.nopstation.nopcommerce.nopstationcart:id/etPhone");
    typeRandomPhoneAction = (JavaAndroidExampleAddon.TypeRandomPhoneAction)((ReportingDriver)driver).addons().execute(typeRandomPhoneAction, by, -1);

    // 28. Make a Swipe 
    GeneratedUtils.sleep(500);
    (new TouchAction(driver)).press(PointOption.point(552,964))
        				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000)))
        				.moveTo(PointOption.point(552,369)).release().perform();

    // 29. Hide keyboard
    GeneratedUtils.sleep(500);
    hideKeyboardAndroid = MobileExtensions.getHideKeyboardAndroid();
    hideKeyboardAndroid = (MobileExtensions.HideKeyboardAndroid)((ReportingDriver)driver).addons().execute(hideKeyboardAndroid);

    // 30. Make a Swipe 
    GeneratedUtils.sleep(500);
    (new TouchAction(driver)).press(PointOption.point(383,1812))
        				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000)))
        				.moveTo(PointOption.point(360,296)).release().perform();

    // 31. Click 'CONTINUE'
    GeneratedUtils.sleep(500);
    by = By.id("com.nopstation.nopcommerce.nopstationcart:id/btnContinue");
    driver.findElement(by).click();

    // 32. Click 'Next Day Air'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.RelativeLayout[3]/android.widget.TextView[1]");
    driver.findElement(by).click();

    // 33. Make a Swipe gesture from ('630','1931') to ('604','232')
    GeneratedUtils.sleep(500);
    (new TouchAction(driver)).press(PointOption.point(630,1931))
        				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
        				.moveTo(PointOption.point(604,232)).release().perform();

    // 34. Make a Swipe 
    GeneratedUtils.sleep(500);
    (new TouchAction(driver)).press(PointOption.point(488,1652))
        				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
        				.moveTo(PointOption.point(465,459)).release().perform();

    // 35. Click 'CONTINUE4'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.FrameLayout/android.widget.RelativeLayout[1]//android.widget.Button[@text = 'CONTINUE']");
    driver.findElement(by).click();

    // 36. Make a Swipe 
    GeneratedUtils.sleep(500);
    (new TouchAction(driver)).press(PointOption.point(589,1867))
        				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000)))
        				.moveTo(PointOption.point(543,499)).release().perform();

    // 37. Make a Swipe 
    GeneratedUtils.sleep(500);
    (new TouchAction(driver)).press(PointOption.point(453,1626))
        				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000)))
        				.moveTo(PointOption.point(453,456)).release().perform();

    // 38. Make a Swipe 
    GeneratedUtils.sleep(500);
    (new TouchAction(driver)).press(PointOption.point(508,1606))
        				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000)))
        				.moveTo(PointOption.point(511,517)).release().perform();

    // 39. Make a Swipe 
    GeneratedUtils.sleep(500);
    (new TouchAction(driver)).press(PointOption.point(444,1896))
        				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
        				.moveTo(PointOption.point(433,273)).release().perform();

    // 40. Click 'Placeholder2'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.RelativeLayout[3]/android.widget.ImageView");
    driver.findElement(by).click();

    // 41. Click 'CONTINUE4'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.FrameLayout/android.widget.RelativeLayout[1]//android.widget.Button[@text = 'CONTINUE']");
    driver.findElement(by).click();

    // 42. Click 'Next'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.Button[@text = 'Next']");
    driver.findElement(by).click();

    // 43. Click 'CONFIRM'
    GeneratedUtils.sleep(500);
    by = By.id("com.nopstation.nopcommerce.nopstationcart:id/checkoutButton");
    driver.findElement(by).click();

    // 44. Does 'Your order has been successfully processed' contain 'Your order has been successfully processed!'?
    GeneratedUtils.sleep(500);
    by = By.id("com.nopstation.nopcommerce.nopstationcart:id/md_text_message");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Your order has been successfully processed!"));

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
