package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Duplicatelead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");		
		driver.manage().window().maximize();		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Old company");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Durga");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("T");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Old abc");
		driver.findElement(By.name("departmentName")).sendKeys("QA");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is old name");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("old@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();		
		System.out.println(driver.getTitle());		
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys("New Company");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.clear();
		firstName.sendKeys("Diya");
		WebElement description =driver.findElement(By.id("createLeadForm_description"));
		description.clear();
		description.sendKeys("This is new name");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());

	}

}
