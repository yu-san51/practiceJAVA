package test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Study05 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("お名前を教ええてください");
		String name = br.readLine();
		System.out.println("こんにちは"+name+"さん");
		int age;
		System.out.println("年齢を教ええてください");
		age = Integer.parseInt(br.readLine());
		System.out.println(age+"歳なんですね。");
	}

}
