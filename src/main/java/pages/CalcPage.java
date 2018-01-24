package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalcPage {

    @FindBy(xpath = "//*[contains(@class,'b-form-prog-box')]/../..")
    WebElement choiseBox;

    @FindBy(xpath = "//*[contains(@class,'b-button-block-center')]//*[contains(@class,'b-continue-btn')]")
    WebElement confirmBtn;

    public CalcPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void selectBox (String boxItem){
        choiseBox.findElement(By.xpath(".//*[contains(text(),'"+boxItem+"')]")).click();
    }

    public void setConfirmBtn(){
        confirmBtn.click();
    }
}
