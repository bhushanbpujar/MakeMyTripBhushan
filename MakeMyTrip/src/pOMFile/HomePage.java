package pOMFile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage 
{
	@FindBy(xpath="//input[@id='fromCity']")
	private WebElement from;
	public WebElement getFrom() 
	{
		return from;
	}
	
	@FindBy(xpath="//input[@id='toCity']")
	private WebElement to;
	public WebElement getTo() 
	{
		return to;
	}
	
	@FindBy(xpath="//ul[@role='listbox']/li//p[contains(.,'Bengaluru')]")
	private WebElement bengaluru;
	public WebElement getBengaluru() {
		return bengaluru;
	}
	
	@FindBy(xpath="//ul[@role='listbox']/li//p[contains(.,'Mumbai')]")
	private WebElement mumbai;
	public WebElement getMumbai() {
		return mumbai;
	}
	
	@FindBy(xpath="//input[@id='departure']/preceding-sibling::span")
	private WebElement departure;
	public WebElement getDeparture() {
		return departure;
	}
	
	@FindBy(xpath="//input[@id='return']")
	private WebElement returnElement;
	public WebElement getReturnElement() {
		return returnElement;
	}
	
	@FindBy(xpath="//li[contains(.,'Round Trip')]")
	private WebElement roundTrip;
	public WebElement getRoundTrip() {
		return roundTrip;
	}
	
	@FindBy(xpath="//a[contains(.,'Search')]")
	private WebElement search;
	public WebElement getSearch() {
		return search;
	}
	
	@FindBy(xpath="//div[@class='DayPicker-Months']//div[text()='October']/../following-sibling::div[@class='DayPicker-Body']//p[text()='16']")
	private WebElement fromDate;
	public WebElement getFromDate() {
		return fromDate;
	}
	
	@FindBy(xpath="//div[@class='DayPicker-Months']//div[text()='November']/../following-sibling::div[@class='DayPicker-Body']//p[text()='20']")
	private WebElement toDate;
	public WebElement getToDate() {
		return toDate;
	}
	
	@FindBy(xpath="//div[@id='filter--wrapper']//a[contains(.,'+ 2 airlines')]")
	private WebElement airlinesFilter;
	public WebElement getAirlinesFilter() {
		return airlinesFilter;
	}
	
	@FindBy(xpath="//div[@id='filter--wrapper']//span[text()='Spicejet']")
	private WebElement spicejet;
	public WebElement getSpicejet() {
		return spicejet;
	}
	
	@FindBy(xpath="//a[text()='Apply']")
	private WebElement applyFilters;
	public WebElement getApplyFilters() {
		return applyFilters;
	}
	
	@FindBy(xpath="//button[@id='sorter_btn_return121']")
	private WebElement sort;
	public WebElement getSort() {
		return sort;
	}
	
	@FindBy(xpath="//span[@aria-label='Next Month']")
	private WebElement nextMonthArrow;
	public WebElement getNextMonthArrow() {
		return nextMonthArrow;
	}
	
	@FindBy(xpath="//p[contains(.,' Login or Create Account')]/../..]")
	private WebElement loginButton;
	public WebElement getLoginButton() {
		return loginButton;
	}
	
}
