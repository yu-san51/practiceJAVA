package practice.extend.human;

public class Human {
	//	privateは自分からしかアクセスできないからgetメソッド
	private String name;
	//	protectedはサブクラスからでもアクセスできる
	protected int age;

	public Human(String name, int age) {
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
