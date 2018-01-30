package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.ru.Когда;

import java.util.ArrayList;

public class ScenarioSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();
    TravelersPageSteps travelersPageSteps = new TravelersPageSteps();
    CalcPageSteps calcPageSteps = new CalcPageSteps();
    PersonsPageSteps personsPageSteps = new PersonsPageSteps();

    @When("^выбран пункт основного меню \"(.+)\"$")
    public void selectMenuItem(String menuItem){
        mainPageSteps.selectMenuItem(menuItem);
    }

    @When("^ожидание открытия меню")
    public void waitingMainPageTitleStep() {
        mainPageSteps.waitingMainPageTitleStep();
    }

    @When("^выбран пункт доп. меню \"(.+)\"$")
    public void selectAltMenuItem(String menuItem){
        mainPageSteps.selectAltMenuItem(menuItem);
    }

    @When("^нажатие на картинку - Оформить онлайн \"(.+)\"$")
    public void selectImgItem(String imgItem){
        travelersPageSteps.selectImgItem(imgItem);
    }

    @When("^переход на новую вкладку")
    public void switchingWindow(){
        ArrayList tabs2 = new ArrayList(BaseSteps.getDriver().getWindowHandles());
        BaseSteps.getDriver().switchTo().window((String) tabs2.get(1));
    }

    @Then("^выбирается пакет страхования \"(.+)\"$")
    public void selectBoxStep(String boxItem){
        calcPageSteps.selectBoxStep(boxItem);
    }

    @Then("^нажатие кнопки подтверждение")
    public void goToNextCalcPage(){
        calcPageSteps.goToNextCalcPage();
    }

    @When("^заполняются поля:")
    public void stepWhenFillingFields(DataTable fields){
        fields.asMap(String.class, String.class).forEach((key, value) -> personsPageSteps.stepFillField(key,value));
    }

    @Then("^нажатие кнопки продолжить после заполнения полей")
    public void clickingCntBtn(){
        personsPageSteps.clickingCntBtn();
    }

    @Then("^присутствует сообщение об ошибке - Заполнены не все обязательные поля")
    public void checkErrorMessage(){
        personsPageSteps.errorValidation();

    }
}
