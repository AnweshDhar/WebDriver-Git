package testcases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.BaseTest;

public class IntroductionTest extends BaseTest {
	
	@Test
	public void introTest() throws InterruptedException {
	driver.findElement(By.linkText("Signin")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//html/body/div[4]/div/div/div/div/div/form/fieldset[1]/input")).sendKeys("anwesha");
	driver.findElement(By.xpath("//html/body/div[4]/div/div/div/div/div/form/fieldset[2]/input")).sendKeys("Shipra91#");
	driver.findElement(By.xpath("//html/body/div[4]/div/div/div/div/div/form/div/div[2]/input")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='toggleNav']/li[1]/a")).click();
	Thread.sleep(7000);
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[8]/a"))).build().perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[8]/ul/li[3]/a")).click();
	driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/ul/li[6]/a/figure")).click();
	
	String homePage = driver.getWindowHandle();
    
	Set<String> allWindows = driver.getWindowHandles();
	Iterator<String> i1=allWindows.iterator();
	
	while(i1.hasNext()) {
		driver.switchTo().window(i1.next());
		
		String url = driver.getTitle();
		if(url.contains("Banking App")) {
			System.out.println("Switched to Banking App Page");
			}
          }
}
}