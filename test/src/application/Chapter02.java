package application;

public class Chapter02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//		列挙した定数の出力
		System.out.println("列挙型" + Dessert.APPLE);
		System.out.println(Dessert.ICE_CREAM);
		System.out.println(Dessert.CAKE);

		//		変数に定数は代入もできる
		Dessert apple = Dessert.APPLE;
		System.out.println("変数" + apple);

		//		引数として渡すことでメソッド違いのコンパイルエラーを防ぐことができる
		printDessertName(Dessert.APPLE);

		//		列挙した定数名をString型で返す　name()メソッド
		System.out.println("定数名" + Dessert.APPLE.name());

		//		String型の名称からインスタンス名をとってくる　valueOf(string name)メソッド
		//		valueOfに列挙されていない文字列を指定すると例外が発生
		Dessert appleValue = Dessert.valueOf("APPLE");
		System.out.println("インスタンス名" + appleValue);

		//		列挙した順序をint型で返す  ordinal()
		System.out.println(Dessert.APPLE.ordinal());
		System.out.println(Dessert.ICE_CREAM.ordinal());
		System.out.println(Dessert.CAKE.ordinal());

		//		金額を持たせたときの値段の取得
		System.out.println(Dessert.APPLE.getPrice());
		System.out.println(Dessert.ICE_CREAM.ordinal());
		System.out.println(Dessert.CAKE.ordinal());

		//		抽象化したadvertiseをそれぞれで実行
		Dessert.APPLE.advertise();
		Dessert.ICE_CREAM.advertise();
		Dessert.CAKE.advertise();
	}

	//	定数の列挙
	//	新しいインスタンスを生成できない
	//	privateなので外部からのアクセスは不可
	//	それぞれDessert型のstatic finalの定数として宣言されるので「==」が使える。
	public enum Dessert {
		APPLE(100) {
			//			オーバーライド　リンゴ用のadvertiseの実装
			//			ポリモーフィズムを活用して列挙の中の個々で違う動きをさせる
			void advertise() {
				System.out.println("真っ赤なリンゴが" + getPrice() + "円！");
			}

		},

		ICE_CREAM(200) {
			void advertise() {
				System.out.println("夏においしいアイスクリームが" + getPrice() + "円！");
			}
		},

		CAKE(300) {
			void advertise() {
				System.out.println("みんな大好きケーキが" + getPrice() + "円！");
			}
		},
		;

		//		値段保持のフィールド
		private int price;

		//		コンストラクタの追加
		private Dessert(int price) {
			this.price = price;
		}

		//		値段取得のメソッド
		public int getPrice() {
			return price;
		}

		//		advdertise　個々の宣伝出力を抽象化するメソッドで内容は各インスタンスで実装
		abstract void advertise();
	}

	static void printDessertName(Dessert dessert) {
		System.out.println("列挙型定数の引数として" + dessert);
	}

}
