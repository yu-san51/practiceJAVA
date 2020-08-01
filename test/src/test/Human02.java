package test;

public class Human02 {
	public String name;
	public int age;
	public String profession;

	public Human02() {
		this.name = "山田";
		this.age = 20;
		this.profession = "プログラマー";
	}

	public String getProfile() {
		return "年齢は" + this.age + "、職業は" + this.profession;
	}

	public void greet(String friend) {
		if (friend == null) {
			System.out.println("挨拶する友達が分かりません");
			return;
		}
		System.out.println(friend + "さん、こんにちは！");
	}
}
