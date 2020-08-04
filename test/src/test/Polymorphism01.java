package test;

public class Polymorphism01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Ningen human = new Student("佐藤", 17,70);
		
		Polymorphism01 polymorphism = new Polymorphism01();
		
		polymorphism.printName();
		polymorphism.printName("松本");
		polymorphism.printName("松本", "清水");
		polymorphism.printName(human);
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
	
	public void printName(Ningen human) {
		System.out.println(human.getName() + "です");
	}

}
