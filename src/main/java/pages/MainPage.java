package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

public class MainPage extends AbstractPage{
    //WebDriver driver;

    @FindBy(xpath = "//div[contains(@class,'alt-menu-mid')]//ul[contains(@aria-labelledby,'alt-menu-mid__header4')]")
    WebElement mainMenu;

    @FindBy(xpath = "//ul[contains(@aria-labelledby,'alt-menu-mid__header4')]//*[contains(text(),'Страхование путешественников')]")
    public WebElement title;

    @FindBy(xpath = "//ul[contains(@aria-labelledby,'alt-menu-mid__header4')]//a[contains(@aria-label,'Застраховать себя ')]/../*[contains(@class,'alt-menu-collapser__area alt-menu-collapser__area_cols_3')]")
    WebElement altMenu;

    public MainPage () {
        PageFactory.initElements(BaseSteps.getDriver(), this);

    }

    public void selectMainMenu (String menuItem){
        mainMenu.findElement(By.xpath(".//a[contains(@aria-label,'"+menuItem+"')]")).click();
    }

    public void mainPageAltMenuWait(){
        (new WebDriverWait(BaseSteps.getDriver(), 10))
                .until(ExpectedConditions.visibilityOf(title));
    }
    public void selectAltMenu (String menuItem){
        //(new WebDriverWait(driver, 15)).until(ExpectedConditions.visibilityOf(title));
        altMenu.findElement(By.xpath(".//*[contains(text(),'"+menuItem+"')]")).click();
    }
}
