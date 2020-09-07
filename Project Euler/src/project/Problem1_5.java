package project;

public class Problem1_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Problem1_5();
	}

	public Problem1_5() {
		//problem1 n未満の3または5の倍数の全ての合計を求める
		//		System.out.println(problem1(10));

		//problem2 Fibonacci数列の各行は前の2項を足すことで生成
		//Fibonacci数列で4百万を超えない項を考え、偶数値の合計を求める
		//		problem2();

		//数600851475143の最大素因数は何か？
		problem3();
	}

	private int problem1(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}

	private void problem2() {
		int a;
		int b = 1;
		int term = 2;
		int sum = 2;//while文で第3項(termはa+bで作られている)から求めているので初期値を2にしている
		while (term < 4000000) {
			a = b;
			b = term;
			term = a + b;
			if (term % 2 == 0) {
				sum += term;
			}
		}
		System.out.println(sum);
	}

	private void problem3() {
		//まずは因数であるかどうかを調べる
		long targetNumber = 600851475143L;
		long factor = 1;
		//forの開始は平方根の整数部分（素因数は必ずその数以下になる）
		for (long i = (int) Math.sqrt((double) targetNumber); i > 1; i--) {
			if (targetNumber % i == 0 && checkPrimaryOf(i)) {
				factor = i;
				break;
			}
		}
		System.out.println(factor);
	}

	private boolean checkPrimaryOf(long n) {
		//problem3で求めた因数画素数かどうか調べる
		for (int i = 2; i <= (int) Math.sqrt((double) n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
