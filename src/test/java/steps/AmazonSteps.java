package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonMainPage;

public class AmazonSteps {

    private AmazonMainPage amazonMainPage = new AmazonMainPage();
    private String expectedMessage = "Agregado al carrito";

    @Given("The user navigates to Amazon")
    public void theUserNavigatesToAmazon() {
        amazonMainPage.navigateTo("https://www.amazon.com");
    }

    @When("search for {string}")
    public void searchForProduct(String productName) {
        amazonMainPage.searchText(productName);
        amazonMainPage.clickSearchButton();
    }

    @And("navigates to the second page")
    public void navigatesToTheSecondPage() {
        amazonMainPage.clickSecondPage();
    }

    @And("selects the {word} item")
    public void selectsTheItem(String number) {
        amazonMainPage.clickItem(number);
    }

    @And("the user can add it to the cart")
    public void theUserCanAddItToTheCart() {
        amazonMainPage.clickAddToCartButton();
    }

    @Then("the product is added to the cart")
    public void theProductIsAddedToTheCart() {
        Assert.assertEquals(expectedMessage,amazonMainPage.getSuccessMessage());
    }

}
