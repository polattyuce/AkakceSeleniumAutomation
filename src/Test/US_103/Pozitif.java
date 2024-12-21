package Test.US_103;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Pozitif extends BaseDriver {

    @Test
    public void Test() {

        driver.get("https://www.akakce.com/");

        WebElement girisYap = driver.findElement(By.xpath("(//a[text()='Giriş Yap'])[1]"));
        girisYap.click();

        WebElement eposta = driver.findElement(By.id("life"));
        eposta.sendKeys("losaf0713@cctoolz.com");

        WebElement password = driver.findElement(By.id("lifp"));
        password.sendKeys("hGa.rvey1234");

        WebElement hesapGiris = driver.findElement(By.xpath("(//input[@value='Giriş yap'])[1]"));
        hesapGiris.click();

        Actions aksiyonlar = new Actions(driver);

        WebElement element = driver.findElement(By.cssSelector("[title='Hesabım']"));
        Action aksiyon = aksiyonlar.moveToElement(element).click().build();
        aksiyon.perform();


        WebElement cik = driver.findElement(By.xpath("//a[text()='Çık']"));
        cik.click();

        WebElement girisYap2=driver.findElement(By.xpath("(//a[text()='Giriş Yap'])[1]"));
        System.out.println("girisYap2 = " + girisYap2.getText());

        Assert.assertTrue("Çıkış yapılmadı",girisYap2.getText().contains("Giriş Yap"));

        BekleKapat();
    }
}
