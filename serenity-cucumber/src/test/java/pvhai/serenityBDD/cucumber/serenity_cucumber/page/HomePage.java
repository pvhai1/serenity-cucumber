package pvhai.serenityBDD.cucumber.serenity_cucumber.page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.surveymonkey.com/r/9MVSPYS")
public class HomePage extends PageObject {
    @FindBy(xpath = "//span[contains(text(),'Good')]")
    WebElementFacade rdoButtonGood;
    @FindBy(xpath = "//button[contains(text(),'Next')]")
    WebElementFacade btnNext;
    @FindBy(xpath = "//div[contains(text(),'Have a nice day.')]")
    WebElementFacade txtHaveANiceDay;

    
    public void click_on_radio_button_Good(){

    	rdoButtonGood.click();
    }
    
    public void click_on_button_Next(){

    	btnNext.click();
    }

    public String getTextHaveANiceDay() {
        return txtHaveANiceDay.getTextValue();
    }

}