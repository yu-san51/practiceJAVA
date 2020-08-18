package application;

public class Chapter05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Chapter05 a = new Chapter05() {
			//無名クラスを使ってHallo Bを出力するためのメソッド追加
			//オーバーライド
			public String hello() {
				return "Hello　B!";
			}
		};
		System.out.println(a.hello());

	}

	public String hello() {
		return "Hello A";
	}

}

//無名クラス
//システム内で一度しか使用しないような処理を実装するケースに使う
//定番パターンはコレクションをソートするときにComparatorインターフェイスを実装する場合
//Runnableインターフェイスを用いてマルチスレッドプログラミングをするとき