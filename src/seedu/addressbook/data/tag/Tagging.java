package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {
	private Tag tag;
	private Person person;
	
	public Tagging(Tag tag, Person person) {
		this.setTag(tag);
		this.setPerson(person);
	}

	public Tag getTag() {
		return tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
}
