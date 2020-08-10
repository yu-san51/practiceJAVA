package practice.extend;

import practice.extend.animal.Dog;

public class Abstract01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//		インスタンスの生成　抽象クラスは生成できないためAnimal animal= new Animal()は不可
		Dog dog = new Dog();
		//		アニマルクラスのメソッド呼び出し
		dog.eat();
		//		抽象メソッドの中身を実装したドッグクラスのメソッドを呼び出し
		dog.cry();
	}

}
