package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class LoginPage extends Utils {

    WebDriver driver;
    private By create_email_field = By.id("email_create");
    private By create_account_button = By.id("SubmitCreate");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void accessLoginPage() {
        driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
        waitUntilElementAppears(create_email_field, 5);
        Assert.assertTrue(String.valueOf(create_email_field), true);
    }

    public void fillEmailCreate() {
        driver.findElement(create_email_field).sendKeys(getRandomEmail());
    }

    public void clickCreateAccountButton() {
        driver.findElement(create_account_button).click();
    }

}
