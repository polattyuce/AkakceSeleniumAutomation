package Test.US_105;

import Utlity.BaseDriverLogin;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_0501 extends BaseDriverLogin {

    @Test
    public void SiparişListesiKontrolü(){

        WebElement hesap=driver.findElement(By.xpath("//div[@id='HM_v8']/i/a"));
        hesap.click();

        WebElement siparislerim=driver.findElement(By.xpath("//a[text()='Siparişlerim']"));
        siparislerim.click();

        WebElement yazı=driver.findElement(By.xpath("//div[text()='Kayıtlı siparişiniz bulunmuyor.']"));
        Assert.assertEquals(yazı.getText(),"Kayıtlı siparişiniz bulunmuyor.");

        BekleKapat();
    }
}
