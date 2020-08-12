package Foundation2nd;

public class Chapter15_4 {

	public static void main(String[] args) {
		//スレッドを同時に実行することで並列処理ができる。（マルチスレッド）
		//マルチスレッドはthreadクラスの継承かrunnableインターフェイスの実装で可能
		//以下はrunnableの例

		for (int i = 1; i <= 2; i++) {
			//threadsampleクラスで定義しているthreadsample
			ThreadSample mt = new ThreadSample(i);
			//thradクラスでインスタンスの作成
			Thread thread = new Thread(mt);
			//threadクラスにあるstartメソッド
			thread.start();
		}

		for (int i = 1; i <= 3; i++) {
			try {
				//sleepメソッド単位はミリ秒
				Thread.sleep(1000);
				System.out.println("Chapter15_4のスレッド：" + i + "回目");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
