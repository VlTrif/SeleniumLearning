package steps;

import pages.CalcPage;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertTrue;

public class CalcPageSteps extends BaseSteps{

    /*@Step("заголовок первой страницы калькулятора равен {0}")
    public void checkPageTitle(String expectedTitle){
        String actualTitle = new CalcPage(driver).title.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }*/

    @Step("Выбрана программа страхования {0}")
    public void selectBoxStep(String boxItem){
        new CalcPage(driver).selectBox(boxItem);
    }

    @Step("Нажата кнопка подтверждения")
    public void goToNextCalcPage(){
        new CalcPage(driver).confirmBtn.click();
    }

}
