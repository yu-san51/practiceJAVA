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

		//init();
		//init01();
		//init02();
		//init03();
		init04();

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

	private void init02() {
		//JOptionPane#showConfirmDialogの返り値がint型であり押されたボタンの判別ができる
		setLayout(new FlowLayout());

		JButton button = new JButton("表示");
		add(button);
		button.addActionListener(event -> {
			int result = JOptionPane.showConfirmDialog(null, "テストメッセージ");
			if (result == JOptionPane.YES_OPTION) {
				System.out.println("Yes!!");
			} else if (result == JOptionPane.NO_OPTION) {
				System.out.println("No...");
			} else if (result == JOptionPane.CANCEL_OPTION) {
				System.out.println("Cancel!?!?");
			} else if (result == JOptionPane.CLOSED_OPTION) {
				System.out.println("Closed (;_;) ");
			}
		});
	}

	private void init03() {
		//JOptionPane#showInputDialogはユーザーの入力値を返す
		//OKボタンのときは空文字が返却され、取り消しはnullが返る
		setLayout(new FlowLayout());

		JButton button = new JButton("表示");
		add(button);
		button.addActionListener(event -> {
			String result = JOptionPane.showInputDialog(null, "テストメッセージ");
			System.out.println(result);
		});
	}

	private void init04() {
		setLayout(new FlowLayout());

		JButton button = new JButton("表示");
		add(button);
		button.addActionListener(event -> {
			JOptionPane.showMessageDialog(null, "テストメッセージ");
		});
	}
}
