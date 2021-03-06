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
public class RegisterokexecuteslowerTest {
 
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    // System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
    // System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

    /* 
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.setHeadless(true);
    driver = new ChromeDriver(chromeOptions); 
    
    */
    
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
  public void registerokexecuteslower() {
    driver.get("https://facey-a2397.web.app//home");
    try {
      Thread.sleep(3000);
  } catch (InterruptedException e) {
    e.printStackTrace();
}
    driver.manage().window().setSize(new Dimension(1294, 1400));
    try {
      Thread.sleep(3000);
  } catch (InterruptedException e) {
    e.printStackTrace();
}
    driver.findElement(By.cssSelector(".v-overlay__scrim")).click();
    try {
      Thread.sleep(3000);
  } catch (InterruptedException e) {
    e.printStackTrace();
}
    {
      WebElement element = driver.findElement(By.cssSelector(".success:nth-child(4) > .v-btn__content"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    try {
      Thread.sleep(3000);
  } catch (InterruptedException e) {
    e.printStackTrace();
}
    driver.findElement(By.cssSelector(".success:nth-child(4) > .v-btn__content")).click();
    try {
      Thread.sleep(3000);
  } catch (InterruptedException e) {
    e.printStackTrace();
}
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    try {
      Thread.sleep(3000);
  } catch (InterruptedException e) {
    e.printStackTrace();
}
    driver.findElement(By.cssSelector(".v-card__text:nth-child(5) > .v-btn")).click();
    try {
      Thread.sleep(3000);
  } catch (InterruptedException e) {
    e.printStackTrace();
}
    vars.put("emailrandom", js.executeScript("return \"ual-\" + Math.floor(Math.random()*1500000)+\"@ual.es\""));
    try {
      Thread.sleep(3000);
  } catch (InterruptedException e) {
    e.printStackTrace();
}
    System.out.println(vars.get("emailrandom").toString());
    try {
      Thread.sleep(3000);
  } catch (InterruptedException e) {
    e.printStackTrace();
}
    driver.findElement(By.cssSelector(".v-card__text:nth-child(6) .v-btn__content")).click();
    try {
      Thread.sleep(3000);
  } catch (InterruptedException e) {
    e.printStackTrace();
}
    driver.findElement(By.id("email")).click();
    try {
      Thread.sleep(3000);
  } catch (InterruptedException e) {
    e.printStackTrace();
}
    driver.findElement(By.id("email")).sendKeys(vars.get("emailrandom").toString());
    try {
      Thread.sleep(3000);
  } catch (InterruptedException e) {
    e.printStackTrace();
}
    driver.findElement(By.id("password")).click();
    try {
      Thread.sleep(3000);
  } catch (InterruptedException e) {
    e.printStackTrace();
}
    driver.findElement(By.id("password")).sendKeys("123456");
    try {
      Thread.sleep(3000);
  } catch (InterruptedException e) {
    e.printStackTrace();
}
    driver.findElement(By.id("name")).click();
    try {
      Thread.sleep(3000);
  } catch (InterruptedException e) {
    e.printStackTrace();
}
    driver.findElement(By.id("name")).sendKeys(vars.get("emailrandom").toString());
    try {
      Thread.sleep(3000);
  } catch (InterruptedException e) {
    e.printStackTrace();
}
    driver.findElement(By.cssSelector(".yellow > .v-btn__content")).click();
    try {
      Thread.sleep(3000);
  } catch (InterruptedException e) {
    e.printStackTrace();
}
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#conocimientos > .v-btn__content")));
    }
    try {
      Thread.sleep(3000);
  } catch (InterruptedException e) {
    e.printStackTrace();
}
    {
      List<WebElement> elements = driver.findElements(By.id("conocimientos"));
      assert(elements.size() > 0);
   }
   try {
    Thread.sleep(3000);
} catch (InterruptedException e) {
  e.printStackTrace();
}
    driver.findElement(By.cssSelector("img")).click();
    try {
      Thread.sleep(3000);
  } catch (InterruptedException e) {
    e.printStackTrace();
}
    {
      String value = driver.findElement(By.id("email-profile")).getAttribute("value");
      assertThat(value, is(vars.get("emailrandom").toString()));
    }
  }
}
