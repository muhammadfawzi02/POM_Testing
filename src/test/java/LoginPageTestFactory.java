import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest {
    WebDriver driver;
    LoginPage loginPageObject ;
    @BeforeMethod
    public void setDriver(){
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");
    }
    @Test
    public void validLogin(){
        loginPageObject=new LoginPage(driver);
        loginPageObject.setUsername("tomsmith");
        loginPageObject.setPassword("SuperSecretPassword!");
        loginPageObject.setSubmitButton();
        Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/secure");
    }
    @Test
    public void invalidLogin(){
        loginPageObject=new LoginPage(driver);
        loginPageObject.setUsername("Mohamed");
        loginPageObject.setPassword("1234!");
        loginPageObject.setSubmitButton();
        Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/login");
    }
    @AfterMethod
    public void quit(){
        driver.quit();
    }


}
