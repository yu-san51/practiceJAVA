package Foundation2nd.capsule;

public class Chapter15_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//勝手にキャスト（変換）される
		int i1 = 123;
		double d1 = i1;
		System.out.println(d1);

		//doubleからintに代わったことを明示する(int)
		double d2 = 12.345;
		int i2 = (int) d2;
		System.out.println(i2);

		//明示しないとこの場合0.0となり期待の数字とならない
		int i3 = 1;
		int i4 = 2;
		double d3 = (double) i3 / i4;
		System.out.println(d3);

		//intからbyteに代わったことを明示しないとコンパイルエラー（byte）
		int i5 = 128;
		byte b1 = (byte) i5;
		System.out.println(b1);
	}

}
