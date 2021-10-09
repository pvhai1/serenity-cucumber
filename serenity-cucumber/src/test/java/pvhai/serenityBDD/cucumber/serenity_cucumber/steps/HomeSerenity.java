package pvhai.serenityBDD.cucumber.serenity_cucumber.steps;

import pvhai.serenityBDD.cucumber.serenity_cucumber.page.HomePage;
import net.thucydides.core.steps.ScenarioSteps;

public class HomeSerenity extends ScenarioSteps {
	HomePage homePage;

    public void open_Home_Page(){

    	homePage.open();
    }

    public String getTextHaveANiceDay(){
        return homePage.getTextHaveANiceDay();
    }


    public void SelectTheGoodRadioButtonOption(){

    	homePage.click_on_radio_button_Good();
    }

    public void ClickNextButton(){

    	homePage.click_on_button_Next();
    }

}
