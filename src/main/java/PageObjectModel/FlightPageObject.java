package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightPageObject {
	
	public FlightPageObject(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebDriver driver;
	
	private By clickonfrom = By.xpath("(//span[@class='lbl_input appendBottom10'])[1]");
	private By fromcity = By.xpath("//input[@placeholder='From']");
	private By fromcitysug = By.xpath("//p[@class='font14 appendBottom5 blackText']");
	
	public WebElement clickfrom() {
		return driver.findElement(clickonfrom);}	
	public WebElement enterfromcity() {
		return driver.findElement(fromcity);}
	public List<WebElement> fromsug() {
		return driver.findElements(fromcitysug);}
	
	private By tocity = By.xpath("//input[@id='toCity']");
	private By tocitysug = By.xpath("//p[@class='font14 appendBottom5 blackText']");
	
	public WebElement entertocity() {
		return driver.findElement(tocity);}
	public List<WebElement> tosug(){
		return driver.findElements(tocitysug);}
	
	private By nextbtn = By.xpath("//span[@aria-label='Next Month']");
	private By mnthtext = By.xpath("(//div[@class='DayPicker-Caption'])[2]/div");
	private By seldate = By.xpath("(//div[@class='DayPicker-Body'])[2]//div//p");
	
	public WebElement Monthtext() {
		return driver.findElement(mnthtext);
	}
	public WebElement NextButton() {
		return driver.findElement(nextbtn);
	}
	public List<WebElement> SelectDate(){
		return driver.findElements(seldate);
	}
	
	private By travelrandclass = By.xpath("//span[@class='lbl_input latoBold appendBottom5']");
	private By adult = By.xpath("(//ul[@class='guestCounter font12 darkText gbCounter'])[1]/li");
	private By cls= By.xpath("//ul[@class='guestCounter classSelect font12 darkText']/li");
	
	public WebElement TravelClass() {
		return driver.findElement(travelrandclass);
	}
	public List<WebElement> Adult(){
		return driver.findElements(adult);
	}
	public List<WebElement> Cls(){
		return driver.findElements(cls);
	}
	
	private By apply = By.xpath("//button[@data-cy='travellerApplyBtn']");
	public WebElement applybtn() {
		return driver.findElement(apply);
	}
	
	private By search = By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']");
	public WebElement Search() {
		return driver.findElement(search);
	}
	private By firetype = By.xpath("//li[@class='font12 blackText latoBold wrapFilter  ']");
	public List<WebElement> Firetype(){
		return driver.findElements(firetype);
	}
	
	//Flight List Page
	
	private By refresh = By.xpath("//button[@class='button buttonPrimary buttonBig fontSize14']");
	public WebElement Refresh () {
		return driver.findElement(refresh);
	}
	
	private By acceptpopup = By.xpath("//button[@class='button buttonSecondry buttonBig fontSize12 relative']");
	public WebElement AcceptPopup() {
		return driver.findElement(acceptpopup);
	}

	private  By viewprice = By.xpath("(//span[@class='appendRight8'])[1]");
	public WebElement ViewPrice() {
		return driver.findElement(viewprice);
	}
	private By booknow = By.xpath("//button[@class='button corp-btn latoBlack buttonPrimary fontSize13  ']");
		public WebElement BookNow() {
			return driver.findElement(booknow);
	}
	private By acceptnotice = By.xpath("//span[@class='fontSize14 appendRight17 blueText capText cancelBtn blackFont']");
	public WebElement AcceptNotice() {
		return driver.findElement(acceptnotice);
	} 
	
	//Passenger Details page
	private By addnewadult = By.xpath("//button[@class='addTravellerBtn']");
	public WebElement AddNewAdult() {
		return driver.findElement(addnewadult);
	}
	private By firstname = By.xpath("//input[@placeholder='First & Middle Name']");
	public WebElement FirstName() {
		return driver.findElement(firstname);
	}
	private By lastname = By.xpath("//input[@placeholder='Last Name']");
	public WebElement LastName() {
		return driver.findElement(lastname);
	}
	private By gender = By.xpath("//span[@class='selectTabText']");
	public List<WebElement> Gender(){
		return driver.findElements(gender);
	}
	
	private By wheelchairdropdown = By.xpath("(//div[@class='dropdown__indicators css-1wy0on6'])[1]");
	public WebElement WheelchairDropDown() {
		return driver.findElement(wheelchairdropdown);
	}
	private By mobileno = By.xpath("//input[@placeholder='Mobile No']");
	public WebElement Mobile() {
		return driver.findElement(mobileno);
	}
	private By email = By.xpath("//input[@placeholder='Email']");
	public WebElement Email() {
		return driver.findElement(email);
	}
	private By continueButton = By.xpath("//button[@class='lato-black button buttonPrimary extraPadBtn fontSize16 ']");
	public WebElement Continuebtn() {
		return driver.findElement(continueButton);
	}
}
