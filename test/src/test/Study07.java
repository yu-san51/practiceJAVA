package test;

public class Study07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Teppan t = new Teppan();
		t.temp=200;
		System.out.println(t.guzai+"を入れます");
		System.out.println(t.kata+"の型を使って焼きます");
		System.out.println(t.yaku());
	}

}
class Teppan{//鉄板クラス
	int temp=180;//鉄板温度
	String guzai="あんこ";
	String kata="たいやき";
	String yaku(){//焼くメソッド
		return temp+"度で焼きました";
	}
}