package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.Log;
import utilities.ReusableMethods;

import java.io.IOException;

public class Hooks {

    @Before
    public void setUp(){
        Log.info("Test Basladi...");
    }

    @After
    public void tearDown(Scenario scenario){
        Log.info("Test Bitti. Fail Senaryolarda Screenshot Alindi...");
        if (scenario.isFailed()) {
            try {
                ReusableMethods.getScreenshot("Screenshot");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//        Driver.closeDriver();
    }


}
