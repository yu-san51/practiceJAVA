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

	private static final String FILE_PATH = "resource\\RAMBLES_IN_FLORIDA_PART_1.txt";
	private static final String SEPARATOR = "(\\s+|\\.|,|;)";

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//ファイルを読み込み単語の数を自動で数えるシステム
		//単語がMapに格納されている上位10位を表示

		//集計
		Map<String, Integer> map = new HashMap<>();
		try (FileReader fr = new FileReader(FILE_PATH);
				BufferedReader br = new BufferedReader(fr)) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] words = line.split(SEPARATOR);
				for (String word : words) {
					if (!word.isEmpty()) {
						if (map.containsKey(word)) {
							int count = map.get(word) + 1;
							map.put(word, count);
						} else {
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
		Collections.sort(list, (o1, o2) -> {
			return -map.get(o1) + map.get(o2);
		});

		//上位10件出力
		System.out.println("出演回数Top10");
		String format = "%-" + maxLengthOfSpelling + "s: %3d";
		for (String word : list) {
			int count = map.get(word);
			if (10 < count) {
				System.out.printf(format, word, count);
				System.out.println();
			}
		}

	}

}
