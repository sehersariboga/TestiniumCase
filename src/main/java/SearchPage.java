import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SearchPage {

    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void chooseAProduct(){


        driver.findElement(By.xpath("//*[@id=\"item-info-block-687391761\"]/p")).click();


    }
    public void goSecondPage(){

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0,8000)");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div[6]/div/img[1]")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/a")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("a[href*='/arama/?k=bilgisayar&sf=2']")).click();
    }
}
