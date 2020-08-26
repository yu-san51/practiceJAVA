package practice;

import javax.swing.JFrame;

public class Labeling extends JFrame {
	//ラベルを配置するプログラムで、短いテキスト文字列やイメージ表示領域を扱う
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Labeling();
	}

	public Labeling() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(350, 250);

		//setVisibleの前に呼び出さないと描画処理がうまくいかない
		init();

		setVisible(true);
	}

	private void init() {

		//設置処理
	}

}
