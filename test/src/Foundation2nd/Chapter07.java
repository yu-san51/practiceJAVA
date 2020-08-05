package Foundation2nd;

public class Chapter07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int distance = 15;
		if (distance <= 5) {
			System.out.println("とても近いです");
		} else if (distance <= 10) {
			System.out.println("近いです");
		} else if (distance <= 15) {
			System.out.println("遠いです");
		} else {
			System.out.println("とても遠いです");
		}

		String color = "red";
		switch (color) {
		case "red":
			System.out.println("赤です");
			break;
		case "yellow":
			System.out.println("黄色です");
			break;
		case "blue":
			System.out.println("青です");
			break;
		default:
			System.out.println("信号の色ではありません");
		}
	}

}
