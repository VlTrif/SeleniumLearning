import org.junit.Test;
import pages.MainPage;

public class RefactoredTaskOne extends BaseTest {


    @Test
    public void newRefactoredTest(){
        MainPage mainPage = new MainPage(driver);
        mainPage.selectMainMenu("Застраховать себя и имущсетво");
        mainPage.selectAltMenu("Страхование путешественников");
    }
}

