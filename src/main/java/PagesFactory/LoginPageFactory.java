package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    public  LoginPage(WebDriver driver){
        this.driver = driver;
    }
    By username= By.id("username");
    By password= By.id("password");
    By submitButton=By.xpath("//button[@type='submit']");

    public void setUsername(String userName){
        driver.findElement(username).sendKeys(userName);
    }
    public void setPassword(String PassWord){
        driver.findElement(password).sendKeys(PassWord);
    }
    public void setSubmitButton(){
        driver.findElement(submitButton).click();
    }

}
