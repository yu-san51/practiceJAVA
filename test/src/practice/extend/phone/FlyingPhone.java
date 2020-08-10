package practice.extend.phone;

public class FlyingPhone implements Phone, Flying {
	private int minutes;
	
//	宣言したminutesを初期化、代入
	public FlyingPhone(int minutes) {
		this.minutes = minutes;
	}

	public void fly() {
		System.out.println(minutes + "分間、飛びます");
	}

//	実装するインターフェイスのオーバーライド（必ず必要）
	public void call(String number) {
		System.out.println(number + "に電話します。飛んでいる間だけです");
	}

	public void powerOff() {
//		defaultメソッドの呼び出しの場合もオーバーライド形式
//		Flyingのdefaultの呼び出しは親メソッドの呼び出し
		Flying.super.powerOff();
	}
}
