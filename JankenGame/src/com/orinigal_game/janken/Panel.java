package com.orinigal_game.janken;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;//ウィンドウの設定
import javax.swing.JLabel;//パネル上の文字
import javax.swing.JPanel;//パネル

public class Panel {
	//プレイヤークラスのメソッドを呼び出すために宣言
	public static JLabel headerLabel;
	public static JLabel contentsLabel;

	public static void createPanel(JFrame frame) {

		//パネル表示
		//JPanelクラスのインスタンス生成
		//JPanel headerPanel = new JPanel();
		//パネルの色を黒に指定
		//headerPanel.setBackground(Color.BLACK);
		//Dimensionクラスのインスタンスを生成。引数にサイズの設定
		//Dimension headerPanelDimension = new Dimension(640, 50);
		//上記引数をパネルのサイズにするという設定
		//headerPanel.setPreferredSize(headerPanelDimension);
		//ここまで設定したパネルをウィンドウ（frame）に追加する
		//BorderLayout.NORTHでパネルを追加する位置を指定。今回は一番上
		//frame.add(headerPanel, BorderLayout.NORTH);

		//↓↓↓↓メソッドを使って使いまわせるようにする
		Dimension headerPanelDimension = new Dimension(640, 50);
		JPanel headerPanel = setPanel(Color.BLACK, headerPanelDimension);
		//		フォント設定メソッド
		headerLabel = new JLabel("「さあ、じゃんけんで勝負だっ！」");
		headerLabel = setFont(Color.WHITE, headerLabel, 24);
		headerPanel.add(headerLabel);
		frame.add(headerPanel, BorderLayout.NORTH);

		//
		//コンテンツパネル
		//		JPanel contentsPanel = new JPanel();
		//		contentsPanel.setLayout(new BorderLayout());
		//		contentsPanel.setBackground(Color.WHITE);
		//		frame.add(contentsPanel, BorderLayout.CENTER);

		//
		//↓↓↓↓↓メソッド
		Dimension contentsPanelDimension = new Dimension(640, 50);
		JPanel contentsPanel = setPanel(Color.WHITE, contentsPanelDimension);
		contentsLabel = new JLabel("じゃんけん・・・");
		contentsLabel = setFont(Color.BLACK, contentsLabel, 54);
		contentsPanel.add(contentsLabel);
		frame.add(contentsPanel, BorderLayout.CENTER);

		//
		//フッタパネル
		//		JPanel footerPanel = new JPanel();
		//		footerPanel.setLayout(new BorderLayout());
		//		footerPanel.setBackground(Color.BLACK);
		//		Dimension footerPanelDimension = new Dimension(640, 50);
		//		footerPanel.setPreferredSize(footerPanelDimension);
		//		frame.add(footerPanel, BorderLayout.SOUTH);

		//		↓↓↓↓↓メソッド
		Dimension footerPanelDimension = new Dimension(640, 50);
		JPanel footerPanel = setPanel(Color.BLACK, footerPanelDimension);
		//プレイヤークラスのメソッドの呼び出し
		Player.createButton(footerPanel);

		frame.add(footerPanel, BorderLayout.SOUTH);

	}

	//	パネルの設定のメソッド
	public static JPanel setPanel(Color color, Dimension PanelDimension) {
		JPanel panel = new JPanel();
		panel.setPreferredSize(PanelDimension);
		panel.setLayout(new BorderLayout());
		panel.setBackground(color);
		return (panel);
	}

	//	フォント設定のメソッド
	public static JLabel setFont(Color clr, JLabel label, int strSize) {
		label.setForeground(clr);
		Font labelFont = new Font("MS　ゴシック", Font.PLAIN, strSize);
		label.setFont(labelFont);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		return (label);
	}

}
