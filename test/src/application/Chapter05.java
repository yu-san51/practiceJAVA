package application;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

		List<String> animals = Arrays.asList("dog", "cat","fox","elephant");
		System.out.println(animals);
		Collections.sort(
				animals,
				new Comparator<String>() {
					public int compare(String x, String y) {
						return x.compareTo(y);
					}
				});
		System.out.println(animals);

	}

	public String hello() {
		return "Hello A";
	}

}

//無名クラス
//システム内で一度しか使用しないような処理を実装するケースに使う
//定番パターンはコレクションをソートするときにComparatorインターフェイスを実装する場合
//Runnableインターフェイスを用いてマルチスレッドプログラミングをするとき