package com.mohs10.scripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.CommonFuns;

	public class HomeTest extends StartBrowser{
	
		
		//Testing with Valid inputs #3
		
		
		  @Test(priority = 1) 
		  public void LoginPageTestCase() throws Exception
		  {
		  CommonFuns hm2 = new CommonFuns(); 
		  hm2.logIn("anishapatel44@gmail.com", "anishapatel123");
		  Thread.sleep(5000); }
		  
		 

	
	//Clicking on Categories links #4
	
	  @Test(priority = 2)
	  public void CategoriesTest() throws Exception {
	  CommonFuns cat = new CommonFuns(); 
	  cat.Categories();
	  Thread.sleep(5000); }
	 
	
	/*
	 * @Test(priority = 3) public void Bookclick() throws Exception { CommonFuns
	 * cat1 = new CommonFuns(); cat1.Booksclick(); Thread.sleep(5000); }
	 */
	
	  @Test(priority = 3)
	  public void CategoriesTet() throws Exception 
	  {
		  CommonFuns cat = new CommonFuns(); 
		  cat.bookaddtocart();
		  Thread.sleep(5000); }
	  
	  @Test(priority = 4)
	  public void CategoriesTe() throws Exception
	  {
	CommonFuns cat = new CommonFuns(); 
	cat.bookaddtocart2(); 
	Thread.sleep(5000);
	}
	 

 
/*
 * @Test(priority=6) public void Billingaddmethod() throws Exception {
 * CommonFuns cat = new CommonFuns(); cat.BillingAdd("Mohs10", "Bhubneshwar",
 * "Patia", "751024", "7277393227",""); Thread.sleep(5000); }
 */
	  //execute save address
		
		  @Test(priority=7) 
		  public void Billingaddclickmethod() throws Exception
		  {
		  CommonFuns cat = new CommonFuns();
		  cat.BillingAdd1();
		  Thread.sleep(2000);
		  }
		 
	  //Add new billing address
	  @Test(priority=5)
	  public void BillingNewaddclickmethod() throws Exception {
	  CommonFuns cat = new CommonFuns();
	  cat.NewBillingAdd();
	  Thread.sleep(2000); 
	  }

	
	//Registration of new user #6
/*	@Test
	public void RegisterPageTestCase() throws Exception {
		CommonFuns hm = new CommonFuns();
			  hm.Register("Manish", "Koylag", "manishkoya@hotmail.com", "Tes@444", "Tes@444");
			  Thread.sleep(5000);
		  } */
	
	
	}
	