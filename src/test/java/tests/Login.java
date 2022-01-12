package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Login extends TestBase{

    @Test
    public void loginSuccessTest(){
        //open form
        click(By.cssSelector("[href='/login']"));
        //fill email
        type(By.cssSelector("[placeholder='Email']"), "noa@gmail.com");
        //fill password
        type(By.cssSelector("[placeholder='Password']"),"Nnoa12345$");
        //confirm registration-click registration button
        click(By.xpath("//button[1]"));
        click(By.xpath("//button[text()= ' Login']"));
    }
}
