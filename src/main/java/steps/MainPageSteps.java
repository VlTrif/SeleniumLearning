package steps;

import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertTrue;


public class MainPageSteps extends BaseSteps{


    @Step("Выбран пункт меню {0}")
    public void selectMenuItem(String menuItem){

        new MainPage(driver).selectMainMenu(menuItem);
    }

    /*@Step("заголовок первой страницы калькулятора равен {0}")
    public void mainPageTitle(String expectedTitle){
        String actualTitle = new MainPage(driver).title.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }*/

    @Step("Ожидание открытия доп. меню")
    public void waitingMainPageTitleStep() {
        new MainPage(driver).mainPageAltMenuWait();
    }

    @Step("Выбран вид страхования {0}")
    public void selectAltMenuItem(String menuItem){

        new MainPage(driver).selectAltMenu(menuItem);
    }

}
