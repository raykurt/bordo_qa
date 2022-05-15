package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class AutomationPracticeProduct {

    public AutomationPracticeProduct(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@class='product-name'])[3]")
    public WebElement summerDressesUrun;

    @FindBy(xpath = "//h1")
    public WebElement urunAdiBasligi;

    @FindBy(id = "color_8")
    public WebElement urunBeyazRenkSecenegi;

    @FindBy(id = "our_price_display")
    public WebElement urunFiyatBilgisi;

    @FindBy(id = "add_to_cart")
    public WebElement urunuSepeteEkleButonu;

    @FindBy(xpath = "(//a[@class='product-name'])[12]")
    public WebElement summerAranilanUrun;

    @FindBy(id = "color_15")
    public WebElement urunYesilRenkSecenegi;

}
