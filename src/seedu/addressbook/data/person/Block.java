package seedu.addressbook.data.person;

public class Block {
	private int _blockNumber;
	
	public Block(int blockNumber) {
		set_blockNumber(blockNumber);
	}
	public int get_blockNumber() {
		return _blockNumber;
	}
	public void set_blockNumber(int _blockNumber) {
		this._blockNumber = _blockNumber;
	}
	
}
