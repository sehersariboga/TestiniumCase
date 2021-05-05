import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddBasketButton(){
        driver.findElement(By.xpath("//*[@id=\"add-to-basket\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"header_wrapper\"]/div[4]/div[3]/a")).click();
    }
    public String getProductPrice(){
        String text = driver.findElement(By.id("sp-price-highPrice")).getText();

        System.out.println(text);
        return text;
    }
}
