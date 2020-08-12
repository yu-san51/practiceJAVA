package Foundation2nd;

//runnableのインターフェイスを実装したクラス
public class ThreadSample implements Runnable {
	int num;
//chapter15_4で使うコンストラクタ
	public ThreadSample(int num) {
		this.num = num;
	}

//	runnableインターフェイスを実装したクラスはrunメソッドを必ず実装しなくてはならない
	public void run() {
		for (int i = 1; i <= 3; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("ThreadSample" + num + "のスレッド：" + i + "回目");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
