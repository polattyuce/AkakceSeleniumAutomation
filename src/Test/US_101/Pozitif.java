package Test.US_101;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Pozitif extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://www.akakce.com/");

        WebElement hesapAc = driver.findElement(By.cssSelector("[id='H_rl_v8'] > :nth-child(1)"));
        hesapAc.click();

        WebElement ad = driver.findElement(By.cssSelector("[id='rnufn']"));
        ad.sendKeys("Mike");

        WebElement soyad = driver.findElement(By.cssSelector("input[id='rnufs']"));
        soyad.sendKeys("Ross");

        WebElement eposta = driver.findElement(By.id("rnufe1"));
        eposta.sendKeys("losaf0713@cctoolz.com");

        WebElement epostaTekrar = driver.findElement(By.id("rnufe2"));
        epostaTekrar.sendKeys("losaf0713@cctoolz.com");

        WebElement sifre = driver.findElement(By.id("rnufp1"));
        sifre.sendKeys("hGa.rvey1234");

        WebElement sifreTekrar = driver.findElement(By.id("rnufp2"));
        sifreTekrar.sendKeys("hGa.rvey1234");

        WebElement erkek = driver.findElement(By.id("rngm"));
        erkek.click();

        WebElement il = driver.findElement(By.id("locpr"));
        Select izmir = new Select(il);
        izmir.selectByVisibleText("İzmir");

        wait.until(ExpectedConditions.elementToBeClickable(By.id("locds")));
        WebElement ilce = driver.findElement(By.id("locds"));
        Select buca = new Select(ilce);
        buca.selectByIndex(8);


        WebElement gunTarihi = driver.findElement(By.id("bd"));
        WebElement ayTarihi = driver.findElement(By.id("bm"));
        WebElement yilTarihi = driver.findElement(By.id("by"));

        Select gun = new Select(gunTarihi);
        Select ay = new Select(ayTarihi);
        Select yil = new Select(yilTarihi);

        buca.selectByIndex(1);
        buca.selectByIndex(1);
        buca.selectByIndex(1);

        WebElement kullanimSozlesmesi = driver.findElement(By.id("rnufpca"));
        kullanimSozlesmesi.click();

        WebElement hesapAç = driver.findElement(By.id("rfb"));
        hesapAç.click();


        BekleKapat();
    }
}
