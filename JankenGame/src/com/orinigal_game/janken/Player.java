package com.orinigal_game.janken;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Player {

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
		return (button);
	}
}
