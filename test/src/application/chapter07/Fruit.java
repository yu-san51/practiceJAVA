package application.chapter07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fruit {
	public String name;
	public int quantity;

	//名前と在庫数を引数にしたコンストラクタ
	public Fruit(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	//在庫数を増やしたフルーツを返すメソッド
	public Fruit order(int quantityToAdd) {
		return new Fruit(this.name, this.quantity + quantityToAdd);
	}

	//出力用にtoStrongをオーバーライド
	@Override
	public String toString() {
		return name + ": " + quantity + "個";
	}

	public static void main(String[] args) {
		List<Fruit> fruits = new ArrayList<>();
		fruits.add(new Fruit("りんご", 7));
		fruits.add(new Fruit("みかん", 15));
		fruits.add(new Fruit("いちご", 4));
		fruits.add(new Fruit("メロン", 8));
		fruits.add(new Fruit("ぶどう", 20));

		//絞り込みリスト
		List<Fruit> filtered = new ArrayList<>();

		//拡張forでリストをループ
		for (Fruit fruit : fruits) {
			//もし個数が10以下だったら絞り込みリストに追加
			if (fruit.quantity <= 10) {
				filtered.add(fruit);
			}
		}

		//２０個ずつ追加
		List<Fruit> ordered = new ArrayList<>();
		for (Fruit fruit : filtered) {
			ordered.add(fruit.order(20));
		}

		//個数が少ない順に並べる
		ordered.sort(new Comparator<Fruit>() {
			@Override
			public int compare(Fruit f1, Fruit f2) {
				return f1.quantity - f2.quantity;
			}
		});

		//絞り込んで並び替えたリストを拡張forでループしながら出力
		for (Fruit fruit : ordered) {
			System.out.println(fruit);
		}

		//ラムダ式を使って↑を書き換える
		fruits.stream() //streamを生成
				.filter(f -> f.quantity <= 10) //中間操作10以下を抽出
				.map(f -> f.order(20)) //中間操作20ずつ発注
				.sorted((f1, f2) -> f1.quantity - f2.quantity) //中間操作個数の少ない順に並び変え
				.forEach(System.out::println); //終端操作　出力

		//在庫が10以下のフルーツの数
		long count = fruits.stream()
				.filter(f -> f.quantity <= 10)
				.count();
		System.out.println(count);

		//個数の多い順に並べたフルーツのリスト
		List<Fruit> sortedFruits = fruits.stream()
				.sorted((f1, f2) -> f2.quantity - f1.quantity)
				.collect(Collectors.toList());

		System.out.println(sortedFruits);
	}
}
