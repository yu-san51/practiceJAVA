package app;

import java.util.Random;

//コンソールに分布図を出力する

public class Hello20200910 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//分布図のデータとなる点数を作成
		//1000からなる配列をつくる（points）
		//その配列の一つ一つに点数をランダムで数字100までの数字を格納
		int[] points = new int[1000];
		Random random = new Random();
		for (int i = 0; i < points.length; i++) {
			points[i] = random.nextInt(101);
		}

		//集計
		//11個の配列を作る
		int[] counts = new int[11];
		//counts配列の中に1000個のポイントを10で割った数ごとに振り分ける
		//pointにな値してpoint / 10が格納する先の要素番号となる
		for (int point : points) {
			counts[point / 10]++;
		}

		//出力
		//countsに振り分けたものを出力するときのラベル
		String[] labels = {
				" 0～ 9点",
				"10～19点",
				"20～29点",
				"30～39点",
				"40～49点",
				"50～59点",
				"60～69点",
				"70～79点",
				"80～89点",
				"90～99点",
				"   100点",
		};

		for (int i = 0; i < counts.length; i++) {
			//出力する行のフォーマット[ラベル]:[人数]:のグラフ[*]
			//printf(書式,引数1, 引数2, 引数3...) 文字や数値などを指定した書式で画面に出力できる
			//%は書式指定の開始、s 文字列、d 10進数の整数
			//人数のところは半角数字4桁10進数のフィールドで出力
			System.out.printf("%s:%4d人:%s", labels[i], counts[i], graphOf(counts[i]));
			System.out.println();
		}
	}

	private static String graphOf(int count) {
		//人数を引数にして*の文字列を返却する
		//10人で*が一つつく

		//StringBuilder 新しくオブジェクトを作ることなくappentdメソッドで文字列を追加できる
		StringBuilder sb = new StringBuilder();

		int length = 0;
		if (0 < count && count < 10) {
			//一人以上１０人未満の場合
			length = 1;
		} else if (10 <= count) {
			//10人以上の場合、割る10したもの＋１
			length = count / 10 + 1;
		}

		for (int i = 0; i < length; i++) {
			sb.append("*");
		}

		return sb.toString();
	}

}
