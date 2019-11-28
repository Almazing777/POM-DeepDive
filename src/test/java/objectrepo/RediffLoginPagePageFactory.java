package objectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePageFactory {

    WebDriver driver;

    public RediffLoginPagePageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    By username = By.xpath(".//*[@id='login1']");
    By password = By.name("passwd");
    By go = By.name("proceed");
    By home = By.linkText("Home");

//    @FindBy(xpath=".//*[@id='login1']")
//    WebElement username;
//
//    @FindBy(name="passwd")
//    WebElement password;
//
//    @FindBy(name="proceed")
//    WebElement go;
//
//    @FindBy(linkText="Home")
//    WebElement home;


    public WebElement emailID(){
        return driver.findElement(username);
    }

    public WebElement password(){
        return driver.findElement(password);
    }

    public WebElement submit(){
        return driver.findElement(go);
    }

    public WebElement home(){
        return driver.findElement(home);
    }

}
