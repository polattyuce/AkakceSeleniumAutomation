package Test.US_107;

import Utlity.BaseDriverLogin;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Negatif_HesapSilme extends BaseDriverLogin {

    @Test
    public void HesapSilmeNegatif() {

        WebElement hesap = driver.findElement(By.xpath("//div[@id='HM_v8']/i/a"));
        hesap.click();

        WebElement hesapSil = driver.findElement(By.xpath("//a[text()='Hesabımı Sil']"));
        hesapSil.click();

        WebElement sifreGir = driver.findElement(By.id("p"));
        sifreGir.sendKeys("gsajkngajknsg2131");

        WebElement hesabımıSil = driver.findElement(By.id("u"));
        hesabımıSil.click();

        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//div[@class='alertX t2']/p")), "Mevcut şifrenizi doğru girdiğinizden emin olun."));
        WebElement alertMessage = driver.findElement(By.xpath("//div[@class='alertX t2']/p"));
        Assert.assertTrue(alertMessage.getText().contains("Mevcut şifrenizi doğru girdiğinizden emin olun."));

        BekleKapat();
    }
}
