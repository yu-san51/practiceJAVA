package test;

public class While01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number = 1;
		while (number < 50) {
			number *= 2;
			System.out.println("While01 = " + number);
		}
		
		number =1;
		do {
			number *= 2;
			System.out.println("DoWhile01 = " + number);
		} while (number < 50);
	}

}
