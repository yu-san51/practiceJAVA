package com.orinigal_game.janken;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

//インターフェイスの実装
public class Player implements ActionListener {

	//じゃんけんで買ったポイントの宣言
	private static int point = 0;

	//プレイヤーが操作するもののクラス
	public static void createButton(JPanel footerPanel) {
		//
		//		ボタンを表示
		JButton btnGu = new JButton("ぐー");
		btnGu = setButton(btnGu);
		footerPanel.add(btnGu, BorderLayout.WEST);

		JButton btnChoki = new JButton("ちょき");
		btnChoki = setButton(btnChoki);
		footerPanel.add(btnChoki, BorderLayout.CENTER);

		JButton btnPa = new JButton("ぱー");
		btnPa = setButton(btnPa);
		footerPanel.add(btnPa, BorderLayout.EAST);
	}

	//	ボタンの設定メソッド
	public static JButton setButton(JButton button) {
		int buttonSizeX = (640 - 20) / 3; //横並びにしたいので3つで割る
		Dimension buttonDimension = new Dimension(buttonSizeX, 50);
		button.setPreferredSize(buttonDimension);
		Font buttonFont = new Font("MS　ゴシック", Font.PLAIN, 24);
		button.setFont(buttonFont);
		//プレイヤーを生成
		Player player = new Player();
		//actionperformedのよびだし
		button.addActionListener(player);

		return (button);
	}

	//プレイヤーが推したボタンをパネルに反映
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		int playerHand = 0;
		if (command.equals("ぐー"))
			playerHand = 1;
		else if (command.equals("ちょき"))
			playerHand = 2;
		else if (command.equals("ぱー"))
			playerHand = 3;

		int computerHand = Computer.decidesComputerHand();

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
