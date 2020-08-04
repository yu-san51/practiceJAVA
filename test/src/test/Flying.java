package test;

public interface Flying {
	void fly();

	default void powerOff() {
		System.out.println("飛んでいる場合は落下します");
	}
}
