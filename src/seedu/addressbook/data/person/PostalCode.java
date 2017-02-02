package seedu.addressbook.data.person;

public class PostalCode {
	private String _postalCode;
	
	public PostalCode(String postalCode) {
		set_postalCode(postalCode);
	}
	
	public String get_postalCode() {
		return _postalCode;
	}
	
	public void set_postalCode(String _postalCode) {
		this._postalCode = _postalCode;
	}
	
}
