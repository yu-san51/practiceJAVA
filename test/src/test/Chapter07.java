package test;

public class Chapter07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int distance = 5;
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
		switch(color){
			case "red":
				System.out.println("赤信号です");
				break;
			case "yellow":
				System.out.println("黄色信号です");
				break;
			case "blue":
				System.out.println("青信号です");
				break;
			default:
				System.out.println("信号の色ではありません");
		}
	}

}
