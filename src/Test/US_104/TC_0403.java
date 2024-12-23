package Test.US_104;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_0403 extends BaseDriver {

    @Test
    public void OturumAçmaLoginGeçersizE_posta(){
        driver.get("https://www.akakce.com/");

        WebElement girisYap = driver.findElement(By.xpath("(//a[text()='Giriş Yap'])[1]"));
        girisYap.click();

        WebElement eposta = driver.findElement(By.id("life"));
        eposta.sendKeys("losafd0713@cctoolz.com");

        WebElement password = driver.findElement(By.id("lifp"));
        password.sendKeys("hGa.rvey1234");

        WebElement hesapGiris = driver.findElement(By.xpath("(//input[@value='Giriş yap'])[1]"));
        hesapGiris.click();

        BekleKapat();

    }
}
