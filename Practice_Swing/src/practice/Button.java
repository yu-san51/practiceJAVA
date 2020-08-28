package practice;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Button extends JFrame {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Button();
	}

	public Button() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(350, 250);

		//init();
		//init01();
		init02();

		setVisible(true);

	}

	private void init() {
		//テキスト付きのボタンJButton(String text)
		//BorderLayoutだｔｐ最初に配置したボタンが全体に広がってしまうのでFlowを使用
		setLayout(new FlowLayout());

		JButton button1 = new JButton("test1");
		add(button1);

		JButton button2 = new JButton("test2");
		add(button2);

		//設置したボタンの活性非活性
		button1.setEnabled(true);
		button2.setEnabled(false);

		//ボタンを押したときの動作の設定
		button1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				//オーバーライドで非活性のボタン2をクリックで活性化
				button2.setEnabled(true);
			}
		});
	}

	private void init01() {
		setLayout(new FlowLayout());

		Icon icon = new ImageIcon("icon/77835836.png");

		JButton button1 = new JButton(icon);
		add(button1);

		JButton button2 = new JButton(icon);
		add(button2);

		button1.setEnabled(true);
		button2.setEnabled(false);
	}

	private void init02() {
		setLayout(new FlowLayout());

		Icon icon = new ImageIcon("icon/77835836.png");

		JButton button1 = new JButton("test1", icon);
		add(button1);

		JButton button2 = new JButton("test2", icon);
		add(button2);

		button1.setEnabled(true);
		button2.setEnabled(false);

		//		文字列とアイコンの位置は以下で調節
		//		public void setVerticalTextPosition(int textPosition)
		//		public void setHorizonatalTextPosition(int textPosition)
	}

}
