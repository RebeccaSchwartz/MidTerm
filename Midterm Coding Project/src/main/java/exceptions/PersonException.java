package exceptions;

import com.cisc181.core.Person;

public class PersonException extends Exception {
	private Person ErrorPerson;
	public PersonException(Person ErrorPerson){
		this.ErrorPerson=ErrorPerson;
	}
	public Person getErrorPerson() {
		return ErrorPerson;
	}
}
