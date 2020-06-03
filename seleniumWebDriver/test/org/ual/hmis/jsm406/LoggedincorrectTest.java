
// Generated by Selenium IDE
package org.ual.hmis.jsm406;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class LoggedincorrectTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    // System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
    // System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

    /* ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.setHeadless(true);
    driver = new ChromeDriver(chromeOptions); */

    FirefoxOptions firefoxOptions = new FirefoxOptions();
    firefoxOptions.setHeadless(true);
    driver = new FirefoxDriver(firefoxOptions);
    
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void loggedincorrect1() {
    driver.get("https://facey-a2397.web.app/home");
    try {
      Thread.sleep(3000);
  } catch (InterruptedException e) {
      e.printStackTrace();
  }

    driver.findElement(By.xpath("//div[@id=\'app\']/div/div")).click();
    try {
      Thread.sleep(1000);
  } catch (InterruptedException e) {
      e.printStackTrace();
  }

    driver.findElement(By.xpath("//div[@id=\'app\']/div/header/div/a/span")).click();
    try {
      Thread.sleep(1000);
  } catch (InterruptedException e) {
      e.printStackTrace();
  }

    /* {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }*/
     try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(By.xpath("//input[@id=\'email\']")).click();
    try {
      Thread.sleep(1000);
  } catch (InterruptedException e) {
      e.printStackTrace();
  }

    driver.findElement(By.xpath("//input[@id=\'email\']")).sendKeys("ual-446221@ual.es");
    try {
      Thread.sleep(1000);
  } catch (InterruptedException e) {
      e.printStackTrace();
  }

    driver.findElement(By.xpath("//input[@id=\'password\']")).sendKeys("12345");
    try {
      Thread.sleep(1000);
  } catch (InterruptedException e) {
      e.printStackTrace();
  }

    driver.findElement(By.xpath("//button[@id=\'loginButton\']")).click();
    try {
      Thread.sleep(2000);
  } catch (InterruptedException e) {
      e.printStackTrace();
  }

  assertThat(driver.findElement(By.xpath("//strong")).getText(), is("The password is invalid or the user does not have a password."));
}
}
