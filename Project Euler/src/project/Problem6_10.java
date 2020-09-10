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
		problem7();
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
}
