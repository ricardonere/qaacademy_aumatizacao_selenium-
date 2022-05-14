import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteExerciciosQAA {
    WebDriver driver = new ChromeDriver();


    @Test
    public void acesso() {
        //Vou maximizar a tela
        driver.manage().window().maximize();
        //Vou navegar para a a pagina da lojinha web
        driver.get("file:///C:/Users/Lenovo/Desktop/Register.html");

        driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("Ricardo");
        driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]")).sendKeys("Nere");
        driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys("Rua Um");
        driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")).sendKeys("0552453265");
        driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[1]/input[1]")).click();
        driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
        driver.findElement(By.xpath("//div[@id='msdd']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Portuguese')]")).click();
        driver.findElement(By.xpath("//select[@id='Skills']")).sendKeys("Javascript");
        driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[10]/div[1]/span[1]/span[1]/span[1]/span[2]/b[1]")).click();
        driver.findElement(By.xpath("//li[contains(text(),'Australia')]")).click();
        driver.findElement(By.xpath("//select[@id='yearbox']")).sendKeys("1932");
        driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[11]/div[2]/select[1]")).sendKeys("July");
        driver.findElement(By.xpath("//select[@id='daybox']")).sendKeys("28");
        driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("admin2022");
        driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("admin2022");
        driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
    }

    @Test
    public void interagirCampoSwitchTo() {
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/Lenovo/Desktop/Register.html");
        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[2]/ul[1]/li[4]/i[1]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Alerts')]")).click();
        driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'alert box:')]")).click();
    }

    @Test
    public void interagirCampoSwichToWindow() {
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/Lenovo/Desktop/Register.html");
        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[2]/ul[1]/li[4]/i[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[2]/a[1]")).click();
        driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]")).click();
    }//Test
    @Test
    public void interagirCampoSwichToWindowsOpen(){
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/Lenovo/Desktop/Register.html");
        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[2]/ul[1]/li[4]/i[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Open New Seperate Windows')]")).click();
        driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]")).click();


    }
}