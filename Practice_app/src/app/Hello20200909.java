package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Hello20200909 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//カンマ区切りで整数値が記入されているテキストファイルを読み込んで合計を出す
		//resource/sample.txtを読み込む。
		//空行は無視
		//未入力箇所も無視（1,,2となってる場合の箇所）

		File file = new File("resource/sample.txt");

		//ファイルの読み込み
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = null;
			int total = 0;
			while ((line = br.readLine()) != null) {
				//ファイルを一行読む
				if (line.isEmpty()) {
					//空行だったらスキップ
					continue;
				}

				//行に数字があれば合計する
				//splitメソッドをつかってカンマで分割
				String[] nums = line.split(",");
				for (String num : nums) {
					//カンマの間が空文字かどうかを判断
					if (!num.isEmpty()) {
						//intへ変換したのち足し算
						total += Integer.parseInt(num);
					}
				}
			}
			System.out.println(total);

		} catch (FileNotFoundException e) {
			//ファイルが見つからなかった時のメソッド
			System.out.println("ファイルが存在しません");

		} catch (IOException e) {
			//エラーが出たときの処理
			System.out.println("エラーが発生しました");
		}
	}

}
