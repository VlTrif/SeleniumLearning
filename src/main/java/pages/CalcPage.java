package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

public class CalcPage extends AbstractPage{

    @FindBy(xpath = "//*[contains(text(),'Выбор полиса')]")
    WebElement title;

    @FindBy(xpath = "//*[contains(@class,'b-form-prog-box')]/../..")
    WebElement choiseBox;

    @FindBy(xpath = "//*[contains(@class,'b-button-block-center')]//*[contains(@class,'b-continue-btn')]")
    public WebElement confirmBtn;

    public CalcPage () {
        PageFactory.initElements(BaseSteps.getDriver(), this);
        (new WebDriverWait(BaseSteps.getDriver(), 10))
                .until(ExpectedConditions.visibilityOf(title));
    }

    public void selectBox (String boxItem){
        choiseBox.findElement(By.xpath(".//*[contains(text(),'"+boxItem+"')]")).click();
    }

    /*public void setConfirmBtn(){
        confirmBtn.click();
    }*/
}
