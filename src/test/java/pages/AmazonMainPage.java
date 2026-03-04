package pages;

public class AmazonMainPage extends BasePage {

    //Constructor
    public AmazonMainPage() {
        super();
    }

    //Variables
    private String searchTextBox = "";

    //Métodos
    public void navigateToAmazon (String url){
        navigateTo(url);
    }


}
