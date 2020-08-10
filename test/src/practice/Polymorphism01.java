package practice;

import practice.polymorphism.Employee;
import practice.polymorphism.Human;
import practice.polymorphism.Student;

//変数などはそのままにスーパークラスのメソッドの処理を変えたいところだけオーバーライドする
//final修飾子はオーバーライドできない
public class Polymorphism01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//		インスタンスはStudentだが、Humanクラスの変数に代入する
		Human human1 = new Student("佐藤", 17, 70);
		//	HumanクラスだからHumanクラスのメソッドが実行されるが、Studentクラスにて書き換えられているので
		//		Student用のプロフィールが実行される
		System.out.println("Humanクラスのメソッド:プロフィールは、" + human1.getProfile());

		Human human2 = new Employee("田中", 28, "システム部");
		System.out.println("Humanクラスのメソッド：プロフィールは、" + human2.getProfile());

		Polymorphism01 polymorphism = new Polymorphism01();

		//		引数なし
		polymorphism.printName();
		//		引数がStringクラスの呼び出し
		polymorphism.printName("松本");
		//		引数がStringクラスとStringクラスの呼び出し
		polymorphism.printName("松本", "清水");
		//		引数がHumanクラスの呼び出し
		polymorphism.printName(human1);
	}

	public void printName() {
		System.out.println("中川です");
	}

	public void printName(String name) {
		System.out.println(name + "です");
	}

	public void printName(String name1, String name2) {
		System.out.println(name1 + "と" + name2 + "です");
	}

	public void printName(Human human1) {
		System.out.println(human1.getName() + "です");
	}

}
