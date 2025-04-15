package TESTNG;

import org.testng.annotations.Test;

import jakarta.annotation.Priority;

public class TESTCASE1 {
	@Test (priority=-1)
	void openapp() {
		System.out.println("openapplication....");
		
		
	}
	@Test(priority=0)
	void login() {
		System.out.println("login to application....");
		
	}
	@Test(priority=1)
	void logout() {
		System.out.println("logout to application....");
	
		

	}
	
}
