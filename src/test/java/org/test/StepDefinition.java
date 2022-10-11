package org.test;

import org.baseUtilsclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.pageObject.LetCodeInitialPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class StepDefinition extends BaseClass{

	LetCodeInitialPage code;
	
	@Given("Url has been provided")
	public void url_has_been_provided() {
		browserLaunch("chrome", "https://letcode.in/");
	}
	@When("click WorkSpace button")
	public void click_work_space_button() {
		code = new LetCodeInitialPage(driver);
	    clickButton(code.getWorkspace());
	}
	@When("click Courses button")
	public void click_courses_button() {
	    clickButton(code.getCourses());
	}
	@When("click Product button")
	public void click_product_button() {
	    clickButton(code.getProduct());
	}
	@When("Click SignUp button")
	public void click_sign_up_button() {
	    clickButton(code.getSignUp());
	}
	@When("Click Login button")
	public void click_login_button() {
	   clickButton(code.getLogin()); 
	}
	@When("click Letcode Logo")
	public void click_letcode_logo() {
	    clickButton(code.getLetCodeLogo());
	}
	@When("Validate LetCode with Koushik text mentioned prefectly")
	public void validate_let_code_with_koushik_text_mentioned_prefectly() {
	    String text = text(code.getLetCodeTitle());
	    System.out.println(text);
	    
	}
	@When("Click Buy Me a Beer button")
	public void click_buy_me_a_beer_button() throws InterruptedException {
	    clickButton(code.getBuyMELogo());
	    Thread.sleep(10000);
	    
	}
	@When("Navigate back to the Initial Page")
	public void navigate_back_to_the_initial_page() {
	    back();
	}
	@When("Scroll down to WorkSpace option and click")
	public void scroll_down_to_work_space_option_and_click() throws InterruptedException {
		scrolldown(code.getExploreWorkSpace());
		elementClickable(code.getExploreWorkSpace());
		javaScriptClick(code.getExploreWorkSpace());
		Thread.sleep(10000);
	}
	@When("Navigate back")
	public void navigate_back() {
	    back();
	    
	}
	@When("Click on the Courses button on the middle of the page")
	public void click_on_the_courses_button_on_the_middle_of_the_page() {
	    javaScriptClick(code.getExploreCourses());
	    back();
	}
	@When("Click on Test Practice button")
	public void click_on_test_practice_button() {
	    javaScriptClick(code.getTestPractice());
	    back();
	}
	@When("Click on LetXpath Product button")
	public void click_on_let_xpath_product_button() {
	    javaScriptClick(code.getLetXpath());
	}
}
