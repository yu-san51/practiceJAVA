package Foundation2nd;

public class Chapter08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//		while
		int number = 1;
		while (number < 5) {
			System.out.println("while" + number * number);
			number++;
		}

		//		for
		int[] array = { 5, 10, 15, 20 };
		for (int i = 0; i < array.length; i++) {
			System.out.println("for" + array[i]);
		}

		//		拡張
		for (int num : array) {
			if (num % 2 == 0) {
				continue;
			}
			System.out.println("continue" + num);
		}
	}

}
