package practice;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.Caret;

public class JTextField_JTextArea extends JFrame {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new JTextField_JTextArea();
	}

	public JTextField_JTextArea() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(350, 250);

		//init();
		//init01();
		//init02();
		init03();

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

		//エンターキーを押すとコンソールに出力
		//未入力の場合は空の文字列を返す
		textField.addActionListener(event -> {
			System.out.println(textField.getText());
		});
		//特定の選択された部分だけを選択したい場合はgetSelectedText()を使用

	}

	private void init01() {
		setLayout(new FlowLayout());

		JTextField textField = new JTextField(25);
		add(textField);

		//キャレット（文字入力の時のカーソル）
		//int getDot キャレットの現在地
		//int getMark マークの現在位置
		textField.addActionListener(event -> {
			Caret caret = textField.getCaret();
			System.out.println(caret.getDot());
			System.out.println(caret.getMark());

		});
	}

	private void init02() {
		setLayout(new FlowLayout());

		JTextField textField = new JTextField(25);
		add(textField);

		//選択領域の背景色と文字色を決める
		textField.setSelectionColor(new Color(255, 0, 0));
		textField.setSelectedTextColor(new Color(255, 255, 255));
	}

	private void init03() {
		setLayout(new FlowLayout());

		//テキストエリアの設置
		//JTextArea(int rows, int columns)
		//エンターで改行
		JTextArea textArea = new JTextArea(10, 20);
		add(textArea);
	}
}
