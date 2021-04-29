package dymmytest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	  String validFirstNameFormat = "^[A-Z][a-z]{2,}";
	  String validLastNameFormat = "^[A-Z][a-z]{2,}";
	  String validEmailRegex = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})";
	  String validMobileNo = "^[0-9]{2}[ ][0-9]{10}$";
	  String validPassword = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&])[A-Za-z0-9@$!%*?&]{8,}$";
	 boolean validate(String userInput )
	 {
		
		Pattern compile =Pattern.compile( validFirstNameFormat  ); 
		
		Matcher match= compile.matcher(userInput);
		
		Boolean result = match.matches();
		if(result)
		{
			return true;
			
		 
		}else 
			return false;
			
	  }
	 boolean validatelastName(String userInput )
	 {
	 	
	 	Pattern compile =Pattern.compile( validLastNameFormat  ); 
	 	
	 	Matcher match= compile.matcher(userInput);
	 	
	 	Boolean result = match.matches();
	 	if(result)
	 	{
			return true; 
		}else 
		{
			return false;
		}	
	 	
	 	
	 	
	    }
	 
	 boolean checkMobileNo(String userInput) {
         
		  Pattern compile =Pattern.compile( validMobileNo ); 
			
			Matcher match= compile.matcher(userInput);
			
			Boolean result = match.matches();
			
       
               if (result) {
                       return true;

               }else 
			return false;
	 }
	 
	 
	 boolean checkEmailId(String userInput1) {
			
		  Pattern compile =Pattern.compile(validEmailRegex);   
			Matcher match= compile.matcher(userInput1);
			
			Boolean result = match.matches();
			if(result) {
			return true;}
			else
				return false;
			  


  
	 }
	 
	 boolean passwordValid(String userInput) {
			
			
		   Pattern compile =Pattern.compile( validPassword ); 
			
			Matcher match= compile.matcher(userInput);
			
			Boolean result = match.matches();
				return result;

		}
	 
}

