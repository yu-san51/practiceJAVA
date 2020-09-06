package practice;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class JPanel_JTabbed extends JFrame {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new JPanel_JTabbed();
	}

	public JPanel_JTabbed() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(350, 250);

		init();

		setVisible(true);
	}

	private void init() {
		setLayout(new FlowLayout());

		//JPanelを3つ設置してJFrameに追加（透明で見えないためsetBorderで境界線）
		JPanel panel1 = new JPanel();
		panel1.setBorder(new LineBorder(Color.RED));
		//addメソッドの使用
		//JFrameのレイアウトマネージャの初期設定は中央寄せ
		//2行目の配置を変える場合は
		//panel1.setLayout(new FLowLayout(FlowLayout.LEFT));
		panel1.add(new JButton("ボタン1-1"));
		panel1.add(new JButton("ボタン1-2"));
		add(panel1);

		JPanel panel2 = new JPanel();
		panel2.setBorder(new LineBorder(Color.BLUE));
		panel2.add(new JButton("ボタン2-1"));
		panel2.add(new JButton("ボタン2-2"));
		panel2.add(new JButton("ボタン2-3"));
		add(panel2);

		JPanel panel3 = new JPanel();
		panel3.setBorder(new LineBorder(Color.YELLOW));
		panel3.add(new JButton("ボタン3-1"));
		add(panel3);
	}
}
