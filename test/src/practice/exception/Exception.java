package practice.exception;

public class Exception {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			System.out.println("100 ÷ 0 は？");
			int result = 100 / 0;
			System.out.println("計算結果" + result);
		} catch (ArithmeticException e) {
			System.out.println("例外が発生");
		} finally {
			System.out.println("プログラム終了");
		}
		
		try {
			Exception.division(100,0);
		}catch(ArithmeticException e){
			System.out.println("ArithmeticExceptionの例外が発生");
		}catch(IllegalArgumentException e) {
			System.out.println("IllegalArgumentExceptionの例外が発生");
			throw e;
		}
		System.out.println("プログラムの終了");
		
	}
	
		public static void division(int a, int b) {
			System.out.println(a + "÷" + b + "は？");
			if(b==0) {
				throw new IllegalArgumentException("引数が不正です");
			}
			int result = a/b;
			System.out.println("計算結果" + result);
		}

}
