package test;

public class Study12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Human hm = new Human();
		Human hm2 = hm;
		hm.seibetu="男";
		hm2.seibetu = "オス";
		hm.showSeibetu();
		hm.walk();
		hm.talk();
		System.out.println(hm);
	}
}

class Monky{
	protected String seibetu;
	void showSeibetu() {
		//性別を表示
		System.out.println("性別は"+seibetu+"です");
	}
	void walk() {
		System.out.println("手を使いながらですが、二足歩行で歩いています。");
	}
}


class Human extends Monky{//人間クラスサルクラスを継承
	public String toString() {
		return "人間クラスです";
	}
	String seibetu;//オーバーライド
	void showSeibetu() {
		super.seibetu="オス";
		this.seibetu="男";
		System.out.println(super.seibetu);
		System.out.println(this.seibetu);
	}
	void talk() {
		System.out.println("こんにちは");
	}
	void walk() {//オーバーライド
		System.out.println("完全二足歩行で歩いています。");
	}
	
}