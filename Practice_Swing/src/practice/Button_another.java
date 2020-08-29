package practice;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class Button_another extends JFrame {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Button_another();
	}

	public Button_another() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(350, 250);

		initJToggleButton();

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

}
