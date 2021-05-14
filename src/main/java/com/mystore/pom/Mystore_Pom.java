package com.mystore.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mystore_Pom {
	public static WebDriver driver;
	
	public Mystore_Pom (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="email")
	private WebElement email;
	public WebElement getEmail() {
		return email;
	}
	@FindBy(id="passwd")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	} 
	@FindBy(name="SubmitLogin")
	private WebElement login;
	public WebElement getLogin() {
		return login;
	}
	@FindBy(xpath="//a[@title='Women']")
	private WebElement selectwomen;
	public WebElement getSelectwomen() {
		return selectwomen;
	}
	@FindBy(xpath="(//a[@title='Evening Dresses'])[1]")
	private WebElement evegdress;
	public WebElement getEvegdress() {
		return evegdress;
	}
	@FindBy(xpath="(//img[@class='replace-2x img-responsive'])[2]")
	private WebElement quickview;
	public WebElement getQuickview() {
		return quickview;
	}
	@FindBy(xpath="//iframe")
	private WebElement frames;
	public WebElement getFrames() {
		return frames;
	}
	@FindBy(xpath="//button[@class='exclusive']")
	private WebElement addtokart;
	public WebElement getAddtokart() {
		return addtokart;
	}
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement checkout;
	public WebElement getCheckout() {
		return checkout;
	}
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement sumary;
	public WebElement getSumary() {
		return sumary;
	}
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement adress;
	public WebElement getAdress() {
		return adress;
	}
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkbox;
	public WebElement getCheckbox() {
		return checkbox;
	}
	@FindBy(xpath="//button[@name='processCarrier']")
	private WebElement submit;
	public WebElement getSubmit() {
		return submit;
	}
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	private WebElement bank;
	public WebElement getBank() {
		return bank;
	}
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement confirm;
	public WebElement getConfirm() {
		return confirm;
	}
	

}
