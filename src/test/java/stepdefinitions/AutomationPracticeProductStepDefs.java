package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPracticeHome;
import pages.AutomationPracticeProduct;
import utilities.Driver;

public class AutomationPracticeProductStepDefs {

    AutomationPracticeHome homePage = new AutomationPracticeHome();
    AutomationPracticeProduct product = new AutomationPracticeProduct();

    static String summerDressesFiyat;
    static String summerAranilanUrunFiyat;
    static String summerDressesAd;
    static String summerAranilanUrunAd;


    @Given("kullanici dresses ve summer dresses menusunden sepete urun ekler")
    public void kullanici_dresses_ve_summer_dresses_menusunden_sepete_urun_ekler() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(homePage.dressesHomePage).perform();

        Driver.waitForClickablility(homePage.summerDressesHomePage,5);
        homePage.summerDressesHomePage.click();

        product.summerDressesUrun.click();
        summerDressesAd=product.urunAdiBasligi.getText();
        product.urunBeyazRenkSecenegi.click();
        summerDressesFiyat=product.urunFiyatBilgisi.getText();
        product.urunuSepeteEkleButonu.click();

    }

    @When("kullanici {string} ürünü aratip sepete ekler")
    public void kullanici_ürünü_aratip_sepete_ekler(String urunArama) {
        homePage.searchBar.sendKeys(urunArama+ Keys.ENTER);
        product.summerAranilanUrun.click();
        summerAranilanUrunAd=product.urunAdiBasligi.getText();
        product.urunYesilRenkSecenegi.click();
        summerAranilanUrunFiyat=product.urunFiyatBilgisi.getText();
        product.urunuSepeteEkleButonu.click();
    }

}
