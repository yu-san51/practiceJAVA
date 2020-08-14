package application.chapter03;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Mapはキーと値の組み合わせで要素を管理するコレクション
		//		キーは唯一だが値は重複可
		//		追加した分の要素の順番は保証されない
		//		インターフェイスであるためMapを実装したクラスをする必要がある

		Map<Integer, String> map1 = new HashMap<Integer, String>();
		Map<String, String> map2 = new TreeMap<String, String>();

		//		要素の追加  put(キー, 値)
		//		すでに追加済みのキーを用いると、追加した値で上書きされる
		map1.put(0, "ぶどう");
		map1.put(3, "もも");
		System.out.println(map1);
		map1.put(0, "マスカット");
		System.out.println(map1);
		//		現状[[0,マスカット],[3,もも]]

		//		要素の取得 get(キー)
		//		存在しないキーを指定した場合はnullが返る
		System.out.println(map1.get(0));
		System.out.println(map1.get(1));

		//		要素の存在を検証
		//		キーの存在　containsKey(キー)
		//		値の存在　containsValue(値);
		System.out.println(map1.containsKey(0));
		System.out.println(map1.containsValue("ぶどう"));

		//		要素数の取得　size()
		System.out.println(map1.size());

		//		要素の削除　remove(キー), remove(キー, 要素)
		//		キーと値がともに一致する要素が削除される
		//		該当する要素が存在しなければ何もならずエラーも出ない
		map1.remove(0);
		map1.remove(1);
		System.out.println(map1);

		map1.remove(3, "もも");
		map1.remove(3, "なし");
		System.out.println(map1);
	}

}
