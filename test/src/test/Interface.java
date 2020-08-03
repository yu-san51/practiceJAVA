package test;

public class Interface {

	public static void main(String[] args) {
		// TO 自動生成されたメソッド・スタブ
		MobilePhone mobilePhone = new MobilePhone("000-1111-2222");
		
		System.out.println("電話番号は最大" + MobilePhone.MAX_NUMBER_DIGITS + "桁です");
		mobilePhone.call("99-8888-7777");
		Interface.classTakePicture(mobilePhone);
	}

	public static void classTakePicture(Camera camera) {
		camera.takePicture();
	}
}
