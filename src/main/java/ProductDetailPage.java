import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {

    By addToCartButtonLocator= By.id("button-cart");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean inProductDetailPage(){
    return isDisPlayed(addToCartButtonLocator);
    }

    public void addToCart(){
    click(addToCartButtonLocator);
    }
}
