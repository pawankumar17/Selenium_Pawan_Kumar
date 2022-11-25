package day3old;

import org.testng.annotations.Test;

public class MyFirstTestNG {
	@Test(priority = 1)
	public void login() {
		System.out.println("Login Done");
	}
	
	@Test
	public void createAccount() {
		System.out.println("Account Created");
	}
	
	@Test
	public void deleteAccount() {
		System.out.println("Account Deleted");
	}
	@Test(priority=1)
	public void logoutFromApplication() {
		System.out.println("Logout Application");
	}
	

}
