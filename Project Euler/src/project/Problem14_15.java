package project;

public class Problem14_15 {
	public static void main(String[] args) {
		new Problem14_15();
	}

	public Problem14_15() {
		//n → n/2 (nが偶数)
		//n → 3n + 1 (nが奇数)
		//この規則にのっとって100万未満の数で開始して最長の数列を得るのは何か？
		//注意：数列を開始すれば100万を超えても良い。
		problem14();
	}

	private void problem14() {
		int max = 0;
		long start = 0;
		for (long i = 1; i < 1000000; i++) {
			int length = 1;
			long num = i;
			do {
				num = iter(num);
				length++;
			} while (num != 1);
			if (max < length) {
				max = length;
				start = i;
			}
		}
		System.out.println(start);
	}

	private long iter(long n) {
		if (n % 2 == 0) {
			return n / 2;
		} else {
			return 3 * n + 1;
		}
	}
}
