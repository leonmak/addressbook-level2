package seedu.addressbook.data.person;

public class PostalCode {
	private int _postalCode;
	
	public PostalCode(int postalCode) {
		set_postalCode(postalCode);
	}
	
	public int get_postalCode() {
		return _postalCode;
	}
	
	public void set_postalCode(int _postalCode) {
		this._postalCode = _postalCode;
	}
	
}
