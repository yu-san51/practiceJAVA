package practice;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class Button_another extends JFrame {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Button_another();
	}

	public Button_another() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(350, 250);

		//initJToggleButton();
		//initJCheckBox();
		initJRadioButton();
		setVisible(true);
	}

	private void initJToggleButton() {
		//オンオフのスイッチのような使い方ができる
		//JToggleButton#isSelectedでボタンが押しているかどうかを取得
		setLayout(new FlowLayout());

		JToggleButton toggleButton = new JToggleButton("test togglebutton");
		add(toggleButton);

		JButton button = new JButton("JButton");
		add(button);
		button.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println(toggleButton.isSelected());
			}
		});
	}

	private void initJCheckBox() {
		//チェックボックス
		setLayout(new FlowLayout());

		JCheckBox checkBox1 = new JCheckBox("JCheckBox1");
		add(checkBox1);

		JCheckBox checkBox2 = new JCheckBox("JCheckBox2");
		add(checkBox2);

		JButton button = new JButton("JButton");
		add(button);
		//ぼったんを押すとチェックが入っているか否かを判定して返す
		button.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("chewckBox1 is Selected : " + checkBox1.isSelected());
				System.out.println("chewckBox2 is Selected : " + checkBox2.isSelected());
			}
		});
	}

	private void initJRadioButton() {
		//複数のボタンを排他的なラジオボタンのグループとして扱うためにButtonGroupを使う
		//洗濯されているボタンはButtonModel#getSelectionメソッドで取得
		//ボタンのアクションコマンド文字列を取得するときはButtonModel#getActionCommond
		setLayout(new FlowLayout());

		JRadioButton radioButton1 = new JRadioButton("JRadioButton1");
		radioButton1.setActionCommand("R1");
		add(radioButton1);

		JRadioButton radioButton2 = new JRadioButton("JRadioButton2");
		radioButton2.setActionCommand("R2");
		add(radioButton2);

		ButtonGroup buttonGroup = new ButtonGroup();
		//グループに入れると、一度どれか押したら未選択の状態に戻ることができない
		//グループに入れない場合はもう一度押すと解除できるが複数選択できてしまう
		buttonGroup.add(radioButton1);
		buttonGroup.add(radioButton2);

		JButton button = new JButton("JButton");
		add(button);
		button.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ButtonModel buttonModel = buttonGroup.getSelection();
				System.out.println(buttonModel == null ? "未選択" : buttonModel.getActionCommand());
			}
		});
	}

}
