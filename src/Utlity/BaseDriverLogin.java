package Utlity;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseDriverLogin {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static JavascriptExecutor js;

    static {
        driver = new ChromeDriver();

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        Login();

    }

    public static void Login() {
        driver.get("https://www.akakce.com/");

        WebElement girisYap = driver.findElement(By.xpath("(//a[text()='Giriş Yap'])[1]"));
        girisYap.click();

        WebElement eposta = driver.findElement(By.id("life"));
        eposta.sendKeys("losaf0713@cctoolz.com");

        WebElement password = driver.findElement(By.id("lifp"));
        password.sendKeys("hGa.rvey1234");

        WebElement hesapGiris = driver.findElement(By.xpath("(//input[@value='Giriş yap'])[1]"));
        hesapGiris.click();
    }

    public static void BekleKapat() {
        MyFunc.Bekle(3);
        driver.quit();
    }
}
