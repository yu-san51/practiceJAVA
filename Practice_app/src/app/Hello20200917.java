package app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hello20200917 {

	//ファイルのパス
	private static final String FILE_PATH = "resource\\RAMBLES_IN_FLORIDA_PART_1.txt";
	//文字の分割 空白が一つ以上、ピリオド、カンマ、セミコロン
	private static final String SEPARATOR = "(\\s+|\\.|,|;)";

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//ファイルを読み込み単語の数を自動で数えるシステム
		//単語がMapに格納されている上位10位を表示

		//集計
		//Mapの作成　キーは単語、値は出現数
		Map<String, Integer> map = new HashMap<>();

		//ファイルの読み込みでエラーが出たときの対処としてtry-catch構文
		try (FileReader fr = new FileReader(FILE_PATH);
				BufferedReader br = new BufferedReader(fr)) {
			String line;
			//lineに一行ずつ読み込んだモノを格納
			while ((line = br.readLine()) != null) {
				//読み込んだ一行分を分割してwords配列に
				String[] words = line.split(SEPARATOR);
				//もし
				for (String word : words) {
					if (!word.isEmpty()) {
						if (map.containsKey(word)) {
							//Mapのcountに出現数を足す
							int count = map.get(word) + 1;
							//Mapに格納
							map.put(word, count);
						} else {
							//Mapにキーが含まれていない場合は新たに格納
							map.put(word, 1);
						}
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりませんでした");
		} catch (IOException e) {
			System.out.println("読み取りに失敗しました");
		}

		//出現数で降順に並べ替え、つづりの長さ最大値取得
		List<String> list = new ArrayList<>();
		int maxLengthOfSpelling = 0;
		for (String key : map.keySet()) {
			list.add(key);

			if (maxLengthOfSpelling < key.length()) {
				maxLengthOfSpelling = key.length();
			}
		}
		//並べ替え Mapから出現数を取得して、その差を返す
		Collections.sort(list, (o1, o2) -> {
			return -map.get(o1) + map.get(o2);
		});

		//上位10件出力
		System.out.println("出演回数Top10");
		//出力のフォーマット
		String format = "%-" + maxLengthOfSpelling + "s: %3d";
		for (String word : list) {
			int count = map.get(word);
			if (10 < count) {
				//フォーマット通りの出力をさせる
				System.out.printf(format, word, count);
				System.out.println();
			}
		}

	}

}
