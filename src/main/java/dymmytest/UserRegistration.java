package dymmytest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	  String validFirstNameFormat = "^[A-Z][a-z]{2,}";
	  String validLastNameFormat = "^[A-Z][a-z]{2,}";
	  String validEmailRegex = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})";
	  String validMobileNo = "^[0-9]{2}[ ][0-9]{10}$";
	  String validPassword = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&])[A-Za-z0-9@$!%*?&]{8,}$";
	 boolean validate(String userInput ) throws InvalidFirstNameException
	 {
		try {
			
		
		Pattern compile =Pattern.compile( validFirstNameFormat  ); 
		
		Matcher match= compile.matcher(userInput);
		
		Boolean result = match.matches();
		if(result)
		{
			return true;
			
		 
		}else 
			throw new InvalidFirstNameException("Enter valid FirstName");
		} catch (Exception e) {
			throw new InvalidFirstNameException("Enter valid FirstName");
		}
	  }
	 boolean validatelastName(String userInput ) throws InvalidLastNameException
	 {
	 	try {
	 	Pattern compile =Pattern.compile( validLastNameFormat  ); 
	 	
	 	Matcher match= compile.matcher(userInput);
	 	
	 	Boolean result = match.matches();
	 	if(result)
	 	{
			return true; 
			 
		}else 
			throw new InvalidLastNameException("Enter valid LastName");
		} catch (Exception e) {
			throw new InvalidLastNameException("Enter valid LastName");
		}
	 	
	 	
	    }
	 
	 boolean checkMobileNo(String userInput)  throws InvalidMobileNoException{
         try {
		  Pattern compile =Pattern.compile( validMobileNo ); 
			
			Matcher match= compile.matcher(userInput);
			
			Boolean result = match.matches();
			
			if(result)
		 	{
				return true; 
				 
			}else 
				throw new InvalidMobileNoException("Enter valid MobileNo");
			} catch (Exception e) {
				throw new InvalidMobileNoException("Enter valid MobileNo");
			}
	 }
	 
	 
	 boolean checkEmailId(String userInput1) throws InvalidEmailException {
			try {
		  Pattern compile =Pattern.compile(validEmailRegex);   
			Matcher match= compile.matcher(userInput1);
			
			Boolean result = match.matches();
			if(result)
		 	{
				return true; 
				 
			}else 
				throw new InvalidEmailException("Enter valid Email");
			} catch (Exception e) {
				throw new InvalidEmailException("Enter valid Email");
			}

  
	 }
	 
	 boolean passwordValid(String userInput)  throws InvalidPasswordException{
			
			try {
		   Pattern compile =Pattern.compile( validPassword ); 
			
			Matcher match= compile.matcher(userInput);
			
			Boolean result = match.matches();
			if(result)
		 	{
				return true; 
				 
			}else 
				throw new InvalidPasswordException("Enter valid Password");
			} catch (Exception e) {
				throw new InvalidPasswordException("Enter valid Password");
			}
		
	 
}
}

