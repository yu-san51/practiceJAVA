package practice.polymorphism;

public class Human {
	private String name;
	protected int age;

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//オーバーライド禁止（final修飾子）
	final public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public String getProfile() {
		return "名前は" + this.name + "、年齢は" + this.age + "です";
	}
}
