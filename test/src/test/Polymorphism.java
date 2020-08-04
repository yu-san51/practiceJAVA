package test;



public class Polymorphism {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Ningen human1 = new Student("佐藤", 17,70);
		System.out.println("Humanクラスのメソッド：プロフィールは、" + human1.getProfile());
		
		Ningen human2 = new Employee("田中",28, "システム部");
		System.out.println("Humanクラスのメソッド：プロフィールは、" + human2.getProfile());
	}

}
