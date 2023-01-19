package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class HomePage {
	
	WebDriver driver=null;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		System.out.println("Jayesh Makdey");
	}

	By Logo_txt= By.xpath("//div[@id='logo']/h1/a");
	//By Drop_down=By.xpath("//span[@class='hidden-xs hidden-sm hidden-md']");
	By Drop_down=By.xpath("//li[@class='dropdown']");
	By List_1=By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li");
	By Reg_text=By.xpath("//div[@id='content']/h1");
	public By Logo_text() {
		return Logo_txt;
	}
	public void Clic_on_Register() {
		driver.findElement(Drop_down).click();
		List<WebElement> options =driver.findElements(List_1);
		for (WebElement option : options)
		{
		    if (option.getText().equals("Register"))
		    {   
		        option.click();
		        break;
		    }
		}
	}
	public By RegText() {
		return Reg_text;
	}
	
	
}
