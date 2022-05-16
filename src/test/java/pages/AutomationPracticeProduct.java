package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class AutomationPracticeProduct {

    public AutomationPracticeProduct(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div[@class='right-block']/h5/a)[2]")
    public WebElement summerDressesUrun;

    @FindBy(xpath = "//h1")
    public WebElement urunAdiBasligi;

    @FindBy(id = "color_8")
    public WebElement urunBeyazRenkSecenegi;

    @FindBy(id = "our_price_display")
    public WebElement urunFiyatBilgisi;

    @FindBy(id = "add_to_cart")
    public WebElement urunuSepeteEkleButonu;

    @FindBy(xpath = "(//div[@class='right-block']/h5/a)[3]")
    public WebElement summerAranilanUrun;

    @FindBy(id = "color_15")
    public WebElement urunYesilRenkSecenegi;

}
