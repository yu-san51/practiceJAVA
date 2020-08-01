package test;

public class Switch01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int val = 2;
		switch (val) {
		case 3:
			System.out.println("よくできました！");
			break;
		case 2:
			System.out.println("ふつうでした");
			break;
		default:
			System.out.println("がんばろう");
		}

		if (val == 3) {
			System.out.println("よくできました");
		} else if (val == 2) {
			System.out.println("ふつうでした");
		} else {
			System.out.println("がんばろう");
		}
	}

}
