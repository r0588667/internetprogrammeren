/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author LW
 */
public class AddMovieTest {
    
}
/*
    private WebDriver driver;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver"
                ,"C:\\Users\\LW\\Documents\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/ipdemo/movie/movieForm.htm");
        this.loginCorrectly();
    }
    @Test
    public void test_if_added_when_form_is_filled_in_correctly() throws Exception {
        fillInCorrectly();
        WebElement title = driver.findElement(By.tagName("title"));
        Assert.assertEquals("Overzicht Films",title.getText());
    }
    
    @After
    public void tearDown(){
       this.removeMovie();
       driver.close();
    }
    private void fillInCorrectly(){
        driver.findElement(By.id("id")).clear();
        driver.findElement(By.id("id")).sendKeys("77");
        driver.findElement(By.id("name")).sendKeys("The Usual Suspects");
        driver.findElement(By.id("genre")).sendKeys("Thriller");
        driver.findElement(By.id("rating")).clear();
        driver.findElement(By.id("rating")).sendKeys("8.2");
        driver.findElement(By.id("submit")).click();
    }
    private void loginCorrectly(){
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("r0588667");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Jonlajoie1");
        driver.findElement(By.id("submitbutton")).click();
    }
    private void removeMovie(){
        driver.findElement(By.cssSelector("#movieInfo > td:nth-child(5) > a")).click();
    }
}
*/