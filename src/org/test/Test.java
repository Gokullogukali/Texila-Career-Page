package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Set up the Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gokul L\\eclipse-workspace\\Texila\\driver\\chromedriver.exe");
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Go to the url
		driver.get("https://careers.tauedu.org/upload-cv/");
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//Scroll Down
		JavascriptExecutor jk =(JavascriptExecutor) driver;
		
		WebElement textDetails = driver.findElement(By.xpath("//h2[text()='Kindly fill the details and upload your CV']"));
		jk.executeScript("arguments[0].scrollIntoView('true')", textDetails);
		
		Thread.sleep(2000);
		
		WebElement textFirstname = driver.findElement(By.xpath("//input[@id='fname']"));
		textFirstname.sendKeys("Gokul Loganathan");
		
		Thread.sleep(2000);
		
		WebElement textEmail = driver.findElement(By.xpath("//input[@id='email']"));
		textEmail.sendKeys("gokulloganathan78@gmail.com");
		
		Thread.sleep(2000);
		WebElement textCountry = driver.findElement(By.xpath("//select[@id='country_code']"));
		textCountry.click();
		
		Thread.sleep(2000);
		WebElement textInd = driver.findElement(By.xpath("//option[text()='India (+91)']"));
		textInd.click();

		Thread.sleep(2000);
		WebElement textMale = driver.findElement(By.xpath("(//input[@name='gender'])[1]"));
		textMale.click();
		
		Thread.sleep(2000);
		WebElement textDepartment = driver.findElement(By.xpath("//select[@id='department']"));
		textDepartment.click();
		
		Thread.sleep(2000);
		WebElement textWb = driver.findElement(By.xpath("//option[text()='Web Development']"));
		textWb.click();
		
		Thread.sleep(2000);
		WebElement textPosition = driver.findElement(By.xpath("//input[@id='applied_for']"));
		textPosition.clear();
		Thread.sleep(2000);
		textPosition.sendKeys("Software Tester / Developer");
		
		Thread.sleep(2000);
		WebElement textDob = driver.findElement(By.xpath("//input[@id='dob']"));
		textDob.sendKeys("11-04-2000");
		
		Thread.sleep(2000);
		//Scroll
		WebElement textLoc = driver.findElement(By.xpath("//p[text()='Prefered Location ']"));
		jk.executeScript("arguments[0].scrollIntoView('true')", textLoc);
		
		Thread.sleep(2000);
		WebElement textLocation = driver.findElement(By.xpath("//select[@id='prefered_location']"));
		textLocation.click();
		
		Thread.sleep(2000);
		WebElement textIndia = driver.findElement(By.xpath("//option[text()='India']"));
		textIndia.click();
		
		Thread.sleep(2000);
		WebElement textFb = driver.findElement(By.xpath("//input[@name='facebook_profile_link']"));
		textFb.sendKeys("Gokul Logu");
		
		Thread.sleep(2000);
		WebElement textLinkedin = driver.findElement(By.xpath("//input[@name='linkedin_profile_link']"));
		textLinkedin.sendKeys("https://www.linkedin.com/in/gokul-loganathan-832b2b245");
		
		Thread.sleep(2000);
		WebElement textOther = driver.findElement(By.xpath("//input[@name='other_social_profile_link']"));
		textOther.sendKeys("Gk");
		
//		Thread.sleep(3000);
//		WebElement textResume = driver.findElement(By.xpath("(//div[@class='w-form-row-field'])[12]"));
//		textResume.click();
		
		Thread.sleep(2000);
		WebElement textYes = driver.findElement(By.xpath("(//input[@name='has_passpord'])[1]"));
		textYes.click();
		
		Thread.sleep(2000);
		WebElement btnApply = driver.findElement(By.xpath("//input[@name='submit']"));
		btnApply.click();
	}

}
