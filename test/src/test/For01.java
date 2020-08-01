package test;

public class For01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int number = 1; number <= 5; number++) {
			System.out.println("For01 = " + number);
		}
		
		int[] array = {1,2,3,4,5};
		for(int number:array) {
			System.out.println("For02 = " + number);
		}
		
		for (int count =0; count<5; count++) {
			if(count == 2) {
				break;
			}
			System.out.println("Break01 = " + count);
		}
		
		for (int count =0; count<5; count++) {
			if(count==2) {
				continue;
			}
			System.out.println("continue01 = " + count);
		}
		
		int num = 1;
		printNum(num);
	}
	
	public static int printNum(int num) {
		if(num<50) {
			num *=2;
			System.out.println("再帰処理 = " + num);
			printNum(num);
		}
		return num;
	}

}
