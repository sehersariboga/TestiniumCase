import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openLoginPage(){
        driver.manage().window().maximize();
        driver.get("https://www.gittigidiyor.com/uye-girisi");



    }
    public void searchAKeyword(){
        driver.findElement(By.xpath("/html//header[@id='main-header']/div[3]/div/div/div//form[@action='https://www.gittigidiyor.com/arama']//input[@name='k']")).sendKeys("bilgisayar");
        driver.findElement(By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[2]")).click();


    }
}

