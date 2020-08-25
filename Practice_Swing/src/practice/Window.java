package practice;

import javax.swing.JFrame;

public class Window extends JFrame {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Window();
	}

	public Window() {
		//ウィンドウを閉じるボタンを押すとアプリケーションを終了できる
		//これがないとｘを押してもウィンドウを隠すだけでプログラムは動いたまま。
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//サイズメソッド（横幅pxｘ縦幅px）
		setSize(250, 150);

		//タイトルバーのタイトル設定
		setTitle("タイトル");

		//サイズ変更不可にするboolean型
		setResizable(false);

		//画面中央にウィンドウを表示させる（デフォルトは左上）
		//引数はComoinent型でnullにすると画面中央に配置される
		setLocationRelativeTo(null);

		//boolean型で上記のウィンドウを見せるか見せないか
		setVisible(true);
	}

}
