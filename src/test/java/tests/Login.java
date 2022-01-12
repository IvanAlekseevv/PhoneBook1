package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
    WebDriver wd;

    @BeforeMethod
    public void preconditions(){
    wd= new ChromeDriver();
    wd.manage().window().maximize();
    wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
    }

    @Test
    public void loginSuccessTest(){

    }

    @AfterMethod
    public void postconditions(){
        wd.close();
        wd.quit();
    }
}
