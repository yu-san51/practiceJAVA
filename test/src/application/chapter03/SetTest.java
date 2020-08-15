package application.chapter03;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {

	//	Setは重複しない要素を管理する
	//	重複した要素を保持することができず、要素の順番も保証されない
	//	インターフェイスであるため、実装したクラスを使用する必要がある

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Set<String> set1 = new HashSet<String>();
		Set<Integer> set2 = new LinkedHashSet<Integer>();

		//		要素の追加　add()
		set1.add("スイカ");
		set1.add("メロン");
		System.out.println(set1);

		//		要素の取得 インデックスやキーなど特定するものがないため、繰り返し処理で取得
		//		拡張for やラムダ式

		//		存在の検証　contains()
		System.out.println(set1.contains("スイカ"));
		System.out.println(set1.contains("みかん"));

		//		要素数の取得  size()
		System.out.println(set1.size());

		//		要素の削除　remove
		//		存在しない要素を指定しても何もならず、エラーにもならない
		set1.remove("スイカ");
		System.out.println(set1);
		set1.remove("りんご");
	}

}
