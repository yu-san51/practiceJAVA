package test;

public class Extends {
	public static void main(String[] args) {
		Ningen sugimoto = new Ningen("杉本", 16);
		System.out.println("Ningenクラスのメソッド：名前は、" + sugimoto.getName());

		Student sato = new Student("佐藤", 17, 70);
		System.out.println("Ningenクラスのメソッド：名前は、" + sato.getName());
		System.out.println("Studentクラスのメソッド：プロフィールは、" + sato.getStudentProfile());

		Ningen human = new Employee("田中", 28, "システム部");
		System.out.println("Ningenクラスのメソッド：名前は、" + human.getName());

		Employee tanaka = (Employee) human;
		System.out.println("Employeeのクラスのメソッド：プロフィールは、" + tanaka.getEmployeeProfile());

		Extends.printName(sugimoto);
		Extends.printName(sato);
		Extends.printName(tanaka);

	}

	public static void printName(Ningen human) {
		System.out.println("Humanクラスのメソッド：名前は、" + human.getName());
	}
}
