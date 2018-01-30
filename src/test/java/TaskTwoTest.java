/*import org.junit.Test;
import org.openqa.selenium.By;
import pages.CalcPage;
import pages.MainPage;
import pages.PersonsPage;
import pages.TravelersPage;
import steps.BaseSteps;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

********************************
*    SECOND TASK, COMMENTED    *
********************************


public class TaskTwoTest extends BaseSteps {


    @Test
    public void newTaskTwoTest(){
        driver.get(baseUrl);
        MainPage mainPage = new MainPage(driver);
        mainPage.selectMainMenu("Застраховать себя ");
        mainPage.selectAltMenu("Страхование путешественников");

        TravelersPage travelersPage = new TravelersPage(driver);
        //new TravelersPage(driver).waitImageClickable();
        travelersPage.selectImg("/portalserver/content/atom/contentRepository/content/person/travel/banner-zashita-traveler.jpg?id=f6c836e1-5c5c-4367-b0d0-bbfb96be9c53");

        ArrayList tabs2 = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window((String) tabs2.get(1));

        CalcPage calcPage = new CalcPage(driver);
        calcPage.selectBox("Минимальная");
        calcPage.setConfirmBtn();

        PersonsPage personsPage = new PersonsPage(driver);

        personsPage.fillField("Фамилия застрахованного","Ivanov");
        personsPage.fillField("Имя застрахованного","Ivan");
        personsPage.fillField("Дата рождения застрахованного","21.01.1990");
        personsPage.fillField("Фамилия","Иванов");
        personsPage.fillField("Имя","Иван");
        personsPage.fillField("Отчество","Иванович");
        personsPage.fillField("Дата рождения","21.01.1990");
        personsPage.fillField("Серия паспорта","1122");
        personsPage.fillField("Номер паспорта","222333");
        personsPage.fillField("Дата выдачи","21.01.1999");
        personsPage.fillField("Кем выдан","Отделением УФМС по г.Москва");

        personsPage.cntButton.click();

        //personsPage.checkError("Заполнены не все обязательные поля");

        assertEquals("Заполнены не все обязательные поля",
                driver.findElement(By.xpath("//div[contains(@ng-show,'tryNext && myForm.$invalid')]")).getText());
    }
}*/
