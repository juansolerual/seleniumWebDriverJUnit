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
public class EmailNotCorrectTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
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
  public void emailNotCorrect() {
    driver.get("https://facey-a2397.web.app//home");
    driver.manage().window().setSize(new Dimension(1294, 1400));
    driver.findElement(By.cssSelector(".v-overlay__scrim")).click();
    driver.findElement(By.cssSelector(".v-overlay__scrim")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".success:nth-child(4) > .v-btn__content"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".v-toolbar__content > #loginButton > .v-btn__content")).click();
    vars.put("emailrandom", js.executeScript("return \"ual-\" + Math.floor(Math.random()*1500000)+\"@ual.es\""));
    System.out.println(vars.get("emailrandom").toString());
    driver.findElement(By.cssSelector(".v-card__text:nth-child(6) .v-btn__content")).click();
    driver.findElement(By.xpath("//input[@id=\'email\']")).sendKeys("prueba.es");
    driver.findElement(By.xpath("//input[@id=\'password\']")).sendKeys("123456");
    driver.findElement(By.xpath("//input[@id=\'name\']")).sendKeys(vars.get("emailrandom").toString());
    driver.findElement(By.cssSelector(".yellow > .v-btn__content")).click();
    assertThat(driver.findElement(By.cssSelector("strong")).getText(), is("The email address is badly formatted."));
    assertThat(driver.findElement(By.cssSelector("strong")).getText(), is("The email address is badly formatted."));
  }
}
