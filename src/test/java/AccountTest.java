import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AccountTest {

    @Test
    public void nameLessThan3charactersTest() {
        Account account = new Account("a ");

        assertFalse("Name should be more than 3 characters", account.checkNameToEmboss());

    }

    @Test
    public void nameMoreThan19charactersTest() {
        Account account = new Account("Aristarchus Valynets");

        assertFalse("Name should not be more than 19 characters", account.checkNameToEmboss());

    }

    @Test
    public void nameWithoutSpaceBetweenNameAndLastname() {
        Account account = new Account("AristarchusValynets");

        assertFalse("Name should have space between name and lastname", account.checkNameToEmboss());

    }

    @Test
    public void nameStartsWithSpace() {
        Account account = new Account(" Alex Ivanov");

        assertFalse("Name should not start with a space", account.checkNameToEmboss());

    }

    @Test
    public void nameEndsWithSpace() {
        Account account = new Account("Alex Ivanov ");

        assertFalse("Name should not end with a space", account.checkNameToEmboss());

    }

    @Test
    public void nameWithTwoSpaces() {
        Account account = new Account("Alex  Ivanov");

        assertFalse("Name has 2 spaces between name and lastname", account.checkNameToEmboss());

    }

    @Test
    public void nameWithValidData() {
        Account account = new Account("Alex Ivanov");

        assertTrue("Name is invalid", account.checkNameToEmboss());

    }


}
