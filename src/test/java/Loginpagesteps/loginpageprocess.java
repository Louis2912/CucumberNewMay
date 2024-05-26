package Loginpagesteps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class loginpageprocess {

    public WebDriver driver;

    @Given("user launching to the browser")
    public void user_launching_to_the_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @When("user opens the URL {string}")
    public void user_opens_the_url(String url) {
        driver.get(url);
    }
    @When("check the login page showing or not")
    public void check_the_login_page_showing_or_not() {
        String pgurl = driver.getCurrentUrl();
        Assert.assertEquals(pgurl, "https://rahulshettyacademy.com/locatorspractice/#");
    }
    @Then("close the browser")
    public void close_the_browser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    @When("Enter username {string}")
    public void enter_username(String usname) throws InterruptedException {
        driver.findElement(By.id("inputUsername")).sendKeys(usname);
        Thread.sleep(5000);
    }
    @Then("Enter Password {string}")
    public void enter_password(String pwd) throws InterruptedException {
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);

    }
    @Then("check logged in or not")
    public void check_logged_in_or_not() {
        String link = driver.getCurrentUrl();
        Assert.assertEquals(link, "https://rahulshettyacademy.com/locatorspractice/#");

    }
    @Then("click login")
    public void click_login() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }



}
