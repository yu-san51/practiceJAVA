package practice;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class JTextField_JTextArea extends JFrame {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new JTextField_JTextArea();
	}

	public JTextField_JTextArea() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(350, 250);

		init();

		setVisible(true);
	}

	private void init() {
		//テキストを入力してもらうためのコンポーネント
		//設置する
		setLayout(new FlowLayout());
		
		//JTextField(String text, int columns)で入力欄の文字と整数を指定
		//引数がないと幅のない入力欄になってしまう
		JTextField textField = new JTextField("fill with me", 25);
		add(textField);
		
	}
}
