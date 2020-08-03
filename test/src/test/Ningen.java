package test;

public class Ningen {
	private String name;
	protected int age;
	
	public Ningen(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
}
