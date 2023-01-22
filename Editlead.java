package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editlead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");		
		driver.manage().window().maximize();		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Digital");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Diya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("T");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("nibble");
		driver.findElement(By.name("departmentName")).sendKeys("QA");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Test Description");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("diya@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Values are updated");		
		driver.findElement(By.xpath("//input[@value=\"Update\"]")).click();
		System.out.println(driver.getTitle());
		
	}

}
