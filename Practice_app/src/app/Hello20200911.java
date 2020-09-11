package app;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Hello20200911 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//swingのフレーム表示

		//変数に生成したインスタンスを格納
		JFrame frame = new JFrame();
		//×ボタンでクローズ
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//表示タイトル
		frame.setTitle("点数分布");
		//コンポーネントの大きさ
		frame.setSize(450, 300);
		//大きさ変更不可
		frame.setResizable(false);
		//グラフとラベルの配置
		//GridLayout グラフ部分とラベル部分を格子状に配置（コンポーネントの大きさから自動調整）
		frame.setLayout(new GridLayout(11, 3, 10, 10));
		for (int i = 0; i < 11; i++) {
			frame.add(new JLabel("ラベル" + i));
			frame.add(new JLabel("****"));
		}
		//画面中央に表示するように設定
		frame.setLocationRelativeTo(null);
		//表示
		frame.setVisible(true);
	}

}
