
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    SearchBox searchBox;

    By cartCountLocator = By.id("cart-items");
    By cartContainerLocator = By.id("cart");
    By sepeteGit = By.id("js-cart");
    By acceptCookiesLocator = By.id("sp-cc-accept");


    public HomePage(WebDriver driver) {

        super(driver);
        searchBox = new SearchBox(driver);
    }


    public SearchBox searchBox() {
        return this.searchBox;
    }

    public boolean isProductCountUp() {

        return getCartCount() > 0;
    }

    public void goToCart() {
        click(cartContainerLocator);
        waitBySeconds(1);
        click(sepeteGit);
    }

    private int getCartCount() {
            String count = find(cartCountLocator).getText();
            try {
                return Integer.parseInt(count);
            }
            catch (NumberFormatException ex){
                return 0;
            }
        }

    public void acceptCookies(){
        if(isDisPlayed(acceptCookiesLocator)){
            click(acceptCookiesLocator);
        }
    }


}