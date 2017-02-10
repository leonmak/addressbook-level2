package seedu.addressbook.common;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import seedu.addressbook.data.person.Name;
import seedu.addressbook.data.person.Person;
import seedu.addressbook.util.TestUtil;

public class UtilsTest {
//	[UnitOfWork__StateUnderTest__ExpectedBehavior]
//  unit of work - public method return value/exception, or a state change, or call to a third party

    @Test
    public void isAnyNull_EmptyList_False() {
        assertFalse(Utils.isAnyNull());
    }

    @Test
	public void isAnyNull_AnyNonEmptyList_False() {
        assertFalse(Utils.isAnyNull(new Object()));
        assertFalse(Utils.isAnyNull(new Object(), new Object()));
        assertFalse(Utils.isAnyNull("test"));
        assertFalse(Utils.isAnyNull(""));
	}
    
    @Test
	public void isAnyNull_NullInsideList_False() {
		// confirms nulls inside the list are not considered
        List<Object> nullList = Arrays.asList((Object) null);
        assertFalse(Utils.isAnyNull(nullList));
	}
    
    @Test
	public void isAnyNull_NonEmptyListNullLast_True() {
		// non empty list with one null as the last element
        assertTrue(Utils.isAnyNull("", new Object(), null));
        assertTrue(Utils.isAnyNull(new Object(), new Object(), null));
	}
    
    @Test
	public void isAnyNull_NonEmptyListNullMidlle_True() {
		// non empty list with nulls in the middle
        assertTrue(Utils.isAnyNull(new Object(), null, null, "test"));
        assertTrue(Utils.isAnyNull("", null, new Object()));
	}

    @Test
	public void isAnyNull_NonEmptyListOneNullInBeginning_True() {
        // non empty list with just one null at the beginning
		assertTrue(Utils.isAnyNull((Object) null));
        assertTrue(Utils.isAnyNull(null, "", new Object()));
        assertTrue(Utils.isAnyNull(null, new Object(), new Object()));
	}
    
    @Test
	public void elementsAreUnique_someIdentical_False() throws Exception {
		// some identical objects
        assertNotUnique("abc", "abc");
        assertNotUnique("abc", "", "abc", "ABC");
        assertNotUnique("", "abc", "a", "abc");
        assertNotUnique(1, new Integer(1));
        assertNotUnique(null, 1, new Integer(1));
        assertNotUnique(null, null);
        assertNotUnique(null, "a", "b", null);
	}
    
    @Test
	public void elementsAreUnique_AllUnique_True() throws Exception {
		// all objects unique
        assertAreUnique("abc", "ab", "a");
        assertAreUnique(1, 2);
	}
    
    @Test
	public void elementsAreUnique_OneObject_True() throws Exception {
		// only one object
        assertAreUnique((Object) null);
        assertAreUnique(1);
        assertAreUnique("");
        assertAreUnique("abc");
	}
    
    @Test
	public void elementsAreUnique_EmptyList_True() throws Exception {
		// empty list
        assertAreUnique();
	}

    private void assertAreUnique(Object... objects) {
        assertTrue(Utils.elementsAreUnique(Arrays.asList(objects)));
    }

    private void assertNotUnique(Object... objects) {
        assertFalse(Utils.elementsAreUnique(Arrays.asList(objects)));
    }
}
