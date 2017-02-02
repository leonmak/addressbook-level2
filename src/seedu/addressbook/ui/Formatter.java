package seedu.addressbook.ui;

import java.util.List;

public class Formatter {

	/** Format of indexed list item */
    private static final String MESSAGE_INDEXED_LIST_ITEM = "\t%1$d. %2$s";
    
    /** Offset required to convert between 1-indexing and 0-indexing.  */
    public static final int DISPLAYED_INDEX_OFFSET = 1;
    	
	private TextUi textUi;
	
	public Formatter(TextUi textUi) {
		this.textUi = textUi;
	}

	/** Shows a list of strings to the user, formatted as an indexed list. */
	public void showToUserAsIndexedList(List<String> list) {
	    textUi.showToUser(getIndexedListForViewing(list));
	}
	
	/** Formats a list of strings as a viewable indexed list. */
	private static String getIndexedListForViewing(List<String> listItems) {
	    final StringBuilder formatted = new StringBuilder();
	    int displayIndex = 0 + DISPLAYED_INDEX_OFFSET;
	    for (String listItem : listItems) {
	        formatted.append(getIndexedListItem(displayIndex, listItem)).append("\n");
	        displayIndex++;
	    }
	    return formatted.toString();
	}
	
	/**
	 * Formats a string as a viewable indexed list item.
	 *
	 * @param visibleIndex visible index for this listing
	 */
	private static String getIndexedListItem(int visibleIndex, String listItem) {
	    return String.format(MESSAGE_INDEXED_LIST_ITEM, visibleIndex, listItem);
	}
	
}