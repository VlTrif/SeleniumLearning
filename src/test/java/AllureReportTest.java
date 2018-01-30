/*import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;
import steps.*;

import java.util.ArrayList;
import java.util.HashMap;


********************************
*     THIRD TASK, COMMENTED    *
********************************
public class AllureReportTest extends BaseSteps {

    @Test
    @Title("Страхование")
    public void tryInsurance(){
        MainPageSteps mainPageSteps = new MainPageSteps();
        TravelersPageSteps travelersPageSteps = new TravelersPageSteps();
        CalcPageSteps calcPageSteps = new CalcPageSteps();
        PersonsPageSteps personsPageSteps = new PersonsPageSteps();

        mainPageSteps.selectMenuItem("Застраховать себя ");
        mainPageSteps.waitingMainPageTitleStep();
        mainPageSteps.selectAltMenuItem("Страхование путешественников");

        travelersPageSteps.selectImgItem("/portalserver/content/atom/contentRepository/content/person/travel/banner-zashita-traveler.jpg?id=f6c836e1-5c5c-4367-b0d0-bbfb96be9c53");

        ArrayList tabs2 = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window((String) tabs2.get(1));

        calcPageSteps.selectBoxStep("Минимальная");
        calcPageSteps.goToNextCalcPage();

        HashMap<String, String> testData = new HashMap<>();
        testData.put("Фамилия застрахованного","Ivanov");
        testData.put("Имя застрахованного","Ivan");
        testData.put("Дата рождения застрахованного","21.01.1990");
        testData.put("Фамилия","Иванов");
        testData.put("Имя","Иван");
        testData.put("Отчество","Иванович");
        testData.put("Дата рождения","21.01.1990");
        testData.put("Серия паспорта","1122");
        testData.put("Номер паспорта","222333");
        testData.put("Дата выдачи","21.01.1999");
        testData.put("Кем выдан","Отделением УФМС по г.Москва");

        personsPageSteps.stepWhenFillingFields(testData);

        personsPageSteps.clickingCntBtn();
        personsPageSteps.errorValidation();



    }
}*/
