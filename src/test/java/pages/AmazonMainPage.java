package pages;

public class AmazonMainPage extends BasePage {

    //Constructor
    public AmazonMainPage() {
        super();
    }

    //Variables
    private String searchTextBox = "//input[@id='twotabsearchtextbox']";
    private String searchButton = "//input[@id='nav-search-submit-button']";

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

}
