package com.orinigal_game.janken;

import javax.swing.JFrame;

public class GameMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//ウインドウの表示
		//JFrameクラスのインスタンスを作成
		JFrame frame = new JFrame("じゃんけんゲーム");
		//ウィンドウのサイズ設定
		frame.setSize(640, 480);
		//ウィンドウを画面の中心にする
		frame.setLocationRelativeTo(null);
		//ウィンドウのｘを押すと終了する
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//ウィンドウのサイズを固定→レイアウトの崩れ防止
		frame.setResizable(false);
		//見えなかったウィンドウを表示
		frame.setVisible(true);
	}

}
