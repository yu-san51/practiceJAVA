package Foundation2nd;

import test.Car;

public class Chapter09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double fuelCost = 12.5;
		double fuelAmount = 55.0;

		Car car = new Car(fuelCost, fuelAmount);

		car.move(20);
		System.out.println("残量は" + car.getFuelAmount() + "です");
	}

}
