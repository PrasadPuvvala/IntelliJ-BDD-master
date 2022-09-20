package StepsDefinitions;

import Base.CommonFunctions;
import Pages.SearchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchPageSteps {
        WebDriver driver;

        @Given("User navigates to dashboard search page")
        public void userNavigatesToDashboardSearchPage()
        {
         try {
             driver=CommonFunctions.setup("Chrome");
             driver.get(CommonFunctions.pReader("url"));
         }
         catch (Exception e)
         {
             e.printStackTrace();
         }
        }

        @Then("Dashboard search page should be displayed$")
        public void DashboardSearchPageShouldBeDisplayed()
        {
            /*SearchPage spObj = PageFactory.initElements(driver,SearchPage.class);
            spObj.verifySearchpage();*/
            driver.findElement(By.name(("login"))).sendKeys("Ikonictest@gmail.com");
            driver.findElement(By.name(("pass"))).sendKeys("Password1");


        }

        @When("User enter the text is search box and click on search$")
        public void UserEnterTheTextIsSearchBoxAndClickOnSearch()
        {
           /* SearchPage spObj = PageFactory.initElements(driver,SearchPage.class);
            spObj.enterDetail();
            spObj.buttonClick();*/

            driver.findElement(By.xpath("//*/app-login/div/form/div/div[5]/button")).click();

        }

        @Then("Search results should be displayed$")
        public void SearchResultsShouldBeDisplayed() throws InterruptedException {
         /*   SearchPage spObj = PageFactory.initElements(driver,SearchPage.class);
            spObj.verifyheader();*/
            Thread.sleep(4000);
            driver.close();
        }

}
