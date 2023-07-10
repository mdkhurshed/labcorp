package bdd.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LabcorpPageLocators {
	


	@FindBy(linkText="Careers")
	//@FindBy(xpath="//a[@class='no-ext']")
	public WebElement linkText;
	
	
	@FindBy(xpath="//ppc-content[@data-ph-id='ph-widget-element-1649347718824-1005']")
	public WebElement clkIT;
	
	@FindBy(linkText="Clinical Laboratory Quality Analyst – CORE & STAT Labs")
	public WebElement clkTitle;
	
	@FindBy(xpath="//ppc-content[@data-ph-at-id='apply-text']")
	public WebElement clkApply;
	
	
	@FindBy(xpath="//button[@data-automation-id='navigationItem-Careers Home']")
	public WebElement clkReturn;


	
 }
