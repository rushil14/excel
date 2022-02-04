import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class read_prop {
    public static void main(String args[]) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        Properties prop=new Properties();
        FileInputStream f=new FileInputStream("C:\\Users\\rushi\\IdeaProjects\\excel\\write.properties");
        prop.load(f);
        System.out.println(prop.getProperty("url"));
        String str=prop.getProperty("url");
        driver.get(str);
        String user=prop.getProperty("username");
        String password=prop.getProperty("password");
        WebElement obj=driver.findElement(By.name("email"));
        obj.sendKeys(user);
        driver.findElement(By.name("password")).sendKeys(password);
        FileOutputStream fl=new FileOutputStream("C:\\Users\\rushi\\IdeaProjects\\excel\\write.properties");
        prop.setProperty("password","abcdef");
        prop.store(fl,"comments");
    }
}
