package Section;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LocationBtn {
    public static void main(String[] args) {
        //ButtonClick();
        //NameClick();
        //LinkText();
        //ButtonClick_CSS();
        //PutTextData_CSS();
        //DropDown_CSS();
        //ImpactWait_CSS();
        ExplicitWait_CSS();
    }

    static void ExplicitWait_CSS()
    {
        System.setProperty("webdriver.edge.driver", "D:\\JAVA\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.automationtesting.co.uk/loader.html");

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("button#loaderBtn")));

        driver.findElement(By.cssSelector("button#loaderBtn")).click();
    }

    /**ImpactWait - dont wait 10 sec it is wait until btn is ready to click.
     */
    static void ImpactWait_CSS()
    {
        System.setProperty("webdriver.edge.driver", "D:\\JAVA\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.automationtesting.co.uk/loader.html");
        driver.findElement(By.cssSelector("button#loaderBtn")).click();
    }
    static void DropDown_CSS()
    {
        System.setProperty("webdriver.edge.driver", "D:\\JAVA\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/dropdown.html");
        Select menuItem = new Select(driver.findElement(By.cssSelector("select#cars")));

        menuItem.selectByVisibleText("Jeep");

    }

    static void PutTextData_CSS()
    {
        System.setProperty("webdriver.edge.driver", "D:\\JAVA\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/contactForm.html");
        driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("Alex");
        driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("Segeda");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Alex@gala.com");
        driver.findElement(By.cssSelector("textarea[name='message']")).sendKeys("Hi i am alex");
    }

    static void ButtonClick_CSS()
    {
        System.setProperty("webdriver.edge.driver", "D:\\JAVA\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/buttons.html");
        driver.findElement(By.cssSelector("button#btn_three")).click();
    }

    static void LinkText()
    {
        System.setProperty("webdriver.edge.driver", "D:\\JAVA\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk");
        driver.findElement(By.linkText("ACTIONS")).click();
    }
    static void NameClick()
    {
        System.setProperty("webdriver.edge.driver", "D:\\JAVA\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/contactForm.html");
        driver.findElement(By.name("first_name")).sendKeys("Alex");
    }
    static void ButtonClick()
    {
        System.setProperty("webdriver.edge.driver", "D:\\JAVA\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/buttons.html");
        driver.findElement(By.id("btn_one")).click();
    }
}
