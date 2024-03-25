package com.acti.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class CustomerModule {
	@Test
public void createCustomer() {
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com");
		System.out.println(d.getTitle());
Reporter.log("createCustomer",true);
}
}
