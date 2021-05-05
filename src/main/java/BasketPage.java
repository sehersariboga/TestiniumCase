import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage {
    WebDriver driver ;

    public BasketPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getBasketPrice(){
        String text2 = driver.findElement(By.cssSelector(".total-price")).getText();
        System.out.println(text2);
        return text2;
    }
    public void changeQuantity(){
        driver.findElement(By.xpath("/html//div[@id='cart-items-container']/div//select[@class='amount']")).click();
        driver.findElement(By.xpath("//div[@class='products-container']/div/div//select[@class='amount']/option[@value='2']")).click();
        driver.findElement(By.xpath("//*[@id=\"submit-cart\"]/div/div[2]")).click();

    }
    public void deleteBasket(){
        driver.findElement(By.cssSelector(".gg-icon-bin-medium")).click();

    }
}
