package practice.extend.animal;

//アニマルクラスの継承
public class Dog extends Animal {
	public Dog() {
		this.name = "犬";
	}

	//空っぽだった抽象メソッドの中身を実装（オーバーライド）
	public void cry() {
		System.out.println(this.name + "が吠えました。わんわん");
	}
}
