import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UiTest extends BaseTest{


    @Test
    public void test() {

        //anasayfanın açıldığının kontrolü
        Assert.assertEquals(driver.getTitle(),"GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi");

        HomePage homePage = new HomePage(driver);
        homePage.openLoginPage();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();

        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div[1]/div[3]/div/div[1]/div/div[1]"));
        actions.moveToElement(element).perform();

        //login işlem kontrolü
        boolean cart = driver.findElement(By.cssSelector(".sc-84am1q-0")).isEnabled();
        Assert.assertTrue(cart);


        homePage.searchAKeyword();


        SearchPage searchPage = new SearchPage(driver);
        searchPage.goSecondPage();

        //İkinci sayfanın açıldığının kontrolü
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2");
        searchPage.chooseAProduct();


        ProductPage productPage = new ProductPage(driver);
        String text = productPage.getProductPrice();
        productPage.clickAddBasketButton();

        BasketPage basketPage = new BasketPage(driver);
        String text2 = basketPage.getBasketPrice();
        Assert.assertEquals(text, text2);

        basketPage.changeQuantity();
        String text3 = driver.findElement(By.xpath("//div[@class='products-container']/div/div//select[@class='amount']/option[@value='2']")).getText();

        //Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğunun kontrolü
        Assert.assertEquals(text3,"2");
        basketPage.deleteBasket();


        //Sepetin boş olduğunun kontrolü
        boolean icon = driver.findElement(By.cssSelector(".gg-icon-cart")).isEnabled();
        Assert.assertTrue(icon);


    }
}
