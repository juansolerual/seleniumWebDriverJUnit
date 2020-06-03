package org.ual.hmis.jsm406;

import org.junit.Test;
import org.junit.experimental.categories.Category;
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

public class EditProfileTest {
  private WebDriver driverFirefox;
  private WebDriver driverChrome;
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor jsFirefox;
  JavascriptExecutor jsChrome;
  JavascriptExecutor js;


  @Before
  public void setUp() {
    FirefoxOptions firefoxOptions = new FirefoxOptions();
    firefoxOptions.setHeadless(true);
    driverFirefox = new FirefoxDriver(firefoxOptions);

    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.setHeadless(true);
    driverChrome = new ChromeDriver(chromeOptions);


    jsFirefox = (JavascriptExecutor) driverFirefox;
    jsChrome = (JavascriptExecutor) driverChrome;
    
    vars = new HashMap<String, Object>();
  }

  @After
  public void tearDown() {
    driverFirefox.quit();
    driverChrome.quit();
  }

  @Test
  @Category({Categories.ChromeTests.class})
  public void editProfile() {
    driver = driverChrome;
    js = jsChrome;
    try {
      Thread.sleep(2000);
  } catch (InterruptedException e) {
      e.printStackTrace();
  }
    driver.get("https://facey-a2397.web.app/home");
    try {
      Thread.sleep(4000);
  } catch (InterruptedException e) {
      e.printStackTrace();
  }
    vars.put("nombrerandom", js.executeScript("return \"nombre_\" + Math.floor(Math.random()*1500000)"));
    vars.put("apellidorandom", js.executeScript("return \"apellido_\" + Math.floor(Math.random()*1500000)"));
    System.out.println(vars.get("nombrerandom").toString());
    System.out.println(vars.get("apellidorandom").toString());
    try {
      Thread.sleep(4000);
  } catch (InterruptedException e) {
      e.printStackTrace();
  }
    driver.findElement(By.xpath("//div[@id=\'app\']/div/div")).click();
    System.out.println("2");
    try {
      Thread.sleep(4000);
  } catch (InterruptedException e) {
      e.printStackTrace();
  }
    driver.findElement(By.xpath("//div[@id=\'app\']/div/header/div/a/span")).click();
    System.out.println("3");

    try {
      Thread.sleep(4000);
  } catch (InterruptedException e) {
      e.printStackTrace();
  }
    /* {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }*/

    
    driver.findElement(By.xpath("//input[@id=\'email\']")).sendKeys("ual-446221@ual.es");
    System.out.println("4");

    driver.findElement(By.xpath("//input[@id=\'password\']")).sendKeys("123456");
    System.out.println("5");

    driver.findElement(By.xpath("//button[@id=\'loginButton\']")).click();
    System.out.println("6");

    try {
      Thread.sleep(4000);
  } catch (InterruptedException e) {
      e.printStackTrace();
  }
    driver.findElement(By.xpath("//button[@id=\'drawer\']")).click();
    System.out.println("7");

    driver.findElement(By.cssSelector(".v-avatar > img")).click();
    System.out.println("8");

    try {
      Thread.sleep(4000);
  } catch (InterruptedException e) {
      e.printStackTrace();
  }
    {
      String value = driver.findElement(By.xpath("//input[@id=\'email-profile\']")).getAttribute("value");
      System.out.println("9");

      assertThat(value, is("ual-446221@ual.es"));
      System.out.println("10");

    }
    driver.findElement(By.xpath("//input[@id=\'email-nombre\']")).sendKeys(vars.get("nombrerandom").toString());
    System.out.println("11");

    driver.findElement(By.xpath("//input[@id=\'email-apellidos\']")).sendKeys(vars.get("apellidorandom").toString());
    System.out.println("12");

    driver.findElement(By.cssSelector(".blue > .v-btn__content")).click();
    System.out.println("13");

    try {
      Thread.sleep(4000);
  } catch (InterruptedException e) {
      e.printStackTrace();
  }
    driver.get("https://facey-a2397.web.app/perfil");
    System.out.println("14");

    try {
      Thread.sleep(4000);
  } catch (InterruptedException e) {
      e.printStackTrace();
  }
    driver.findElement(By.cssSelector(".v-avatar > img")).click();
    System.out.println("15");

    try {
      Thread.sleep(4000);
  } catch (InterruptedException e) {
      e.printStackTrace();
  }
    {
      String value = driver.findElement(By.xpath("//input[@id=\'email-profile\']")).getAttribute("value");
      System.out.println("16");

      assertThat(value, is("ual-446221@ual.es"));
      System.out.println("17");

    }
    {
      String value = driver.findElement(By.xpath("//input[@id=\'email-nombre\']")).getAttribute("value");
      System.out.println("17");

      assertThat(value, is(vars.get("nombrerandom").toString()));
      System.out.println("18");

    }
    {
      String value = driver.findElement(By.xpath("//input[@id=\'email-apellidos\']")).getAttribute("value");
      System.out.println("19");

      assertThat(value, is(vars.get("apellidorandom").toString()));
      System.out.println("20");

    }
  }
}
