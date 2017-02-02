package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses can be in any format";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";

    public final Block block;
    public final Street street;
    public final Unit unit;
    public final PostalCode postalCode;
    
    private boolean isPrivate;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        String trimmedAddress = address.trim();
        String[] trimmedAddressParts = trimmedAddress.split(", ");
        int addressLength = trimmedAddressParts.length;
        this.isPrivate = isPrivate;
        if (!isValidAddress(trimmedAddress)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        block = addressLength > 0 ? new Block(trimmedAddressParts[0]) : new Block("");
        street = addressLength > 1 ? new Street(trimmedAddressParts[1]) : new Street("");
        unit = addressLength > 2 ? new Unit(trimmedAddressParts[2]) : new Unit("");
        postalCode = addressLength > 3 ? new PostalCode(trimmedAddressParts[3]) : new PostalCode("");
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
         String address = block.get_blockNumber() + ", " + 
        		 street.get_street() + ", " + 
        		 unit.get_unit() + ", " + 
        		 postalCode.get_postalCode();
         while (address.substring(address.length() - 2).equals(", ")) {
        	 address = address.substring(0, address.length() - 2);
         }
         return address;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.toString().equals(((Address) other).toString())); // state check
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
