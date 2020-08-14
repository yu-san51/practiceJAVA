package application.capter03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	//	List　配列と同じようにインデックス番号順に要素(オブジェクト）を管理する。
	//	重複した要素を保持することも可能
	//	オブジェクト生成時に要素数の指定が必要なし
	//	インターフェースなので使用する場合はListを実装したクラスを使用しなければならない
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//		Listはインターフェースなので抽象メソッドしか持てない
		//		ArrayListを生成
		List<String> list1 = new ArrayList<String>();
		//		LinkedListを生成
		List<Integer> list2 = new LinkedList<Integer>();

		//		要素の追加
		list1.add("みかん");
		list1.add("リンゴ");
		System.out.println(list1);

		//		一を指定して要素を追加 add()
		//		この時に現在ある要素数よりも大きいとエラーになる
		list1.add(1, "バナナ");
		System.out.println(list1);

		//		要素の取得 要素としては残り続ける  get()
		String a;
		a = list1.get(0);
		System.out.println(a);

		//		引数にある要素がリストに含まれるか検査(ture or false)  contains()
		System.out.println(list1.contains("バナナ"));

		//		要素数がいくつか検査  size()
		int b = list1.size();
		System.out.println(b);

		//		要素の削除 remove
	}

}
