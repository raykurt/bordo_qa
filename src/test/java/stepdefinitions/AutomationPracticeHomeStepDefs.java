package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPracticeHome;
import pages.AutomationPracticeRegister;
import utilities.ConfigurationReader;
import utilities.Driver;

public class AutomationPracticeHomeStepDefs {

    AutomationPracticeHome homePage = new AutomationPracticeHome();

    @Given("kullanici tarayici acip automationpractice sayfasina gider")
    public void kullanici_tarayici_acip_automationpractice_sayfasina_gider() {
        Driver.getDriver();
        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("automation_url"));
    }

    @Given("kullanici sign in butonuna tiklar")
    public void kullanici_sign_in_butonuna_tiklar() {
        homePage.signInButton.click();
    }

    @Given("kullanici gecerli bir email adresiyle ilerler")
    public void kullanici_gecerli_bir_email_adresiyle_ilerler() {
        homePage.emailAddressTextBox.sendKeys(ConfigurationReader.getProperty("username"));
        homePage.submitCreateAnAccountButton.click();
    }

}
