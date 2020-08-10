package practice.extend;

import practice.extend.human.Employee;
import practice.extend.human.Human;
import practice.extend.human.Student;

public class Extend01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Human sugimoto = new Human("杉本", 16);
		System.out.println("Humanクラスのメソッド：名前は" + sugimoto.getName());

		Student sato = new Student("佐藤", 17, 70);
		//		extendしているので当然Humanクラスのメソッドも使える
		System.out.println("Humanクラスのメソッド：名前は" + sato.getName());
		//		Studentクラスで作ったメソッド
		System.out.println("Studentクラスのメソッド：プロフィールは、" + sato.getStudentProfile());
		;
		//アップキャスト（サブクラスのインスタンスを生成してスーパークラスに代入）
		Human human = new Employee("田中", 28, "システム部");
		System.out.println("Humanクラスのメソッド：名前は" + human.getName());

		//		ダウンキャスト（スーパークラスのものにサブクラスのものを代入）どのサブクラスかを明示しなければならない
		//		HumanクラスにはgetEmployeeprofileメソッドがないのでアクセスできないから
		Employee tanaka = (Employee) human;
		System.out.println("Employeeクラスのメソッド：プロフィールは、" + tanaka.getEmployeeProfile());

		Extend01.printName(sugimoto);
		Extend01.printName(sato);
		Extend01.printName(tanaka);
	}

	//引数は親クラスで作成↑親クラスだけでなく子クラスの引数でも呼び出しができる
	public static void printName(Human human) {
		System.out.println("Humanクラスのメソッド：名前は" + human.getName());
	}

}
