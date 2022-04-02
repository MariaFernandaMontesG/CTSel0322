package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		String exePath = "./driver/chromedriver.exe"; //especificar la ruta del ChromeDriver
		System.setProperty("webdriver.chrome.driver", exePath);//Agregando la propiedad con la ruta del chrome driver
		WebDriver driver = new ChromeDriver(); //objeto de webDriver
		driver.get("https://www.google.com");

	}

}
