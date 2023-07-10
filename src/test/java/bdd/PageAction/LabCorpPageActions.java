package bdd.PageAction;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import bdd.PageElements.LabcorpPageLocators;
import bdd.utilities.SetupDrivers;

public class LabCorpPageActions extends SetupDrivers {

	LabcorpPageLocators LabcorpPageLocatorsobj;




	public LabCorpPageActions(){
		LabcorpPageLocatorsobj=new LabcorpPageLocators();
		PageFactory.initElements(SetupDrivers.driver, LabcorpPageLocatorsobj);
	}

	public void loadLabCorpHomePage(){
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.get("https://www.labcorp.com");
		SetupDrivers.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}



	public void applyJob() throws InterruptedException{
		SetupDrivers.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LabcorpPageLocatorsobj.linkText.click();

		JavascriptExecutor jsx = (JavascriptExecutor)driver;	
		jsx.executeScript("window.scrollBy(0,4500)", "");

		Thread.sleep(2000); 
		
		LabcorpPageLocatorsobj.clkIT.click();

		LabcorpPageLocatorsobj.clkTitle.click();

		//Validations
		System.out.println("Validated Title is--"+driver.getTitle());
		System.out.println("---------------------------");
		System.out.println("Validated URL is--"+driver.getCurrentUrl());

		System.out.println("---------------------------");

		String ln = "Raritan, New Jersey, United States of America";

		if ( driver.getPageSource().contains("Raritan, New Jersey, United States of America")){
			System.out.println("Validated location : " + ln + " is present. ");
		} else {
			System.out.println("Validated location : " + ln + " is not present. ");
		}

		System.out.println("---------------------------");


		String id = "2341300";

		if ( driver.getPageSource().contains("2341300")){
			System.out.println("Validated Job ID : " + id + " is present. ");
		} else {
			System.out.println("Validated Job ID : " + id + " is not present. ");
		}

		System.out.println("---------------------------");


		String Sn = "The Quality Analyst allows the laboratory to provide quality results to our providers and patients, which increases customer satisfaction and solidifies loyalty for our company.";
		if ( driver.getPageSource().contains("The Quality Analyst allows the laboratory to provide quality results to our providers and patients, which increases customer satisfaction and solidifies loyalty for our company.")){
			System.out.println("Validated Last sentence of first paragraph : " + Sn + " is present. ");
		} else {
			System.out.println("Validated Last sentence of first paragraph : " + Sn + " is not present. ");
		}


		System.out.println("---------------------------");

		String bp = "Assist staff with training, Master Control, and competency; Monitor progress and use of all aspects of Master Control system";

		if ( driver.getPageSource().contains("Assist staff with training, Master Control, and competency; Monitor progress and use of all aspects of Master Control system"))

		{	  
			System.out.println("Validated 2nd bullet point : " + bp + " is present. ");
		} else {

			System.out.println("Validated 2nd bullet point : " + bp + " is not present. ");
		}


		System.out.println("---------------------------");


		String req = "Minimum 2 years of experience as a Medical Technologist";

		if ( driver.getPageSource().contains("Minimum 2 years of experience as a Medical Technologist")){
			System.out.println("Validated Job requirement : " + req + " is present. ");
		} else {
			System.out.println("Validated Job requirement : " + req + " is not present. ");
		}


		System.out.println("---------------------------");


		String exp = "CAP";

		if ( driver.getPageSource().contains("CAP")){
			System.out.println("Validated with contains : " + exp + " is present. ");
		} else {
			System.out.println("Validated with contains  : " + exp + " is not present. ");
		}


		LabcorpPageLocatorsobj.clkApply.click();

		Thread.sleep(5000);
		
		String originalWindow = driver.getWindowHandle();


		for (String windowHandle : driver.getWindowHandles()) {
			if(!originalWindow.contentEquals(windowHandle)) {
				driver.switchTo().window(windowHandle);

			}}


		LabcorpPageLocatorsobj.clkReturn.click();

	}}


