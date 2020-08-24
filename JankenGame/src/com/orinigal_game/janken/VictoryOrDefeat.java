package com.orinigal_game.janken;

public class VictoryOrDefeat {

	//じゃんけんで買ったポイントの宣言
	private static int point = 0;

	public static final void decisionVictoryOrDefeat(int computerHand, int playerHand) {

		int playerHandTemp = playerHand;
		playerHandTemp++;

		//買ったら1点、あいこはプラス0点、負ければ0点になる
		if (playerHand == computerHand) {
			Panel.contentsLabel.setText("あいこかよ！（" + point + "）");
		} else if ((playerHand == 3 && computerHand == 1) || (playerHandTemp == computerHand)) {
			point += 1;
			Panel.contentsLabel.setText("お前の勝ちかよ！（" + point + "）");
		} else {
			point = 0;
			Panel.contentsLabel.setText("お前の負けだよ（" + point + "）");
		}

	}
}
