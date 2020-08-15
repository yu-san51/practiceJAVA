package application.chapter03;

import java.util.ArrayList;
import java.util.List;

public class Chapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Character> party = new ArrayList<Character>();
		party.add(new Soldier());
		party.add(new Playboy());

		Chapter03.partyAttack(party);
	}

	public static void partyAttack(List<Character> party) {
		for (Character character : party) {
			int hp = character.attack();
			System.out.println("ヒットポイント" + hp);
		}
	}

}
