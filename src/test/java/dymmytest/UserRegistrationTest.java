package dymmytest;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import junit.framework.Assert;

import static org.junit.Assert.*;

import org.junit.Rule;


 

public class UserRegistrationTest {
 @Rule public ExpectedException exception = ExpectedException.none();
	
	@Test
	
	public void givenFirstname_WhenProper_ShouldReturnTrue(){
		
		UserRegistration classUnderTest = new UserRegistration();
		boolean result;
		try {
			result = classUnderTest.validate("Anikesh");
			Assert.assertEquals(true, result);
		} catch (InvalidFirstNameException e) {
		
			e.getMessage();
		}
		
	}
	@Test
	public void givenFirstname_WhenShort_ShouldReturnFalse(){
		UserRegistration classUnderTest = new UserRegistration();
		boolean result;
		try {
			result = classUnderTest.validate("Ma");
			Assert.assertEquals(false, result);
		} catch (InvalidFirstNameException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	
	}
	@Test
	public void givenFirstname_WhenSmall_ShouldReturnfalse(){
		UserRegistration classUnderTest = new UserRegistration();
		boolean result;
		try {
			result = classUnderTest.validate("anikesh");
			Assert.assertEquals(false, result);
		} catch (InvalidFirstNameException e) {
			
			e.getMessage();
		}
		
	}
	
	@Test
	public void givenLastname_WhenProper_ShouldReturnTrue(){
		UserRegistration classUnderTest = new UserRegistration();
		boolean result;
		try {
			result = classUnderTest.validatelastName("Mahajan");
			Assert.assertEquals(true, result);
		} catch (InvalidLastNameException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	
	}
	
	@Test
	public void givenLastname_WhenShort_ShouldReturnFalse(){
		UserRegistration classUnderTest = new UserRegistration();
		boolean result;
		try {
			result = classUnderTest.validatelastName("Ma");
			Assert.assertEquals(false, result);
		} catch (InvalidLastNameException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	
	}
	@Test
	public void givenLastname_WhenSmall_ShouldReturnTrue(){
		UserRegistration classUnderTest = new UserRegistration();
		boolean result;
		try {
			result = classUnderTest.validatelastName("anikesh");
			Assert.assertEquals(false, result);
		} catch (InvalidLastNameException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		
	}
	
	
	@Test
	public void givenMobileNo_WhenProper_ShouldReturnTrue(){
		UserRegistration classUnderTest = new UserRegistration();
		boolean result;
		try {
			result = classUnderTest.checkMobileNo("91 9149820208");
			Assert.assertEquals(true, result);
		} catch (InvalidMobileNoException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		
	}
	
	@Test
	public void givenMobileNo_WhenSmall_ShouldReturnFalse(){
		UserRegistration classUnderTest = new UserRegistration();
		boolean result;
		try {
			result = classUnderTest.checkMobileNo("91 91490208");
			Assert.assertEquals(false, result);
		} catch (InvalidMobileNoException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	
	}
	
	@Test
	public void givenMobileNo_WhenGreater_ShouldReturnFalse(){
		UserRegistration classUnderTest = new UserRegistration();
		boolean result;
		try {
			result = classUnderTest.checkMobileNo("91 4567791490208");
			Assert.assertEquals(false, result);
		} catch (InvalidMobileNoException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		
	}
	

	
	
	
	
	
	
	
}
