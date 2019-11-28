package TestCases;

import objectrepo.RediffLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginApplication {
    @Test
    public void Login(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        RediffLoginPage rd = new RediffLoginPage(driver);

        rd.EmailID().sendKeys("hello");
        rd.Password().sendKeys("password");

    }
}
