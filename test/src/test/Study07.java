package test;

public class Study07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Teppan t = new Teppan();
		t.setTemp();
		System.out.println("現在の温度は"+t.getTemp()+"度です。");
		t.setTemp(200);
		System.out.println("現在の温度は"+t.getTemp()+"度です。");
		System.out.println(t.yaku());
	}

}
class Teppan{//鉄板クラス
	private int temp=180;//鉄板温度
	Teppan(){
		this.temp=0;
	}
	void setTemp() {
		this.temp=180;
	}
	void setTemp(int temp){
		this.temp=temp;
		System.out.println("温度を"+this.temp+"にしました");
	}
	String yaku(){//焼くメソッド
		return temp+"度で焼きました";
	}
	int getTemp(){
		return temp;
	}
}