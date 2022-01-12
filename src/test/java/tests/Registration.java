package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Registration {
    WebDriver wd;

    @BeforeMethod
        public void preconditions(){
        wd= new ChromeDriver();
        wd.manage().window().maximize();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
    }

    @Test
    public void registrationSuccessTest(){
    //open form
        click(By.cssSelector("[href='/login']"));
        //fill email
        click(By.cssSelector("[placeholder='Email']"));
        wd.findElement(By.cssSelector("[placeholder='Email']")).clear();
        wd.findElement(By.cssSelector("[placeholder='Email']")).sendKeys("noa@gmail.com");
    //fill password
    //confirm registration-click registration button
        click(By.cssSelector("//button[text()= ' Registration']"));
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }


    @AfterMethod
        public void postconditions(){
        wd.close();
        wd.quit();
    }

}
