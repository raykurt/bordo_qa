package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AutomationPracticeHome {

    public AutomationPracticeHome(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='login']")
    public WebElement signInButton;

    @FindBy(id = "email_create")
    public WebElement emailAddressTextBox;

    @FindBy(id = "SubmitCreate")
    public WebElement submitCreateAnAccountButton;

    @FindBy(xpath = "//a[@class='logout']")
    public WebElement signOutHomePageButton;

    @FindBy(xpath = "//a[@class='login']")
    public List<WebElement> signInList;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement registerEmailBox;

    @FindBy(xpath = "//input[@data-validate='isPasswd']")
    public WebElement registerPasswordBox;

    @FindBy(id = "SubmitLogin")
    public WebElement submitSignInButton;

    @FindBy(xpath = "(//a[@title='Dresses'])[2]")
    public WebElement dressesHomePage;

    @FindBy(xpath = "(//a[@title='Summer Dresses'])[2]")
    public WebElement summerDressesHomePage;

    @FindBy(id = "search_query_top")
    public WebElement searchBar;

    @FindBy(xpath = "//div[@class='shopping_cart']")
    public WebElement cartHomePageElement;

    @FindBy(id = "button_order_cart")
    public WebElement checkOutButtonInCart;

    @FindBy(xpath = "//a[@class='account']")
    public WebElement accountButtonHome;


}
