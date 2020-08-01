package test;

public class Chapter08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num = 1;
		int number;
		while(num<5) {
			number= num * num;
			System.out.println("while01 = " + number);
			num++;
		}
		
		int array[]= {1,2,3,4};
		for(int a=0; a<array.length; a++ ) {
			System.out.println(array[a]);
		}
		
		for(int i:array){
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
