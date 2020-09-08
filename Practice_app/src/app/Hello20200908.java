package app;

public class Hello20200908 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//クラス変数はクラスで共通の変数となる
		//インスタンス変数はインスタンスごとに値を確保できる変数

		//インスタンスの生成、格納
		StaticFieldTest test1 = new StaticFieldTest();
		StaticFieldTest test2 = new StaticFieldTest();
		StaticFieldTest test3 = new StaticFieldTest();

		//インスタンス変数の出力
		System.out.println(test1.getInstanceNumber() + "番目のインスタンス");
		System.out.println(test2.getInstanceNumber() + "番目のインスタンス");
		System.out.println(test3.getInstanceNumber() + "番目のインスタンス");

		//クラス変数の出力
		System.out.println("生成したインスタンスの数 : " + StaticFieldTest.getCount());
	}

}

class StaticFieldTest {

	//stsaticがあるとクラス変数、なければインスタンス変数
	private static int count;
	private int instanceNumber;

	public StaticFieldTest() {
		instanceNumber = ++count;
	}

	public static int getCount() {
		return count;
	}

	public int getInstanceNumber() {
		return instanceNumber;
	}
}
