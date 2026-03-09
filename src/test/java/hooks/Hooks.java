package hooks;

import driverManager.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void beforeHooks() {
        DriverManager.initDriver();
    }

//    @After
//    public void afterHooks() {
//        DriverManager.quitDriver();
//    }

}
