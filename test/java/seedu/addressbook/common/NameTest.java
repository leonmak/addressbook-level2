package seedu.addressbook.common;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.Name;

public class NameTest {

	@Test
	public void isSimilar() throws IllegalValueException {
		Name n1 = new Name("a");
		Name n2 = new Name("aa");
		Name n3 = new Name("b");
		assertTrue(n1.isSimilar(n2));
		assertFalse(n1.isSimilar(n3));
		assertFalse(n1.isSimilar(null));
	}

}
