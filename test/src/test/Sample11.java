package test;

public class Sample11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str="200";
		//ラッパークラス
		int num = Integer.parseInt(str);
		System.out.println(num);
		num++;
		System.out.println(num);
		//クラス変数
		String str2 = new String("新しい文字");
		System.out.println(str2);
		//オブジェクト配列
		String[] strs= new String[10];
		for(int i=0; i<strs.length; i++) {
			//strs[i]="こんにちは";
			strs[i]= new String("こんにちは");
		}
		for(int i=0; i<strs.length; i++) {
			System.out.println(strs[i]);
		}
	}

}
