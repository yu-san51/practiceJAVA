package practice;

public class Chapter15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 976;
		int b = 427;
		System.out.println(a + "と" + b + "の最大公約数は" + gcd(a, b) + "です");
	}

	static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

}
