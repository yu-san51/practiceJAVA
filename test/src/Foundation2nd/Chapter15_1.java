package Foundation2nd;

public class Chapter15_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 976;
		int b = 427;
		System.out.println(a + " と " + b + " の最大公約数は、" + gcd(a, b) + "です");
	}

	static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
//		再帰呼び出し
		return gcd(b, a % b);
	}

}
