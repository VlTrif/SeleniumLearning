package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TravelersPage extends AbstractPage{
    //WebDriver driver;

    @FindBy(xpath = "//*[contains(@class, 'sbrf-rich-outer')]/p/a[contains(@target, '_blank')]")
    WebElement clickImg;

    public TravelersPage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void selectImg (String imgItem){
        clickImg.findElement(By.xpath("./img[contains(@src,'"+imgItem+"')]")).click();
    }

    /*public void waitImageClickable(){
        Wait<WebDriver> wait = new WebDriverWait(driver, 15, 1000);
        wait.until(ExpectedConditions.visibilityOf(
                driver.findElement(By.xpath("//*[contains(@class, 'sbrf-rich-outer')]/p/a[contains(@target, '_blank')]/img")))).click();
    }*/
}
