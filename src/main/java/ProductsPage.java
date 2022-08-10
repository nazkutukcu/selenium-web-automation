import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage{

    By optionsLocator = By.cssSelector(".ribbon-text");
    By productNameLocator= By.cssSelector(".product-cr");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisPlayed(optionsLocator);
    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();

    }
    private List<WebElement> getAllProducts(){
        return findAll(productNameLocator);
    }
}
