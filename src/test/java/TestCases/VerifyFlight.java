package TestCases;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageObjectModel.FlightPageObject;
import Resources.BaseClass;
import Resources.CommonMethod;
import Resources.constants;

public class VerifyFlight extends BaseClass {
	
	@Test
	public void flight() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		FlightPageObject fpo = new FlightPageObject(driver);
		
		fpo.clickfrom().click();
		fpo.enterfromcity().sendKeys(constants.EnterFromcity);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(fpo.fromsug()));
		
		CommonMethod.ForEachLoop(fpo.fromsug(),constants.ActualFromCity);
		
		fpo.entertocity().sendKeys(constants.EnterToCity);
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfAllElements(fpo.tosug()));
		Thread.sleep(2000);
		CommonMethod.ForEachLoop(fpo.tosug(), constants.ActualEnterToCity);
		
		String s = "";
		while (!(s.equals(constants.EnterMonthYear))) {
			fpo.NextButton().click();
			s = fpo.Monthtext().getText();
		}
		CommonMethod.ForEachLoop(fpo.SelectDate(), constants.EnterDate);

		fpo.TravelClass().click();

		CommonMethod.ForEachLoop(fpo.Adult(), constants.EnterPassenger);

		CommonMethod.ForEachLoop(fpo.Cls(), constants.EnterClass);

		fpo.applybtn().click();

		CommonMethod.ForEachLoop(fpo.Firetype(), constants.FireType);

		fpo.Search().click();
		
		try {
			fpo.AcceptPopup().click();
		}
		catch(Exception e) {
			fpo.Refresh().click();
		}
		
	//	fpo.AcceptPopup().click();
		
		fpo.ViewPrice().click();
		   
		fpo.BookNow().click();
		
		Set<String> obj = driver.getWindowHandles();
		Iterator<String> it = obj.iterator();
		String Parent_window = it.next();
		String Child_window = it.next();
		driver.switchTo().window(Child_window); 
		Thread.sleep(3000);
		
		fpo.AddNewAdult().click();
		fpo.FirstName().sendKeys("Kanha");
		fpo.LastName().sendKeys("Kashyap");
		
		CommonMethod.ForEachLoop(fpo.Gender(),constants.Gender);
		
		fpo.Mobile().sendKeys(constants.Mobile);
		fpo.Email().sendKeys(constants.EMail);
		
		fpo.Continuebtn().click();	
	}
}
