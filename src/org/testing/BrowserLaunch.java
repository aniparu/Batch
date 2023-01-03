package org.testing;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserLaunch {
	private void add() {
		System.out.println("abc");
		System.out.println("Hai How Are today...");

	}
	
	
	
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anipa\\eclipse-workspace\\SeleniumBatch7Pm\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		driver.manage().window().maximize();

		// 2.to fetch middle row middle cell
		// table---->row----col---data

		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));

		List<WebElement> allRows = table.findElements(By.tagName("tr"));

		for (int i = 0; i < allRows.size(); i++) {

			if (i % 2 == 0) {
				WebElement row = allRows.get(i);
				List<WebElement> allDatas = row.findElements(By.tagName("td"));
				for (int j = 0; j < allDatas.size(); j++) {
					if (j % 2 == 0) {
						WebElement data = allDatas.get(j);
						System.out.println(data.getText());
					}
					
				}
			}

		}

	}

}
