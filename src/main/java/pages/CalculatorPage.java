package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.ByAngularButtonText;
import com.paulhammant.ngwebdriver.ByAngularModel;
import com.paulhammant.ngwebdriver.NgWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalculatorPage {

	WebDriver driver;
	NgWebDriver ngWebDriver;
	JavascriptExecutor jsDriver;

	ByAngularModel first = ByAngular.model("first");
	ByAngularModel second = ByAngular.model("second");
	ByAngularModel operator = ByAngular.model("operator");
	ByAngularButtonText go = ByAngular.buttonText("Go!");
	By result = By.tagName("h2");

	// By gobtn = By.id("gobutton");

	public CalculatorPage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		jsDriver = (JavascriptExecutor) driver;
		ngWebDriver = new NgWebDriver(jsDriver);

		driver.get("https://juliemr.github.io/protractor-demo/");
		ngWebDriver.waitForAngularRequestsToFinish();
	}

	public String sum(String v1, String v2) {

		driver.findElement(first).sendKeys(v1);

		driver.findElement(second).sendKeys(v2);

		driver.findElement(operator).sendKeys("+");

		driver.findElement(go).click();

		ngWebDriver.waitForAngularRequestsToFinish();

		System.out.println(driver.findElement(result).getText());

		return driver.findElement(result).getText();

	}

	public String sub(String v1, String v2) {

		driver.findElement(first).sendKeys(v1);

		driver.findElement(second).sendKeys(v2);

		driver.findElement(operator).sendKeys("-");

		driver.findElement(go).click();

		ngWebDriver.waitForAngularRequestsToFinish();

		System.out.println(driver.findElement(result).getText());

		return driver.findElement(result).getText();

	}

	public String div(String v1, String v2) {

		driver.findElement(first).sendKeys(v1);

		driver.findElement(second).sendKeys(v2);

		driver.findElement(operator).sendKeys("/");

		driver.findElement(go).click();

		ngWebDriver.waitForAngularRequestsToFinish();

		System.out.println(driver.findElement(result).getText());

		return driver.findElement(result).getText();

	}

}
