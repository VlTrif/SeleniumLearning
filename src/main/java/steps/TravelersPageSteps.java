package steps;

import pages.MainPage;
import pages.TravelersPage;
import ru.yandex.qatools.allure.annotations.Step;

public class TravelersPageSteps{

    @Step("Нажатие на картинку - Офрмить онлайн")
    public void selectImgItem(String imgItem){

        new TravelersPage().selectImg(imgItem);
    }
}
