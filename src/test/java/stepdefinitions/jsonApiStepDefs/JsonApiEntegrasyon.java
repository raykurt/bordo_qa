package stepdefinitions.jsonApiStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.testng.Assert;
import utilities.Log;

import java.util.List;

import static io.restassured.RestAssured.given;

public class JsonApiEntegrasyon {

    String endpoint;
    Response response;

    @Given("kullanici endpoint olarak {string} tanimlar")
    public void kullanici_endpoint_olarak_tanimlar(String string) {
        endpoint = string;
    }

    @Given("kullanici request gönderip response elde eder")
    public void kullanici_request_gönderip_response_elde_eder() {
        response = given().when().get(endpoint);
    }

    @Then("kullanici status code assert eder")
    public void kullanici_status_code_assert_eder() {
        Log.info("Api Status Code Assert Ediliyor...");
        response.then().statusCode(200);
    }

    @Then("kullanici clients sayisini assert eder")
    public void kullanici_clients_sayisini_assert_eder() {
        List<Object> el = response.as(List.class);
        Log.info("Api Clients Sayısı Assert Ediliyor...");
        Assert.assertEquals(56, el.size());

    }
}
