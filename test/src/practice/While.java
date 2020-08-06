package practice;

public class While {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//		while構文
		int number = 100;
		while (number < 50) {
			number *= 2;
			System.out.println("While01 = " + number);
		}

		//		dowhile構文
		number = 100;
		do {
			number *= 2;
			System.out.println("DoWhile01 = " + number);
		} while (number < 50);

		//		for
		for (int num = 1; num <= 5; num++) {
			System.out.println("For01 = " + num);
		}

		//		配列を回してとってこれる
		int[] array = { 10, 5, 2, 976 };
		for (int n : array) {
			System.out.println("For02 = " + n);
		}

		//		breakでそれ以後止める
		for (int count = 0; count < 5; count++) {
			if (count == 2) {
				break;
			}
			System.out.println("Break01 = " + count);
		}

		//		continueでそのターンだけ飛ばす
		for (int cnt = 0; cnt < 5; cnt++) {
			if (cnt == 2) {
				continue;
			}
			System.out.println("Continue01 = " + cnt);
		}

		//		再帰処理
		number = 1;
		printNum(number);

	}

	//	再帰処理のためのメソッド
	public static int printNum(int number) {
		if (number < 50) {
			number *= 2;
			System.out.println("Recursive01 = " + number);
			printNum(number);
		}
		return number;
	}

}
