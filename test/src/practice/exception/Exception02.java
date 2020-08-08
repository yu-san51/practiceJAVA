package practice.exception;


import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			Exception02.readFile("exception.txt");
		}catch(FileNotFoundException e) {
			System.out.println("FileNotFoundExceptionの例外が発生");
		}
		System.out.println("プログラム終了");
	}
	
	public static void readFile(String fileName) throws FileNotFoundException{
		System.out.println("ファイルの読み込み開始");
		FileReader fr = new FileReader(fileName);
		System.out.println(fileName + "の読み込み完了");
	}
	
	

}
