package practice.extend.phone;

//interfaceは定数と抽象メソッドのみ持つ
//インターフェイスで指定できる修飾子はpublicかpackage-private（何も書かない）
//インターフェイスはインターフェイスをいくつでも継承できる（extends　インターフェイス名,インターフェイス名・・・）
public interface Phone {
	//	定数（public static finalは必要ない）
	int MAX_NUMBER_DIGITS = 11;

	//抽象メソッド（public abstractは必要ない）
	public void call(String number);

	//	defaultメソッドの宣言
	default void powerOFF() {
		System.out.println("電源を切ります");
	}
}
