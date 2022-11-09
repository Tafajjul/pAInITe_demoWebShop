package com.mohs10.reuse;
	import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.GraphicsDevice;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mohs10.base.StartBrowser;
import com.mohs10.ActionDriver.Action;
import com.mohs10.or.Homepage1;

	public class CommonFuns {
		
		public WebDriverWait wait;
		public Action aDriver;
		public WebDriver driver;
		//Select sel;
		public Robot r;
		
		public CommonFuns() throws AWTException
		{
			aDriver = new Action();
			driver = StartBrowser.driver;
			//sel=new Select(Homepage1.txtcountry);
			
			r=new Robot();
		}
		
		// Registration process
		/*
		 * public void Register(String Firstname, String Lastname, String Email, String
		 * Pwd, String ConfirmPwd) throws Exception { StartBrowser.childTest =
		 * StartBrowser.parentTest.createNode("Register in DemoWeb shop");
		 * aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
		 * aDriver.click(HomePage.lnkRegister, "Register link");
		 * aDriver.click(HomePage.rbGender, "Radio button Gender");
		 * aDriver.type(HomePage.txtFirstname, Firstname, "FirstName text box");
		 * aDriver.type(HomePage.txtLastname, Lastname, "LastName text box");
		 * aDriver.type(HomePage.txtEmail, Email, "Email text box");
		 * aDriver.type(HomePage.txtPassword, Pwd, "password text box");
		 * aDriver.type(HomePage.txtConfirmpassword, ConfirmPwd,
		 * "confirm password text box"); aDriver.click(HomePage.btnRegister,
		 * "Register button"); aDriver.click(HomePage.btnContinue, "Continue button"); }
		 */
				
			//Login process
				public void logIn(String email, String pwd) throws Exception
				{
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Login to DemoWeb shop");
					aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
					aDriver.click(Homepage1.lnkLogin, "Login link");
					aDriver.type(Homepage1.txtemail, email, "email text box");
					aDriver.type(Homepage1.txtpwd, pwd, "password text box");
					aDriver.click(Homepage1.btnlogin, "Login button");
				//	aDriver.click(HomePage.lnkLogout, "Logout link");
				}
				
				 
		
		
		  //Categories
		  public void Categories() throws Exception 
		  {
			  	StartBrowser.childTest = StartBrowser.parentTest.createNode("Category links");
				aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
				aDriver.click(Homepage1.lnkBooks, "Performed click operation on books link");
				
				aDriver.click(Homepage1.lnkbook1, "Performed click operation on book1 add to cart");
				Thread.sleep(2000);
				aDriver.click(Homepage1.lnkbook2, "Performed click operation on book2 add to cart");
			
			/*
			 * if(lnkbook11.contains("Computing and Internet") && lnkbook12.contains("Fiction"))
			 * System.out.println("Comparision successful"); else
			 * System.out.println("Comparision unsuccessful");
			 */
		  }
		 
		  //test case1
		  public void bookaddtocart() throws Exception 
		  {
			  	StartBrowser.childTest = StartBrowser.parentTest.createNode("Shopping cart links");
			  	aDriver.click(Homepage1.spngcart1, "Performed click operation on shopping cart link");
			  	Thread.sleep(2000);
				aDriver.click(Homepage1.clkremovecart1, "Performed click operation on removefromcart");
				aDriver.click(Homepage1.updatecart, "Performed click operation on update cart link");
	}

		  //test case 2
			
			  public void bookaddtocart2() throws Exception { StartBrowser.childTest =
			  StartBrowser.parentTest.createNode("Category links");
			  aDriver.click(Homepage1.lnkBooks, "Performed click operation on books link");
			  aDriver.click(Homepage1.lnkbook1, "Performed click operation on book3 link");
			  aDriver.click(Homepage1.spngcart1,
			  "Performed click operation on shopping cart link");
			  aDriver.click(Homepage1.checkbox, "Performed click operation on checkbox");
			  aDriver.click(Homepage1.checkout,
			  "Performed click operation on checkout link"); }
			 
			 
			 
			 public void BillingAdd(String company, String city, String add1, String zip, String phNo, String country) throws Exception
				{
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Fill the billing address");
					aDriver.type(Homepage1.txtcompany, company, "company name");
					aDriver.type(Homepage1.txtcity, city, "city text box");
					Thread.sleep(1000);
					aDriver.type(Homepage1.txtadd1, add1, "address text box");
					Thread.sleep(1000);
					aDriver.type(Homepage1.txtzip, zip, "zip code text box");
					Thread.sleep(1000);
					aDriver.type(Homepage1.txtphNo, phNo, "phone no text box");
					aDriver.click(Homepage1.txtcountry, country);
					Robot r= new Robot();
					for(int i=0;i<80;i++) {
						//Thread.sleep(100);
					r.keyPress(KeyEvent.VK_DOWN);
					r.keyRelease(KeyEvent.VK_DOWN);
					}
					r.keyPress(KeyEvent.VK_ENTER);
					r.keyRelease(KeyEvent.VK_ENTER);
					
					//wait=new WebDriverWait(driver, 30);
					//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@value='Continue'])[5]")));
					
					aDriver.click(Homepage1.lnkcontinue, "billind address continue button");
					Thread.sleep(500);
					aDriver.click(Homepage1.lnkcontinue2, "shipping address continue button");
					Thread.sleep(500);
					aDriver.click(Homepage1.lnkcontinue3, "shipping method continue button");
					Thread.sleep(500);
					aDriver.click(Homepage1.lnkcontinue4, "payment method continue button");
					Thread.sleep(500);
					aDriver.click(Homepage1.lnkcontinue5, "payment information continue button");
					Thread.sleep(500);
					aDriver.click(Homepage1.lnkconfirmorder, "confirm order continue button");
				}
			 
			 public void BillingAdd1() throws Exception
			 {
			 StartBrowser.childTest = StartBrowser.parentTest.createNode("Fill the billing address");
			 aDriver.click(Homepage1.lnkcontinue, "billind address continue button");
				Thread.sleep(500);
				aDriver.click(Homepage1.lnkcontinue2, "shipping address continue button");
				Thread.sleep(500);
				aDriver.click(Homepage1.lnkcontinue3, "shipping method continue button");
				Thread.sleep(500);
				aDriver.click(Homepage1.lnkcontinue4, "payment method continue button");
				Thread.sleep(500);
				aDriver.click(Homepage1.lnkcontinue5, "payment information continue button");
				Thread.sleep(500);
				aDriver.click(Homepage1.lnkconfirmorder, "confirm order continue button");
				Thread.sleep(500);
		 }
			 public void NewBillingAdd() throws Exception
			 {
				 StartBrowser.childTest = StartBrowser.parentTest.createNode("Fill the billing address");
				 aDriver.click(Homepage1.dropdownadd, "add new address");
				 Robot r= new Robot();
					r.keyPress(KeyEvent.VK_DOWN);
					r.keyRelease(KeyEvent.VK_DOWN);
					Thread.sleep(2000);
					r.keyPress(KeyEvent.VK_ENTER);
					r.keyRelease(KeyEvent.VK_ENTER);
			 }
		
			
		}

