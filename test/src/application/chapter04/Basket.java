package application.chapter04;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//バスケットというクラスには特定の型の中身を一つ入れられる

//中身を入れ替えても同じ型しか受け付けられない

//とりあえずバスケットではEとして抽象的に扱い、汎用できるようにしている
//Eという抽象の型はフルーツを継承している
//そのため必ずgetNameメソッドをもっているから、バスケットにメソッドがなくても使える
class Basket<E extends Fruit> {
	private E elem;
	private final BigDecimal PRICE = new BigDecimal(100);

	Basket(E e) {
		elem = e;
	}

	//	中身の置き換え
	void replace(E e) {
		elem = e;
	}

	E get() {
		return elem;
	}

	public static void main(String[] args) {
		//		アップル用のバスケット
		//		上記のEがすべてAppleに変換される
		Basket<Apple> appleBasket = new Basket<>(new Apple("ふじ", new BigDecimal(200)));
		System.out.println(appleBasket.get().getName());
		appleBasket.pringTotalPrice();

		appleBasket.replace(new Apple("紅玉", new BigDecimal(250)));
		System.out.println(appleBasket.get().getName());
		appleBasket.pringTotalPrice();
		//	peachのクラスのインスタンスを渡そうとするとエラー
		//	appleBasket.replace(new Peach("黄金桃"));

		//		バスケットはフルーツクラスを継承しているため、ここにメソッドがなくてもgetNameが使える
		appleBasket.printName();

		//境界ワイルドカード
		//境界型パラメーターで？記号を使用できる
		List<Fruit> fruits = new ArrayList<>();
		List<Apple> apples = new ArrayList<>();
		//↑フルーツクラスとアップルクラスは親子関係であるが
		//リスト化するとこの親子関係はなくなるのでフルーツにアップルを代入するとエラーとなる
		//xxxx fruits = apples; xxxx 親子関係ではないので×
		//xxxx fruits.add(new Peach("黄金桃", new BigDecimal(300)));実態とリストが違うものになってします×

		//フルーツリストを引数にもつメソッドを他のリストで行うことも不可
		// void doSomething(List<Fruit> fruits を　doSomething(apples) は×

		//そのため継承クラスであれば要素として認める為のコード
		List<? extends Fruit> fruits01; //フルーツを継承したクラスを指定
		List<Apple> apples01 = new ArrayList<>();
		//void doSomething(List<? extends Fruit> fruits01) を doSomething(apples);で処理可能

	}

	void printName() {
		System.out.println("籠の中身は" + elem.getName() + "です");

	}

	void pringTotalPrice() {
		BigDecimal totalPrice = PRICE.add(elem.getPrice());
		System.out.println(elem.getName() + "の入ったかごは合計" + totalPrice + "円です");
	}
}

//↓籠の中身（型の作成）
//フルーツを継承
class Apple extends Fruit {
	Apple(String name, BigDecimal price) {
		super(name, price);
	}

	protected String getName() {
		return name;
	}

	protected BigDecimal getPrice() {
		return price;
	}
}

class Peach {
	private String name;

	Peach(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}
}
