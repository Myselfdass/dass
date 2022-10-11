package org.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LetCodeInitialPage {

	@FindBy(xpath = "//img[@alt=\"letcode\"]")
	private WebElement letCodeLogo;
	
	@FindBy(xpath = "//a[@id=\"testing\"]")
	private WebElement workspace;
	
	@FindBy(xpath = "//a[text()='Courses']")
	private WebElement Courses;
	
	@FindBy(xpath = "//a[text()='Product']")
	private WebElement product;
	
	@FindBy(xpath = "//a[text()='Sign up']")
	private WebElement signUp;
	
	@FindBy(xpath = "//a[text()='Log in']")
	private WebElement login;
	
	@FindBy(xpath = "//h1[text()=' LetCode with Koushik']")
	private WebElement letCodeTitle;
	
	@FindBy(xpath = "//img[@src=\"https://img.buymeacoffee.com/button-api/?text=Buy me a beer&emoji=🍺&slug=letcode&button_colour=FF5F5F&font_colour=ffffff&font_family=Cookie&outline_colour=000000&coffee_colour=FFDD00\"]")
	private WebElement BuyMELogo;
	
	@FindBy(xpath = "//a[text()='Explore Workspace']")
	private WebElement exploreWorkSpace;
	
	@FindBy(xpath = "//a[text()='Explore courses']")
	private WebElement exploreCourses;
	
	@FindBy(xpath = "//a[text()='Test Practice']")
	private WebElement testPractice;
	
	@FindBy(xpath = "//a[text()='LetXPath']")
	private WebElement letXpath;

	public WebElement getLetCodeLogo() {
		return letCodeLogo;
	}

	public WebElement getWorkspace() {
		return workspace;
	}

	public WebElement getCourses() {
		return Courses;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getSignUp() {
		return signUp;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getLetCodeTitle() {
		return letCodeTitle;
	}

	public WebElement getBuyMELogo() {
		return BuyMELogo;
	}

	public WebElement getExploreWorkSpace() {
		return exploreWorkSpace;
	}

	public WebElement getExploreCourses() {
		return exploreCourses;
	}

	public WebElement getTestPractice() {
		return getExploreWorkSpace();
	}

	public WebElement getLetXpath() {
		return letXpath;
	}
	
	public LetCodeInitialPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
}