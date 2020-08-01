package test;

public class Human03 {
	static public int humanCount = 0;
	public String name;
	public static final String GREETING = "こんにちは";

	public Human03(String name) {
		this.name = name;
		Human03.humanCount++;
	}

	static public void staticMethodPrint() {
		System.out.println("人の数は" + Human03.humanCount);
	}

	public void instanceMethodPrint() {
		System.out.println("名前は" + name);
		System.out.println("人の数は" + Human03.humanCount);
	}
}
