package com.orinigal_game.janken;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;//ウィンドウの設定
import javax.swing.JPanel;

public class GameMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//ウインドウの設定
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

		//パネル表示
		//JPanelクラスのインスタンス生成
		JPanel headerPanel = new JPanel();
		//パネルの色を黒に指定
		headerPanel.setBackground(Color.BLACK);
		//Dimensionクラスのインスタンスを生成。引数にサイズの設定
		Dimension headerPanelDimension = new Dimension(640, 50);
		//上記引数をパネルのサイズにするという設定
		headerPanel.setPreferredSize(headerPanelDimension);
		//ここまで設定したパネルをウィンドウ（frame）に追加する
		//BorderLayout.NORTHでパネルを追加する位置を指定。今回は一番上
		frame.add(headerPanel, BorderLayout.NORTH);

		//ウィンドウ表示
		frame.setVisible(true);
	}

}
