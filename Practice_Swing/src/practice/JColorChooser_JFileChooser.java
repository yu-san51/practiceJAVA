package practice;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class JColorChooser_JFileChooser extends JFrame {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new JColorChooser_JFileChooser();
	}

	public JColorChooser_JFileChooser() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700, 400);

		//init();
		//init01();
		init02();

		setVisible(true);
	}

	private void init() {
		setLayout(new FlowLayout());
		//userに色を選んでもらうときに使用
		JColorChooser colorChooser = new JColorChooser();
		add(colorChooser);
	}

	private void init01() {
		setLayout(new FlowLayout());

		//ボタンを押したら色選択のパネルを出す
		//色を選択したら出力

		JButton button = new JButton("ボタン");
		add(button);

		button.addActionListener(event -> {
			//Color カラーチューザーが表示されるときの初期色セット
			//showDialog(this, タイトル表示, ダイアログが表示されたときの色を指定(nullの場合は白色))
			Color color = JColorChooser.showDialog(this, "色選択", new Color(20, 30, 40));
			System.out.println(color);
		});
	}

	private void init02() {
		setLayout(new FlowLayout());

		JButton button = new JButton("ボタン");
		add(button);

		//userに自分のパソコンからファイルを選んでもらう
		//JFileChooser.CANCEL_OPTION – 取り消し
		//JFileChooser.APPROVE_OPTION – ファイルが選択された
		//getSelectedFileで取得したファイルのパスを表示
		button.addActionListener(event -> {
			JFileChooser fileChooser = new JFileChooser();
			int value = fileChooser.showOpenDialog(this);
			if (value == JFileChooser.APPROVE_OPTION) {
				System.out.println(fileChooser.getSelectedFile());
			}

		});
	}
}
