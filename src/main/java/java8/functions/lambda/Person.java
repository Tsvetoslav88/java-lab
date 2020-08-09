package java8.functions.lambda;

import java.time.LocalDate;

public class Person {
	public enum Sex {

		MALE,
		FEMALE
	}

	private String name;
	private LocalDate birthday;
	private Sex gender;
	private String emailAddress;

	public int getAge() {
		return 20;
	}

	public void printPerson() {
		System.out.println(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public Sex getGender() {
		return gender;
	}

	public void setGender(Sex gender) {
		this.gender = gender;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
