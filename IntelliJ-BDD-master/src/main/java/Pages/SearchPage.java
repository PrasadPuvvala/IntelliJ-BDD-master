package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Base.CommonFunctions;

public class SearchPage {
	WebDriver driver;

	public SearchPage(WebDriver driver)
	{
		this.driver = driver;
	}

	@FindBy(xpath ="//*[@id='searchInput']") public WebElement searchBox ;
	@FindBy(xpath = "//*[@id='search-form']/fieldset/button/i") WebElement searchButton;
	@FindBy(xpath = "//*[@id='www-wikipedia-org']/h1/div/div") WebElement header;
	@FindBy(xpath = "//*[@id='firstHeading']") WebElement title;


	//String nTitle = "https://en.wikipedia.org/wiki/Tax";
	
	public void verifySearchpage()
	{
		CommonFunctions.IsElementPresent(searchButton);
		CommonFunctions.IsElementPresent(searchBox);
		CommonFunctions.IsElementPresent(header);
	}

	public void enterDetail()
	{
		CommonFunctions.enterText(searchBox, "Tax");
	}

	public void buttonClick()
	{
		searchButton.click();
	}

	public void verifyheader()
	{
		CommonFunctions.IsElementPresent(title);
	}


	
}
