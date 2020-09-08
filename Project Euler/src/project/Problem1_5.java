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
		//		problem3();

		//3桁の２つの数の積からなる回文数で最大のものを求める
		//回文数とは両方から同じように読める数（ex.9009）
		//		problem4();

		//1から20のすべてで割れる最小の正の数は何か。
		problem5();
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

	private void problem4() {
		int palindromicNumber = 0;
		for (int i = 999; i > 900; i--) {
			for (int j = 999 - (999 - i); j > 900; j--) {
				int n = i * j;
				if (checkPalindromicity(n) && palindromicNumber < n) {
					palindromicNumber = n;
				}

			}
		}
		System.out.println(palindromicNumber);
	}

	private boolean checkPalindromicity(int n) {
		//valueOf 戻り値が異なるものを指定のオブジェクトに変更
		//StringBuilder 指定された引数と同じ文字を含む文字列を構築
		//reverse() 文字を逆さまにしたもので置き換える
		return Integer.valueOf((new StringBuilder(String.valueOf(n)).reverse().toString())) == n;
	}

	private void problem5() {
		int num = 2;
		while (true) {
			if (check(num)) {
				break;
			}
			num++;
		}
		System.out.println(num);
	}

	private boolean check(int n) {
		for (int i = 2; i <= 20; i++) {
			if (n % i != 0) {
				return false;
			}
		}
		return true;
	}
}
