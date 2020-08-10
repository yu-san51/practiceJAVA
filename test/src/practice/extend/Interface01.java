package practice.extend;

import practice.extend.phone.Camera;
import practice.extend.phone.MobilePhone;

public class Interface01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//モバイルフォンインスタンス
		MobilePhone mobilePhone = new MobilePhone("000-1111-2222");

		//		継承しているクラスでインスタンスの生成をすると、継承元のメソッド使える
		//		フォン定数を参照
		System.out.println("電話番号は最大" + MobilePhone.MAX_NUMBER_DIGITS + "桁です");
		//		フォンインターフェイスの抽象メソッド呼び出し
		mobilePhone.call("99-8888-7777");
		Interface01.classTakePicture(mobilePhone);
	}

	//カメラインターフェイスのクラスの呼び出し
	public static void classTakePicture(Camera camera) {
		//		カメラインターフェイスの抽象メソッド呼び出し
		camera.takePicture();
	}

}
