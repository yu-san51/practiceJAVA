package test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Study5_3 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("数字を入れてください");
		int i;
		i = Integer.parseInt(br.readLine());
		System.out.println(i +"回足します");
		int add=0;
		for(int kaisu = 0; kaisu<i; kaisu++ ) {
			add += 1;
			System.out.println(add);
		}
	}

}
