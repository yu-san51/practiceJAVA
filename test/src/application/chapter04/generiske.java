package application.chapter04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class generiske {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<String> items = new ArrayList<String>();

		//		↑<String>とは？？
		//		型パラメーター(ジェネリクス)と呼び、参照型しか宣言できない。
		//		型を宣言することにより要素の型を限定する（他の型を追加しようとするとコンパイルエラーに）
		items.add("bag");
		//		xxxx items.add(0); xxxx
		//		xxxx items.add(true); xxxx

		//		取り出した要素を他の型の変数に代入することも不可
		String item = items.get(0);
		//		xxxx int item = items.get(0); xxxx
		//		xxxx booleaen item = items.get(0); xxxx

		//ジェネリクスがないと。。。
		List items02 = new ArrayList();
		//		全てのスーパークラスであるobject型を持ったリストが生成される
		//		イメージ的には
		//		List<Object> items02 = new ArrayList<Object>();

		//		どの型も追加OK
		items02.add("bag");
		items02.add(0);
		items02.add(true);

		//		要素を取り出すときは「キャスト」を行いオブジェクト型から任意の型の指定をする
		//		オブジェクト型→サブクラス＝ダウンキャスト
		String item1 = (String) items02.get(0);

		//		ただしリストに追加してしまうと、それが持つ具体的な方の情報がなく、
		//		特定の型へのダウンキャストが成功しない場合がある
		String item2 = (String) items02.get(1);
		//		↑items02インデックス1はint型なのでコンパイルエラー

		Set<Integer> set = new LinkedHashSet<>();
		set.add(1); //ok
		//		set.add("Two");  //int型ではないのでエラー

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Taro");
		map.put(2, "Hanako");
		//		int value = map.get(0);  //キーに0を指定していないのでエラー

	}

}
