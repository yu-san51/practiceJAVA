package application;

public class Chapter01 {
	public class Human {
		public class HumanLeg {
			public void kick() {
				System.out.println("蹴る");

				Human human = new Human();
				Human.HumanLeg leg = human.new HumanLeg();
				leg.kick();

				new Human().new HumanLeg().kick();
			}
		}
	}
}
