package test;

public class ClassMethod03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Human03 yamada = new Human03("山田");
		Human03 sato = new Human03("佐藤");

		Human03.staticMethodPrint();
		System.out.println(Human03.humanCount);

		System.out.println(Human03.GREETING);

		yamada.instanceMethodPrint();
		System.out.println(yamada.name);
	}

}
