package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalcPage extends AbstractPage{

    @FindBy(xpath = "//*[contains(text(),'Выбор полиса')]")
    WebElement title;

    @FindBy(xpath = "//*[contains(@class,'b-form-prog-box')]/../..")
    WebElement choiseBox;

    @FindBy(xpath = "//*[contains(@class,'b-button-block-center')]//*[contains(@class,'b-continue-btn')]")
    public WebElement confirmBtn;

    public CalcPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOf(title));
    }

    public void selectBox (String boxItem){
        choiseBox.findElement(By.xpath(".//*[contains(text(),'"+boxItem+"')]")).click();
    }

    /*public void setConfirmBtn(){
        confirmBtn.click();
    }*/
}
