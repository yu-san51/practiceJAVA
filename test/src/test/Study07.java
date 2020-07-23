package test;

public class Study07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Teppan t1 = new Teppan();
		Teppan t2 = new Teppan();
		Teppan t3 = new Teppan();
		System.out.println("鉄板は"+ Teppan.cnt+"枚です。");
		System.out.println("鉄板は"+ Teppan.getCnt()+"枚です。");
	}

}
class Teppan{//鉄板クラス
	private int temp=0;//鉄板温度
	static public int cnt=0;
	static int getCnt() {
		return cnt;
	}
	Teppan(){
		this.temp=0;
		cnt++;
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