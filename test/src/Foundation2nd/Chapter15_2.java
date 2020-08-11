package Foundation2nd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Chapter15_2 {

	public static void main(String[] args) {
		// input.txtに書いてある5文字のものをoutput.txtに出力

		//		FileSystemクラス　ほかの種類の (カスタム) ファイルシステムへのアクセスを提供する
		//			ファイルシステムを作成するためのメソッド
		//		FileSystems.getDefaultアクセス可能なファイルシステムへのアクセス
		FileSystem fs = FileSystems.getDefault();
		//		getPath パス文字列を変換して、ファイルの検索とアクセスに使用
		Path inputPath = fs.getPath("input.txt");
		Path outputPath = fs.getPath("output.txt");

		//		FilesクラスでBufferedReaderクラスとBufferedWtiterクラスののインスタンスを生成
		try (BufferedReader reader = Files.newBufferedReader(inputPath);
				BufferedWriter writer = Files.newBufferedWriter(outputPath);) {

			String line = null;
			//			readLineは一行をまとめて読み込むためのメソッド
			//			readだけだと一字ずつの読み込み
			while ((line = reader.readLine()) != null) {
				if (line.length() != 5) {
					continue;
				}
				//一行分を出力
				writer.write(line);
				//				改行の出力
				writer.newLine();
			}
			//例外処理とその例外の出力
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("出力処理終了");
		}
	}

}
