//package <set your test package>;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.junit.*;
import java.net.URL;
import java.net.MalformedURLException;

public class LibraryTest {
 private String reportDirectory = "reports";
 private String reportFormat = "xml";
 private String testName = "Untitled";
 protected AndroidDriver<AndroidElement> driver = null;

 DesiredCapabilities dc = new DesiredCapabilities();
 
 @Before
 public void setUp() throws MalformedURLException {
  dc.setCapability("reportDirectory", reportDirectory);
  dc.setCapability("reportFormat", reportFormat);
  dc.setCapability("testName", testName);
  dc.setCapability(MobileCapabilityType.UDID, "dcd9165c1e96");
  dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "ticketnew.android.ui");
  dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".activity.SplashActivity");
  driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
 }
 
 @Test
 public void testUntitled() {
  driver.findElement(By.xpath("//*[@class='android.widget.LinearLayout']")).click();
  driver.findElement(By.xpath("//*[@class='android.widget.LinearLayout' and ./*[@id='textSpacerNoTitle']]")).click();
  driver.findElement(By.xpath("//*[@resource-id='android:id/button2']")).click();	 
  driver.findElement(By.xpath("//*[@text='Book' and ./parent::*[./preceding-sibling::*[./*[@text='Agnyaathavaasi (Prince in exile)']]]]")).click();
  driver.findElement(By.xpath("(//*[@class='android.widget.LinearLayout' and ./parent::*[@id='tab_layout']]/*[@class='android.support.v7.app.ActionBar$Tab'])[5]")).click();
  driver.findElement(By.xpath("(//*[@id='flexboxlayout']/*[@text and @width>0])[4]")).click();
  driver.findElement(By.xpath("//*[@text='I Accept']")).click();
  driver.swipe(356, 541, 312, 939, 374);
  driver.findElement(By.xpath("//*[@text='Facebook']")).click();
  new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='seat_table']")));
  driver.findElement(By.xpath("//*[@id='seat_table']")).click();
  driver.findElement(By.xpath("//*[@id='seat_table']")).click();
  driver.findElement(By.xpath("//*[@id='seat_table']")).click();
  driver.findElement(By.xpath("//*[@id='seat_table']")).click();
  driver.findElement(By.xpath("//*[@id='seat_table']")).click();
  driver.swipe(318, 522, 316, 556, 16);
  driver.swipe(647, 660, 293, 670, 253);
  new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='seat_table']")));
  driver.findElement(By.xpath("//*[@id='seat_table']")).click();
  driver.findElement(By.xpath("//*[@text='Continue']")).click();
  driver.findElement(By.xpath("//*[@resource-id='ticketnew.android.ui:id/titlebar_title']")).click();
  driver.findElement(By.xpath("//*[@text='Continue']")).click();
  driver.findElement(By.xpath("//*[@resource-id='ticketnew.android.ui:id/titlebar_title']")).click();
  driver.findElement(By.xpath("(//*[@contentDescription='Payment Gateway']/*[@class='android.widget.RadioButton'])[2]")).click();
  driver.findElement(By.xpath("//*[@class='android.view.View']")).click();
  new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@contentDescription='Payment Gateway']/*[@class='android.widget.RadioButton'])[2]")));
  driver.findElement(By.xpath("(//*[@contentDescription='Payment Gateway']/*[@class='android.widget.RadioButton'])[2]")).click();
  driver.getKeyboard().sendKeys("{BKSP}");
  new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='android.view.View' and ./parent::*[@class='android.webkit.WebView']]/*[@class='android.widget.EditText'])[1]")));
  driver.getKeyboard().sendKeys("{BKSP}");
  driver.findElement(By.xpath("(//*[@class='android.view.View' and ./parent::*[@class='android.webkit.WebView']]/*[@class='android.widget.EditText'])[1]")).sendKeys("9789900518");
  new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='android.view.View' and ./parent::*[@class='android.webkit.WebView']]/*[@class='android.widget.EditText'])[2]")));
  driver.findElement(By.xpath("(//*[@class='android.view.View' and ./parent::*[@class='android.webkit.WebView']]/*[@class='android.widget.EditText'])[2]")).sendKeys("Srinu123!");
  new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@contentDescription='Submit']")));
  driver.pressKeyCode(AndroidKeyCode.BACK);
  driver.findElement(By.xpath("//*[@contentDescription='Submit']")).click();
  /*driver.findElement(By.xpath("//*[@class='android.widget.Button']")).click();*/
  driver.findElement(By.xpath("//*[@resource-id='ticketnew.android.ui:id/titlebar_title']")).click();
  driver.findElement(By.xpath("//*[@resource-id='ticketnew.android.ui:id/titlebar_title']")).click();
  driver.pressKeyCode(AndroidKeyCode.HOME);
  driver.findElement(By.xpath("//*[@text='Gmail']")).click();
  driver.swipe(324, 377, 345, 958, 321);
  driver.findElement(By.xpath("//*[@resource-id='com.google.android.gm:id/mail_toolbar']")).click();
  driver.findElement(By.xpath("//*[@class='android.widget.ImageView']")).click();
  /*driver.swipe(324, 377, 345, 958, 321);
  driver.findElement(By.xpath("//*[@resource-id='com.google.android.gm:id/conversation_tip_text']")).click();
  driver.findElement(By.xpath("//*[@contentDescription='support about Booking Success, Dear Customer, Your ticket(s) are Confirmed! Hello Telugu2DU 09:30 PM,Thu,28 ... at 19:10, conversation unread']")).click();
  /*new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@contentDescription='support about Booking Success, Balcony | C12 ZZYFDWKR 2747138/170783378 on Dec 26, conversation read']")));
  driver.findElement(By.xpath("//*[@contentDescription='support about Booking Success, Balcony | C12 ZZYFDWKR 2747138/170783378 on Dec 26, conversation read']")).click();
  driver.pressKeyCode(AndroidKeyCode.HOME);
  driver.findElement(By.xpath("//*[@text='Gmail']")).click();*/
  /*driver.findElement(By.xpath("//*[@class='android.widget.FrameLayout' and ./*[@contentDescription='support about Booking Success, Dear Customer, Your ticket(s) are Confirmed!, MCA (Middle Class Abbayi) Telugu... at 10:52 , conversation unread']]")).click();*/
  driver.findElement(By.xpath("//*[@bounds='[0,162][720,337]']")).click();
  driver.swipe(397, 1202, 358, 495, 351);
  driver.swipe(93, 564, 514, 541, 386);
  driver.swipe(279, 229, 287, 606, 602);
  driver.findElement(By.xpath("//*[@contentDescription='Navigate up']")).click();
  driver.pressKeyCode(AndroidKeyCode.HOME);
 }
 
 @After
 public void tearDown() {
     driver.quit();
 }
}