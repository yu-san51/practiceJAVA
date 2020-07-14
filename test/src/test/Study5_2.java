package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Study5_2 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		int a = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(;;) {
			System.out.println("半角数字を入力してください");
			int i = Integer.parseInt(br.readLine());
			if(i==0) {
				break;
			}
			a = a + i;
			System.out.println("結果は"+a+"です");
			
		}

		System.out.println("終了です");
			
	}

}
