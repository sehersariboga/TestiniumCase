import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(){
        driver.findElement(By.xpath("//*[@id=\"L-UserNameField\"]")).sendKeys("sebahsal@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"L-PasswordField\"]")).sendKeys("S12345");
        driver.findElement(By.xpath("//*[@id=\"gg-login-enter\"]")).click();
    }
}
