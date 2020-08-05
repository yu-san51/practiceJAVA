package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Chapter15_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		FileSystem fs = FileSystems.getDefault();
		Path inputPath = fs.getPath("test/resouces/input.text");
		Path outputPath = fs.getPath("test/resouces/output.text");

		try (BufferedReader reader = Files.newBufferedReader(inputPath);
				BufferedWriter writer = Files.newBufferedWriter(outputPath);) {
			String line = null;

			while ((line = reader.readLine()) != null) {
				if (line.length() != 5) {
					continue;
				}
				writer.write(line);
				writer.newLine();
			}
		} catch(IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println("出力処理終了");
		}
	}

}
