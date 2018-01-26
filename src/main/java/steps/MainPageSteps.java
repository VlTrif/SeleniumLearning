package steps;

import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;


public class MainPageSteps extends BaseSteps{


    @Step("Выбран пункт меню {0}")
    public void selectMenuItem(String menuItem){

        new MainPage(driver).selectMainMenu(menuItem);
    }

    @Step("Выбран вид страхования {0}")
    public void selectAltMenuItem(String menuItem){

        new MainPage(driver).selectAltMenu(menuItem);
    }

}
