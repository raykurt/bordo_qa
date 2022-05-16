package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AutomationPracticeHome;
import pages.AutomationPracticeRegister;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.Log;

public class AutomationPracticeRegisterStepDefs {

    AutomationPracticeHome homePage = new AutomationPracticeHome();
    AutomationPracticeRegister register = new AutomationPracticeRegister();


    @When("kullanici istenilen bilgileri girip yeni kullanici olusturur")
    public void kullanici_istenilen_bilgileri_girip_yeni_kullanici_olusturur() {
        Log.info("Gerekli Bilgiler Girilerek Yeni Bir Uye Kaydi Olusturuluyor...");
        register.genderBox.click();
        register.customerFirstNameBox.sendKeys("bordoabc");
        register.customerLastNameBox.sendKeys("bordoabcd");
        register.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        Driver.selectByIndex(register.dayDropdown,30);
        Driver.selectByIndex(register.monthDropdown, 6);
        Driver.selectByValue(register.yearDropdown, "1986");
        register.newsletterBox.click();
        register.specialOfferBox.click();
        register.companyBox.sendKeys("Bordo");
        register.address1Box.sendKeys("Sarikorkmaz, Zonguldak, Turkey");
        register.address2Box.sendKeys("Turkey");
        register.cityBox.sendKeys("Zonguldak");
        Driver.selectByVisibleText(register.stateBox,"Hawaii");
        register.postalCodeBox.sendKeys("67300");
        Driver.selectByVisibleText(register.countryDropdown,"United States");
        register.addInfoBox.sendKeys("Tesekkurler");
        register.phoneNumberBox.sendKeys("5443435555");
        register.mobileNumberBox.sendKeys("5444444441");
        Driver.waitForClickablility(register.registerAccountButton,5);
        register.registerAccountButton.click();
    }

    @Then("kullanici yeni kullanici olusturdugunu dogrular")
    public void kullanici_yeni_kullanici_olusturdugunu_dogrular() {
        Assert.assertTrue(homePage.signOutHomePageButton.isDisplayed());
    }
}
