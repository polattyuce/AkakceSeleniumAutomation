package Test.US_106;

import Utlity.BaseDriverLogin;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_0601 extends BaseDriverLogin {

    @Test
    public void MesajKutusuKontrolü(){

        WebElement hesap=driver.findElement(By.xpath("//div[@id='HM_v8']/i/a"));
        hesap.click();

        WebElement mesajlarım=driver.findElement(By.xpath("//a[text()='Mesajlarım']"));
        mesajlarım.click();

        WebElement mesajYok=driver.findElement(By.xpath("//p[text()='Listelenecek mesaj bulunamadı.']"));

        if (mesajYok.getText().toLowerCase().equals("Listelenecek mesaj bulunamadı."))
            System.out.println("Mesaj yok");
        else
            System.out.println("Mesaj var");


    }
}
