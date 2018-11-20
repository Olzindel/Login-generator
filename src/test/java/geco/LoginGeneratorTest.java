package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    private LoginGenerator aLoginGenerator;

    @Before
    public void setUp() {
        String[] start = {"JROL", "BPER", "CGUR", "JDU", "JRAL", "JRAL1"};
        aLoginGenerator = new LoginGenerator(new LoginService(start));
    }

    @Test
    public void generateLoginForNomAndPrenomPDUR1() {
        String login = aLoginGenerator.generateLoginForNomAndPrenom("Durand",
                "Paul");
        assertEquals("PDUR", login);
    }

    @Test
    public void generateLoginForNomAndPrenomJRAL2() {
        String login = aLoginGenerator.generateLoginForNomAndPrenom("Ralling"
                , "John");
        assertEquals("JRAL2", login);

    }

    @Test
    public void generateLoginForNomAndPrenomJROL1() {
        String login = aLoginGenerator.generateLoginForNomAndPrenom("Rolling",
                "Jean");
        assertEquals("JROL1", login);
    }

    @Test
    public void generateLoginForNomAndPrenomPDUR2() {
        String login = aLoginGenerator.generateLoginForNomAndPrenom("Dùrand",
                "Paul");
        assertEquals("PDUR", login);
    }
}