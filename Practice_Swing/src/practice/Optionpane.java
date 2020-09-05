package practice;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Optionpane extends JFrame {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Optionpane();
	}

	public Optionpane() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(350, 250);

		init();
		//init01();

		setVisible(true);
	}

	private void init() {
		setLayout(new FlowLayout());

		//情報を表示するためのクラス 引数はオブジェクト
		JOptionPane optionPane = new JOptionPane();
		//メッセージ内容の設定
		optionPane.setMessage("test");
		//メッセージのスタイル設定（引数はint型でstaticフィールドを指定）
		//ERROR_MESSAGE, INFORMATION_MESSAGE, WARNING_MESSAGE, QUESTION_MESSAGE, PLAIN_MESSAGE
		optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
		//表示するボタン
		//DEFAULT_OPTION, YES_NO_OPTION, YES_NO_CANCEL_OPTION,OK_CANCEL_OPTION
		optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);

		//ダイアログの表示 引数は親フレームとタイトルバー
		JDialog dialog = optionPane.createDialog(null, "テストダイアログ");

		JButton button = new JButton("表示");
		add(button);
		button.addActionListener(event -> {
			dialog.setVisible(true);
			//設置したボタンの取得
			if (optionPane.getValue().equals(JOptionPane.YES_OPTION)) {
				System.out.println("YES!");
			} else if (optionPane.getValue().equals(JOptionPane.CANCEL_OPTION)) {
				System.out.println("Cansel...");
			}
		});
	}

	private void init01() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("パネルテスト"));
		panel.add(new JTextField(20));
		//引数をオブジェクトに
		JOptionPane optionPane = new JOptionPane(panel);
		JDialog dialog = optionPane.createDialog(null, "テストダイアログ");

		JButton button = new JButton("表示");
		add(button);
		button.addActionListener(event -> {
			dialog.setVisible(true);
		});
	}

}
