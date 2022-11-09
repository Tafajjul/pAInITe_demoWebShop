package com.mohs10.or;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;
import com.mohs10.base.StartBrowser;

public class Homepage1 {
	
	
	//login
	public static By lnkLogin = By.xpath("//a[@href='/login']");
	public static By txtemail = By.className("email");
	public static By txtpwd = By.className("password");
	public static By btnlogin = By.xpath("//input[@value='Log in']");
	public static By lnkLogout = By.xpath("//a[@class='ico-logout']");
	
	//click on book and add to cart
	public static By lnkBooks = By.xpath("(//a[@href='/books'])[1]");
	public static By lnkbook1= By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[1]");
	public static By lnkbook2= By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[2]");
	public static By lnkbook3= By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[3]");
	
	//link of 2 products
	public static By lnkbook11=By.linkText("Computing and Internet");
	public static By lnkbook12=By.linkText("Fiction");
	
	
	public static By spngcart1= By.xpath("//span[.='Shopping cart']");
	public static By clkremovecart1= By.xpath("//input[@name='removefromcart']");
	public static By updatecart= By.xpath("//input[@value='Update shopping cart']");
	public static By checkbox= By.xpath("//input[@name='termsofservice']");
	public static By checkout= By.xpath("//button[@name='checkout']");

	//Billing address
	public static By txtcompany= By.xpath("(//input[@class='text-box single-line'])[4]");
	public static By txtcity= By.xpath("(//input[@class='text-box single-line'])[5]");
	
	public static By txtadd1= By.xpath("(//input[@data-val='true'])[6]");
	public static By txtzip= By.xpath("(//input[@data-val='true'])[7]");
	public static By txtphNo= By.xpath("(//input[@data-val='true'])[8]");
	public static By txtcountry=By.xpath("//select[@data-val-required='Country is required.']");
	
//continue button in billing section
	public static By lnkcontinue=By.xpath("(//input[@class='button-1 new-address-next-step-button'])[1]");
//continue button
	public static By lnkcontinue2=By.xpath("//input[@onclick='Shipping.save()']");
//billing method continue button	
	public static By lnkcontinue3=By.xpath("//input[@onclick='ShippingMethod.save()']");
//Payment method continue button
	public static By lnkcontinue4=By.xpath("//input[@onclick='PaymentMethod.save()']");
//payment info continue button
	public static By lnkcontinue5=By.xpath("//input[@onclick='PaymentInfo.save()']");
//confirm order link button
	public static By lnkconfirmorder=By.xpath("//input[@onclick='ConfirmOrder.save()']");
	
	
	//new Billing address
	public static By dropdownadd=By.xpath("//select[@name='billing_address_id']");
	
	

}
