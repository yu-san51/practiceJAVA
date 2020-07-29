package test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Study06 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		String[] kamoku = new String[5];
		kamoku[0]="国語";
		kamoku[1]="数学";
		kamoku[2]= "理科";
		kamoku[3]="社会";
		kamoku[4]="英語";
		int[] tokuten = new int[5];
		int goukei =0;
		System.out.println("科目の得点を入力してください");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<5; i++) {
			System.out.println(kamoku[i]+":");
			tokuten[i] = Integer.parseInt(br.readLine());
		}
				
	}

}
