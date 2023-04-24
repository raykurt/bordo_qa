package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPracticeRegister {

    public AutomationPracticeRegister(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id="uniform-id_gender1")
    public WebElement genderBox;

    @FindBy(id="customer_firstname")
    public WebElement customerFirstNameBox;

    @FindBy(id="customer_lastname")
    public WebElement customerLastNameBox;

    @FindBy(id="passwd")
    public WebElement passwordBox;

    @FindBy(id="days")
    public WebElement dayDropdown;

    @FindBy(id="months")
    public WebElement monthDropdown;

    @FindBy(id="years")
    public WebElement yearDropdown;

    @FindBy(id="newsletter")
    public WebElement newsletterBox;

    @FindBy(id="optin")
    public WebElement specialOfferBox;

    @FindBy(id= "company")
    public WebElement companyBox;

    @FindBy(id="address1")
    public WebElement address1Box;

    @FindBy(id="address2")
    public WebElement address2Box;

    @FindBy(id="city")
    public WebElement cityBox;

    @FindBy(id="id_state")
    public WebElement stateBox;

    @FindBy(id="postcode")
    public WebElement postalCodeBox;

    @FindBy(id="id_country")
    public WebElement countryDropdown;

    @FindBy(id = "other")
    public WebElement addInfoBox;

    @FindBy(id="phone")
    public WebElement phoneNumberBox;

    @FindBy(id="phone_mobile")
    public WebElement mobileNumberBox;

    @FindBy(id="submitAccount")
    public WebElement registerAccountButton;

    @FindBy(id="phone22")
    public WebElement phoneNumberBox15;

    @FindBy(id="phone_mobile12")
    public WebElement mobileNumberBox15;

    @FindBy(id="submitAccount12")
    public WebElement registerAccountButton15;


}
