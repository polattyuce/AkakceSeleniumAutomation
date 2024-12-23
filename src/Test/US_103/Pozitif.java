package Test.US_103;

import Utlity.BaseDriver;
import Utlity.BaseDriverLogin;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Pozitif extends BaseDriverLogin {

    @Test
    public void Test() {
        Actions aksiyonlar = new Actions(driver);

        WebElement element = driver.findElement(By.xpath("//a[@title='Hesabım']"));
        Action aksiyon = aksiyonlar.moveToElement(element).click().build();
        aksiyon.perform();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Çık']")));
        WebElement cik = driver.findElement(By.xpath("//a[text()='Çık']"));
        cik.click();

        WebElement girisYap2=driver.findElement(By.xpath("(//a[text()='Giriş Yap'])[1]"));
        System.out.println("girisYap2 = " + girisYap2.getText());

        Assert.assertTrue("Çıkış yapılmadı",girisYap2.getText().contains("Giriş Yap"));

        BekleKapat();
    }
}
