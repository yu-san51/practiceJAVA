package practice.extend.phone;

//implementsはインターフェイスの実装（複数可）
//ただし実装したからには必ずそのインターフェイスの抽象メソッドを使用しなければならない
public class MobilePhone implements Phone, Camera {
	private String number;

	//メソッドの引数をインターフェースの型で作成しておけば同じ処理が実行できる
	//	phone cameraのインターフェイスを実装したmobilephone
	public MobilePhone(String number) {
		this.number = number;
	}

	//カメラインターフェイスを実装
	public void takePicture() {
		System.out.println("写真を撮ります。");
	}

	//phoneインターフェイスを実装
	public void call(String number) {
		System.out.println(this.number + "から" + number + "に電話をかけます。");
	}
}
