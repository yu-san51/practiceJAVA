package test;

public class ClassMethod02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Human02 yamada = new Human02();
		
		System.out.println("私の名前は、"+ yamada.name+"です。");
		String profile = yamada.getProfile();
		System.out.println(profile +"です。");
		
		yamada.greet("田辺");
		yamada.greet(null);
	}

}
