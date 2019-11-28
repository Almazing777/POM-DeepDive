package objectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffLoginPage {

    WebDriver driver;

    public RediffLoginPage(WebDriver driver) {

        this.driver = driver;

    }


    By username = By.xpath(".//*[@id='login1']");
    By password = By.name("passwd");
    By go = By.name("proceed");

    public WebElement EmailID(){
        return driver.findElement(username);
    }

    public WebElement Password(){
        return driver.findElement(password);
    }

}
