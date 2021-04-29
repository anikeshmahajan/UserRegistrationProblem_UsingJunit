package dymmytest;


import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ValidPasswordTest
{
	private String passwordTest;
	private boolean expectedResultt;
	public ValidPasswordTest(String password, boolean expectedResult)
	{
		
		this.passwordTest = password;
		this.expectedResultt = expectedResult;
	}
	@Parameterized.Parameters
	public static Collection input()
	{
		return Arrays.asList(new Object [][] { {"Anikesh@112",  true},
											{"ANikesh@1234",true},
											{"anikesh@123",false},
											{"anikeshmahajan",false},
											{"123645678900",false},
											{"@anikesh1234",false}
		});
	}
	@Test
	public void givenPasswordAsVar_ShouldReturnPerfectResult()
	{
		UserRegistration userRegistration= new UserRegistration();
		boolean result = userRegistration.passwordValid(passwordTest);
		Assert.assertEquals(expectedResultt, result);
	}

}
