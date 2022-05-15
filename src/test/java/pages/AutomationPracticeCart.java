package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AutomationPracticeCart {

    public AutomationPracticeCart(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="summary_products_quantity")
    public WebElement numberOfProduct;

    @FindBy(xpath = "//td[@class='cart_description']/p/a")
    public List<WebElement> productNamesInCart;

    @FindBy(xpath = "//td[@class='cart_total']/span")
    public List<WebElement> productPricesInCart;

    @FindBy(xpath = "//td[@class='cart_description']/small/a")
    public List<WebElement> productColorInCart;

    @FindBy(xpath = "//span[text()='Proceed to checkout']")
    public WebElement proceedToCheckoutButton;

}
