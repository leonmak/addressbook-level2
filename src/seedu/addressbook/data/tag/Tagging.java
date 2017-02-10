package seedu.addressbook.data.tag;

import java.util.StringJoiner;

import seedu.addressbook.data.person.Person;

public class Tagging {
	private Tag tag;
	private Person person;
	private boolean operation;
	
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

	public boolean isOperation() {
		return operation;
	}

	public void setOperation(boolean operation) {
		this.operation = operation;
	}

	@Override
	public String toString() {
		String opChar = operation ? "+" : "-";
		StringJoiner s = new StringJoiner(" ");
		return s.add(opChar)
				.add(person.getName().fullName)
				.add(tag.toString())
				.toString();
	}
}
