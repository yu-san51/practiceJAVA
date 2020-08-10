package practice.extend.animal;

//抽象化しているメソッドがあることを宣言
//インスタンスの生成は不可
//抽象クラスにアクセスしたいときはサブクラスにインスタンスを作って、それからアクセス
public abstract class Animal {
	protected String name;

	public void eat() {
		System.out.println(name + "が食事をしました");
	}

	//抽象化メソッドとは、クラスごとに違う処理をさせたいときに
	//あえて中身を書かないで、サブクラスに実装させる（ここではメソッド名、引数、戻り値だけを定義）
	public abstract void cry();

}
