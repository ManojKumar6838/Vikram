package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadProperties {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("./Data/shop.properties");
		Properties pObj=new Properties();
		pObj.load(fis);
		String url=pObj.getProperty("url");
		//System.out.println(url);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
	}
}
