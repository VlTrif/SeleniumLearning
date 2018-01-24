package pages;

//import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PersonsPage extends AbstractPage{

    @FindBy(xpath = "//*[contains(text(),'Оформление')]")
    WebElement title;

    @FindBy(name = "insured0_surname")
    WebElement insSurname;

    @FindBy(name = "insured0_name")
    WebElement insName;

    @FindBy(name = "insured0_birthDate")
    WebElement insBirthDate;

    @FindBy(name = "surname")
    WebElement personSurname;

    @FindBy(name = "name")
    WebElement personName;

    @FindBy(name = "middlename")
    WebElement personMiddleName;

    @FindBy(name = "birthDate")
    WebElement personBirthDate;

    @FindBy(name = "passport_series")
    WebElement passSeries;

    @FindBy(name = "passport_number")
    WebElement passNumber;

    @FindBy(name = "issueDate")
    WebElement issueDate;

    @FindBy(name = "issuePlace")
    WebElement issuePlace;

    @FindBy(xpath = "//*[contains(text(),'Продолжить')]")
    public WebElement cntButton;

    public PersonsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOf(title));
    }

    /*protected void fillField(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }*/

    public void fillField(String fieldName, String value){
        switch (fieldName){
            case  "Фамилия застрахованного":
                fillField(insSurname, value);
                break;
            case  "Имя застрахованного":
                fillField(insName, value);
                break;
            case  "Дата рождения застрахованного":
                fillField(insBirthDate, value);
                break;
            case  "Фамилия":
                fillField(personSurname, value);
                break;
            case  "Имя":
                fillField(personName, value);
                break;
            case  "Отчество":
                fillField(personMiddleName, value);
                break;
            case  "Дата рождения":
                fillField(personBirthDate, value);
                break;
            case  "Серия паспорта":
                fillField(passSeries, value);
                break;
            case  "Номер паспорта":
                fillField(passNumber, value);
                break;
            case  "Дата выдачи":
                fillField(issueDate, value);
                break;
            case  "Кем выдан":
                fillField(issuePlace, value);
                break;
            default:  throw new AssertionError("Поле '"+fieldName+"' не объявлено на странице");
        }
    }

    public void checkError (String errorMessage){
        String xpath = "//div[contains(@ng-show,'tryNext && myForm.$invalid')]"; //div[contains(@class,'b-form-center-pos b-form-error-message')]//*[contains(text(),'')]";
        String actualValue = driver.findElement(By.xpath(xpath)).getText();
        Assert.assertTrue(actualValue, actualValue.contains(errorMessage));
    }

}
