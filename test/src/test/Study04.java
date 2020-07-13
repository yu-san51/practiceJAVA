package test;

public class Study04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 1;
		if(a<5) {
			System.out.println("aは5未満です。");
			if(a==0) {
				System.out.println("aは0です。");
			}else {
				System.out.println("aは0ではありません。");
			}
		}
		switch(a){
		case 0:
			System.out.println("aは0です。");
			break;
		case 1:
			System.out.println("aは1です。");
			break;
		default:
			System.out.println("aは0でも1でもありません。");
			break;
		}
	}

}
