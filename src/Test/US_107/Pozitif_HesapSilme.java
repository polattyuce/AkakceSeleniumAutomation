package Test.US_107;

import Utlity.BaseDriverLogin;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Pozitif_HesapSilme extends BaseDriverLogin {

    @Test
    public void HesapSilmePozitif() {
        WebElement hesap = driver.findElement(By.xpath("//div[@id='HM_v8']/i/a"));
        hesap.click();

        WebElement hesapSil = driver.findElement(By.xpath("//a[text()='Hesabımı Sil']"));
        hesapSil.click();

        WebElement sifreGir = driver.findElement(By.id("p"));
        sifreGir.sendKeys("hGa.rvey1234");

        WebElement hesabımıSil = driver.findElement(By.id("u"));
        hesabımıSil.click();

        Assert.assertEquals(driver.findElement(By.xpath("//h1[text()='Hesabın Silindi']")).getText(), "Hesabın Silindi");

        BekleKapat();
    }
}
