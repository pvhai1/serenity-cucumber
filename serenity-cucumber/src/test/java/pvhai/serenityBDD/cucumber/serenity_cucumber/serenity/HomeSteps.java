package pvhai.serenityBDD.cucumber.serenity_cucumber.serenity;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pvhai.serenityBDD.cucumber.serenity_cucumber.steps.HomeSerenity;
import net.thucydides.core.annotations.Steps;

public class HomeSteps {
	@Steps
    HomeSerenity homeserenity;
    @Given("^Open home page$")
    public void openHomePage() {
    	homeserenity.open_Home_Page();
    }

    @When("^Click on radio button Good$")
    public void clickOnRadioButtonGood() {
    	homeserenity.SelectTheGoodRadioButtonOption();
    }
    
    @And ("^Click on radio button Next$")
    public void clickOnButtonNext() {
    	homeserenity.ClickNextButton();
    }

    @Then("^Assert text Have a nice day exists \"([^\"]*)\"$")
    public void assertTextHaveANiceDayExists(String text) throws Throwable {
        Assert.assertEquals(homeserenity.getTextHaveANiceDay(),text);
    }

}
