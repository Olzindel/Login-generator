package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGenerationTest {

    private PasswordGeneration pw;

    @Before
    public void setUp() {
        pw = new PasswordGeneration();
    }

    @Test
    public void getRandomPassword() {
        String generatedPassword = pw.getRandomPassword();
        assertEquals(8, generatedPassword.length());
    }
}