package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.sl.In;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class Demoqa_stepdefinitions {

    DemoqaPage demoqaPage = new DemoqaPage();

    @Given("kullanici {string} sayfa gider")
    public void kullanici_sayfa_gider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));

    }
    @Then("Alerts'e tiklar")
    public void alerts_e_tiklar() throws InterruptedException {
        Thread.sleep(2000);
        demoqaPage.alertButonu.click();
        Thread.sleep(2000);

    }
    @Then("On button click, alert will appear after bes seconds karsisindaki click me butonuna " +
                  "basin")
    public void on_button_click_alert_will_appear_after_seconds_karsisindaki_click_me_butonuna_basin() throws InterruptedException {
        demoqaPage.clickMeButonu.click();

    }
    @Then("Alert’in gorunur olmasini bekleyin")
    public void alert_in_gorunur_olmasini_bekleyin() throws InterruptedException {
        Thread.sleep(6000);
    }
    @Then("Alert uzerindeki yazinin “This alert appeared after bes seconds” oldugunu test edin")
    public void alert_uzerindeki_yazinin_this_alert_appeared_after_seconds_oldugunu_test_edin() throws InterruptedException {
        String expectedYazi="This alert appeared after 5 seconds";
        Thread.sleep(3000);
        //WebDriver driver = Driver.getDriver();
        String actualAlertText =  Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(expectedYazi,actualAlertText);
        Thread.sleep(2000);

    }
    @Then("Ok diyerek alerti kapatin")
    public void ok_diyerek_alerti_kapatin() {
        Driver.getDriver().switchTo().alert().accept();
    }
    @Then("Sayfayi kapatin")
    public void sayfayi_kapatin() {
        Driver.quitDriver();
    }

}
