package application;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Chapter06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Integer> numbers = Arrays.asList(1, -8, 4, 2);
		System.out.println(numbers);
		Collections.sort(
				numbers,
				//Comparatorは関数型インターフェイス
				new Comparator<Integer>() {
					@Override //順番が小さい順に並べる
					public int compare(Integer x, Integer y) {
						return Integer.compare(x, y);
					}

					//↑をラムダ式(引数) -> {処理}で書くと以下となる
					//関数型のインターフェイスならば抽象メソッドはただ一つなはずなので
					//Comparatorはかかなくても実行される
					//ただし変数に格納する必要あり
					//Comparator<Integer> c = (Integer x, Integer y) -> {
					//return Integer.compare(x,y);
					// };
				});
		System.out.println(numbers);

		//ラムダ式を使ってGreetingメソッドを実装
		Greeting greeting = () -> {
			return "こんにちは";
		};

		//メソッド参照
		//Greeting greeting01 = (String word) -> {
		//System.out.println(word);
		//};  をメソッド参照で記述すると
		//Greeting greeting01 = System.out::println;

		//ラムダ式の中で呼び出すメソッドが1つだけの場合
		//クラスとメソッド名を指定するだけで直接使うことができる
		Comparator<Integer> c = Integer::compare;

	}

	//関数型インターフェイス　実装すべき抽象メソッドが1つしかないインターフェイス
	//@FunctionalInterfeceをつけなくてもいいが明示的にアノテーションをつけることによって
	//不意にメソッドを増やすミスをなくす

	//関数型インターフェイス
	@FunctionalInterface
	public interface A {
		public String hello();
	}

	//普通のインターフェイス(抽象メソッドが2つ)
	//@FunctionInterfeceアノテーションをつけるとコンパイルエラーとなる
	public interface B {
		public String hello();

		public String goodbye();
	}

	//関数型インターフェイス  他にメソッドはあるが抽象メソッドは一つ
	@FunctionalInterface
	public interface C {
		public String hello();

		public static String hi() {
			return "Hi!!";
		}
	}

	@FunctionalInterface
	public interface Greeting {
		public String hello();
	}

	//引数で関数型インターフェイスを渡すことも可能
	//引数で渡すものの実装によってこのメソッドの挙動も変わる
	public static void sayHallo(Greeting g) {
		System.out.println(g.hello());
	}
}

//ラムダ式の省略記法
//サンプル1                                サンプル２
//(Integer x, Integer y) -> {                 (Integer x) -> {
//	return x + y;                               return x * 5;
//};                                          };

//引数の型 サンプル１
//(x, y) -> {
//	return x + y;
//	};

//{}とreturn  サンプル1
//(Integer x, Integer y) -> x + y;

//()  サンプル２
//x -> {
//  return x * 5;
//};

//省略混合
//サンプル１                                 サンプル2
//(x, y) -> x + y;                             x -> x * 5;