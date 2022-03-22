package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.BasePage;

public class HomeMaps extends BasePage {
	
	public HomeMaps(WebDriver driver) {
		super(driver);
	}
	
	public WebElement buttonLupa() {
		WebElement element = driver.findElement(By.id("search-open"));
		return element;
	}
	
	public WebElement inputPesquisar() {
		WebElement element = driver.findElement(By.xpath("(//input[@placeholder='Pesquisar …'])[1]"));
		return element;
	}
	
	public WebElement Pesquisar() {
		WebElement element = driver.findElement(By.xpath("(//input[contains(@value,'Pesquisar')])[1]"));
		return element;
	}
}
