package hooks;

import driverManager.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {

    @Before
    public void beforeHooks() {
        DriverManager.initDriver();
    }

    @AfterStep
    public void takeScreenshot(Scenario scenario) {

        if (scenario.isFailed()){
            scenario.log("Escenario fallido");
            TakesScreenshot screenshot = (TakesScreenshot) DriverManager.getDriver();
            byte[] screenshotByte = screenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshotByte,"image/png",scenario.getName());
        }

    }


    @After
    public void afterHooks() {
        DriverManager.quitDriver();
    }

}
