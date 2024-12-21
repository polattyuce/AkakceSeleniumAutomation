package Test.US_101;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Utlity.BaseDriver.BekleKapat;
import static Utlity.BaseDriver.wait;

import org.junit.Test;
import org.openqa.selenium.support.ui.Select;


public class Negatif extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://www.akakce.com/");

        WebElement hesapAc = driver.findElement(By.cssSelector("[id='H_rl_v8'] > :nth-child(1)"));
        hesapAc.click();

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


        WebElement kullanimSozlesmesi = driver.findElement(By.id("rnufpca"));
        kullanimSozlesmesi.click();

        WebElement hesapAç = driver.findElement(By.id("rfb"));
        hesapAç.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//b[text()='Tamam']")));
        WebElement hataMesajı = driver.findElement(By.xpath("//b[text()='Tamam']"));
        System.out.println("hataMesajı.getText() = " + hataMesajı.getText());

        Assert.assertTrue("Hata mesajı açılmadı",hataMesajı.getText().equalsIgnoreCase("Tamam"));

        BekleKapat();

    }
}
