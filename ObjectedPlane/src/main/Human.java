package main;

import java.util.Random;

	
public class Human {
	private String name;
	private String gender;
	
	Human() {
	Random randGen = new Random();
	int randInt = randGen.nextInt(2);
	String[] genders = {"Female", "Male"};
	setGender(genders[randInt]);
	
	RandomString names = new RandomString();
	setName(names.random());
	}
	
	Human(int zero) {
		if ( zero == 0 ) {
			setGender("Empty");
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return gender;
	}
}
