package test;

public class Study03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a=0;
		for(int i =1; i<=10; i++) {
			a = a+i;
		}
		System.out.println("1から10までの値を加算した結果は"+a);
		a = 0;
		int i =1;
		while(i<=10) {
			a = a+i;
			i++;
		}
		System.out.println("1から10までの値を加算した結果は"+a);
		a = 0;
		i =1;
		do {
			a = a+i;
			i++;
		}while(i<=10);
		System.out.println("1から10までの値を加算した結果は"+a);
		
	}

}
