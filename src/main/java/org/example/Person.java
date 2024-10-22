package org.example;

public class Person {	
	
	    public Person(String name, int age, boolean adult) {
		this.name = name;
		this.age = age;
		this.adult = adult;
	}

		private String name;

	    private int age;

	    private boolean adult;

	    public Person() {
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public boolean isAdult() {
	        return adult;
	    }

	    public void setAdult(boolean adult) {
	        this.adult = adult;
	    }

}
