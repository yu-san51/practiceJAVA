package project;

import java.util.ArrayList;
import java.util.List;

public class Problem6_10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		new Problem6_10();

	}

	public Problem6_10() {
		//自然数最初の10個の和の2乗と2乗の和の差を求めよ。
		//problem6();

		//10001番目の素数を求めよ.
		//problem7();

		//13個の隣接した数字の積が最大のものを求めよ。その積の値は何か。
		//13この数字は下記にdigitsとして記載
		//problem8();

		//ピタゴラス数とはa < b < cで a^2 + b^2 = c^2を満たす数の組
		// a + b + c = 1000となるピタゴラス数abcの積を求めよ。
		//problem9();

		//2百万を超えない素数の全ての和を求めよ。
		problem10();
	}

	private void problem6() {
		System.out.println(squareOfSum() - sumOfSquares());
	}

	//intにするときはその型の範囲になるように注意
	private int sumOfSquares() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			//2乗したものを足していく
			sum += i * i;
		}
		return sum;
	}

	private int squareOfSum() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		//足されたものを2乗
		return sum * sum;
	}

	//problem7のための素数リスト
	List<Integer> primeNumbers = new ArrayList<>();

	private void problem7() {
		primeNumbers.add(2);

		int count = 1;
		int num = 3;
		while (count != 10001) {
			if (check(num)) {
				//checkメソッドでtrueだったものをArrayListに追加
				primeNumbers.add(num);
				count++;
			}
			num++;
		}
		//sizeメソッドはそのListの要素数を調べる
		System.out.println(primeNumbers.get(primeNumbers.size() - 1));
	}

	private boolean check(int num) {
		//素数かどうかを判定するメソッド
		//numがArrayListに入っている素数すべてで割り切れるかどうか
		//割り切れなければ素数(true)
		for (Integer primeNumber : primeNumbers) {
			if (num % primeNumber == 0) {
				return false;
			}
		}
		return true;
	}

	//problem8のための数字一覧digits
	String digits = "73167176531330624919225119674426574742355349194934"
			+ "96983520312774506326239578318016984801869478851843"
			+ "85861560789112949495459501737958331952853208805511"
			+ "12540698747158523863050715693290963295227443043557"
			+ "66896648950445244523161731856403098711121722383113"
			+ "62229893423380308135336276614282806444486645238749"
			+ "30358907296290491560440772390713810515859307960866"
			+ "70172427121883998797908792274921901699720888093776"
			+ "65727333001053367881220235421809751254540594752243"
			+ "52584907711670556013604839586446706324415722155397"
			+ "53697817977846174064955149290862569321978468622482"
			+ "83972241375657056057490261407972968652414535100474"
			+ "82166370484403199890008895243450658541227588666881"
			+ "16427171479924442928230863465674813919123162824586"
			+ "17866458359124566529476545682848912883142607690042"
			+ "24219022671055626321111109370544217506941658960408"
			+ "07198403850962455444362981230987879927244284909188"
			+ "84580156166097919133875499200524063689912560717606"
			+ "05886116467109405077541002256983155200055935729725"
			+ "71636269561882670428252483600823257530420752963450";

	private void problem8() {
		//digitsを数字として格納しなおしている
		int[] numbers = new int[digits.length()];
		for (int i = 0; i < digits.length(); i++) {
			//charAtメソッド 文字列からn番目の文字列を抜き出す（先頭は0文字目）
			//0の文字を除去
			numbers[i] = digits.charAt(i) - '0';
		}

		//intだと桁数が足りないのでlong
		long max = 0;
		//かけた数字の一番大きいものを精査
		for (int i = 0; i <= numbers.length - 13; i++) {
			long p = getProduct(numbers, i);
			if (max < p) {
				max = p;
			}
		}
		System.out.println(max);
	}

	private long getProduct(int[] numbers, int index) {
		long product = 1L;
		//数字をかけ合わせた合計の算出
		for (int i = index; i < index + 13; i++) {
			product *= numbers[i];
		}
		return product;
	}

	private void problem9() {
		//aとbを1からしらべる
		//必ず見つかるかわからないからfor文
		//二重ループであるからbreak文を使うためにLoopのラベル構文を使用
		//breakだけだと一番内側のブロックを抜ける
		//ラベルを付けることで、そのラベル付けしたブロックを抜けることができる
		Loop: for (int a = 1; a < 1000; a++) {
			for (int b = 1; b < 1000; b++) {
				int c = 1000 - a - b;
				if (a * a + b * b == c * c) {
					System.out.println(a * b * c);
					break Loop;
				}
			}
		}
	}

	//broblem10で2000000を超えない数の素数を求めるため配列をつくる
	boolean[] numbers = new boolean[2000000];

	private void problem10() {
		//booleanの初期値はfalseであるためtrueに設定
		numbers[2] = true;
		//偶数は確実に素数ではないため２ずつプラス
		for (int i = 3; i < numbers.length; i += 2) {
			if (check10(i)) {
				//チェックでtrueだったもののみ格納
				numbers[i] = true;
			}
		}

		//素数の一つ目は2であるため初期値に
		long sum = 2;
		for (int i = 3; i < numbers.length; i += 2) {
			if (numbers[i]) {
				//チェックでtrueだっだものが格納されているmunbersを一つずつ足し算
				sum += i;
			}
		}
		System.out.println(sum);
	}

	private boolean check10(int num) {
		//素数を求める
		for (int i = 2; i <= (int) Math.sqrt(num); i++) {
			if (numbers[i] && num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
