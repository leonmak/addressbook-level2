package seedu.addressbook.data.person;

public class Block {
	private String _blockNumber;
	
	public Block(String blockNumber) {
		set_blockNumber(blockNumber);
	}
	public String get_blockNumber() {
		return _blockNumber;
	}
	public void set_blockNumber(String _blockNumber) {
		this._blockNumber = _blockNumber;
	}
	
}
