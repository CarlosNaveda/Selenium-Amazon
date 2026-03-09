package pages;

public class AmazonMainPage extends BasePage {

    //Constructor
    public AmazonMainPage() {
        super();
    }

    //Variables
    private String searchTextBox = "//input[@id='twotabsearchtextbox']";
    private String searchButton = "//input[@id='nav-search-submit-button']";
    private String secondPage = "//a[@aria-label='Ir a la página 2']";
    private String secondItem ="(//div[@data-component-type='s-search-result'])[2]//a//h2";
    private String addToCartButton = "//input[@id='add-to-cart-button']";
    private String successMessage= "//h1[contains(normalize-space(),'Agregado al carrito')]";


    //Métodos
    public void navigateToAmazon (String url){
        navigateTo(url);
    }

    public void searchText(String text){
        writeText(searchTextBox, text);
    }

    public void clickSearchButton(){
        clickButton(searchButton);
    }

    public void clickSecondPage(){
        clickButton(secondPage);
    }

    public void clickSecondItem(){
        clickButton(secondItem);

    }
    public void clickAddToCartButton(){
        clickButton(addToCartButton);
    }

    public String getSuccessMessage(){
        return getTextWebElement(successMessage);
    }



}
