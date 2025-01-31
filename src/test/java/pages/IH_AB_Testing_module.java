package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import locators.IH_AB_Testing_Loc;
import org.testng.Reporter;

public class IH_AB_Testing_module {
	WebDriver driver;
	
	// constructor to accept WebDriver instance
	public IH_AB_Testing_module(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void ABTesting_Navigation()
	{
		driver.findElement(By.xpath(IH_AB_Testing_Loc.AB_testLink)).click();
	 WebElement TestVarationText = driver.findElement(By.xpath(IH_AB_Testing_Loc.TestVarition));
		String ActualTestVariationText = TestVarationText.getText();
		Reporter.log(ActualTestVariationText);
		//Assert.assertEquals(ActualTestVariationText,IH_AB_Testing_Loc.Expected_TestVarition_Test);
		
		 WebElement TestVarationParagraph = driver.findElement(By.xpath(IH_AB_Testing_Loc.TestVariation_Paragraph));
		String ActualTestVariationParagraph = TestVarationParagraph.getText();
		Assert.assertEquals(ActualTestVariationParagraph,IH_AB_Testing_Loc.Expected_TestParagraph);



	}
	

}
