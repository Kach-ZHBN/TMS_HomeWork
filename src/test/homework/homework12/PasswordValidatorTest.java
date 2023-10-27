package homework.homework12;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PasswordValidatorTest {

    @Test
    public void testIsValid() {
        assertFalse(PasswordValidator.isValid("", "", ""));
        assertFalse(PasswordValidator.isValid(null, "", ""));
        assertFalse(PasswordValidator.isValid("qwertyuiopasdfghjklz", "Password1", "Password1"));
        assertFalse(PasswordValidator.isValid("qwer ty", "Password1", "Password1"));

        assertFalse(PasswordValidator.isValid("qwerty", "", ""));
        assertFalse(PasswordValidator.isValid("qwerty", "Password901234567890", "Password901234567890"));
        assertFalse(PasswordValidator.isValid("qwerty", "Pass word1", "Pass word1"));
        assertFalse(PasswordValidator.isValid("qwerty", "Password", "Password"));
        assertFalse(PasswordValidator.isValid("qwerty", "Passwo rd", "Passwo rd"));

        assertFalse(PasswordValidator.isValid("qwerty", "Password5", "asdfgh"));

        assertTrue(PasswordValidator.isValid("Login", "Password1", "Password1"));
    }
}