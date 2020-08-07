package practice.classMethod;

import practice.classMethod.human.Human01;

public class ClassMethod01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Human01 yamada = new Human01();
		System.out.println("名前は" + yamada.name + "です。年齢は" + yamada.age);

		Human01 sato = new Human01("佐藤", 25);
		System.out.println("名前は" + sato.name + "です。年齢は" + sato.age);
	}

}
