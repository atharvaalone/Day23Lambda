


import junit.framework.Assert;
import org.junit.Test;

import java.util.function.Predicate;

public class UserRegistrationTest {


    @Test
    public void testValidFirstName() {
        String firstName = "Atharva";
        Predicate<String> isFirstNameValid = name -> name.matches("[a-zA-Z]{1,8}");
        Assert.assertTrue(isFirstNameValid.test(firstName));
    }




    @Test
    public void testValidLastName() {
        String lastName = "Alone";
        Predicate<String> isLastNameValid = name->name.matches("[a-zA-Z]{1,8}");
        Assert.assertTrue(isLastNameValid.test(lastName));
    }


    @Test
    public void testValidEmail() {
        String email = "test@example.com";
        Predicate<String> isEmailValid = name->name.matches("[a-z0-1.]{1,}[@]{1}[a-z]{1,}[.]{1}[c]{1}[o]{1}[m]{1}");
        Assert.assertTrue(isEmailValid.test(email));
    }


    @Test
    public void testValidMobileNo() {
        String mobileNo = "91-9876543210";
        Predicate<String> isMobileNoValid = name->name.matches("[9]{1}[1]{1}[-]{1}[9]{1}[0-9]{9}");
        Assert.assertTrue(isMobileNoValid.test(mobileNo));
    }


    @Test
    public void testValidPassword() {
        String password = "P*ssw0rd";
        Predicate<String> isPasswordValid = name->name.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
        Assert.assertTrue(isPasswordValid.test(password));
    }

}

