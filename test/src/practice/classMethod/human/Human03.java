package practice.classMethod.human;

public class Human03 {
	//	static変数
	static public int humanCount = 0;
	public String name;

	//	定数フィールド
	public static final String GREETING = "こんにちは";

	public Human03(String name) {
		this.name = name;
		Human03.humanCount++;
	}
	//	↑publicから同メソッドのstaticにはアクセス可

	static public void staticMethodPrint() {
		System.out.println("人の人数は" + Human03.humanCount);
	}
	//	↑staticからpublic（インスタンス変数）にはアクセス不可、static-staticはOK

	public void instanceMethodPrint() {
		System.out.println("名前は" + name);
		System.out.println("人の数は" + Human03.humanCount);
	}

//	static,finalはインスタンスを生成せずに使用、参照可能
//	インスタンスメンバ（無印）

}
