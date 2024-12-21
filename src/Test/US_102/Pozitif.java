package Test.US_102;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Pozitif extends BaseDriver {

    @Test
    public void Test(){
        driver.get("https://www.akakce.com/");

        WebElement girisYap=driver.findElement(By.xpath("(//a[text()='Giriş Yap'])[1]"));
        girisYap.click();

        WebElement eposta=driver.findElement(By.id("life"));
        eposta.sendKeys("losaf0713@cctoolz.com");

        WebElement password=driver.findElement(By.id("lifp"));
        password.sendKeys("hGa.rvey1234");

        WebElement hesapGiris=driver.findElement(By.xpath("(//input[@value='Giriş yap'])[1]"));
        hesapGiris.click();

        WebElement ad=driver.findElement(By.xpath("//a[text()='Mike']"));
        System.out.println("ad = " + ad.getText());

        Assert.assertTrue("Ad doğru değil",ad.getText().equalsIgnoreCase("Mike"));


        BekleKapat();
    }
}
