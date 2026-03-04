package steps;

import io.cucumber.java.en.Given;
import org.testng.annotations.Test;
import pages.AmazonMainPage;

public class AmazonSteps {

    private AmazonMainPage amazonMainPage = new AmazonMainPage();

    @Given("The user navigates to Amazon")
    public void theUserNavigatesToAmazon() {
        amazonMainPage.navigateTo("https://www.amazon.com");
    }

}
