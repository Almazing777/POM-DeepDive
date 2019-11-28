package TestCases;

import objectrepo.RediffHomePage;
import objectrepo.RediffLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginApplication {

    @Test
    public void login(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        RediffLoginPage rd = new RediffLoginPage(driver);

        rd.emailID().sendKeys("hello");
        rd.password().sendKeys("password");
        rd.submit().click();
        rd.home().click();

        RediffHomePage rh = new RediffHomePage(driver);
        rh.search().sendKeys("rediff");
        rh.submit().click();
    }
}
