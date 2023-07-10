package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

import java.util.Random;

public class Utils extends RunCucumberTest {

    public void waitUntilElementAppears(By element, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public String getRandomEmail() {
        String email_init = "qazando_";
        String email_final = "@email.com.br";

        Random random = new Random();
        int min = 1;
        int max = 999999999;
        int result = random.nextInt(max-min) + min;

        return email_init + result + email_final;
    }
}
