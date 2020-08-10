package practice.polymorphism;

public class Student extends Human {
	private int score;

	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}

	//	オーバーライドによるHumanクラスをStudent用に書き換え
	public String getProfile() {
		String profile = "年齢は" + super.age + "です";
		profile += "学生で、テストの点数は" + this.score + "点です";
		return profile;
	}
}
