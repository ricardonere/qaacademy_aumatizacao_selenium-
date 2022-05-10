import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TesteExerciciosQAA {
    WebDriver driver = new ChromeDriver();


    @Test
    public void acesso() {
        //Vou maximizar a tela
        driver.manage().window().maximize();
        //Vou navegar para a a pagina da lojinha web
        driver.get("http://demo.automationtesting.in/Register.html");

        driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("Ricardo");
        driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]")).sendKeys("Nere");
        driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys("Rua Um");
        driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")).sendKeys("1245-3265");
        driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[1]/input[1]")).click();
        driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
        driver.findElement(By.xpath("//div[@id='msdd']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Portuguese')]")).click();

    }
    }

