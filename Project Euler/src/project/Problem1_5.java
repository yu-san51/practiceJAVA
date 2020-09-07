package project;

public class Problem1_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Problem1_5();
	}

	public Problem1_5() {
		//problem1 n未満の3または5の倍数の全ての合計を求める
		System.out.println(sumBelow(10));
	}

	private int sumBelow(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}

}
