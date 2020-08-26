package practice;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

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

		//ラベル同士の隙間の間隔の調整　メソッドの先頭に書く
		//BorderLayoutの引数を()にすると間隔はゼロになる
		setLayout(new BorderLayout(0, 0));

		//設置処理

		//BorderLayout
		//コンポーネントを5つの領域に収まるように大きさを自動調整して配置くれる
		//center east north south west
		//実際にはadd(Component comp, Object constraints)メソッドで2つ目の引数に配置先の位置を指定する
		//指定しない場合は自動でセンターとなる

		Border border = new LineBorder(Color.RED);

		JLabel label1 = new JLabel("ラベル1");
		label1.setBorder(border);
		add(label1);

		JLabel label2 = new JLabel("ラベル2");
		label2.setBorder(border);
		add(label2, BorderLayout.NORTH);

		JLabel label3 = new JLabel("ラベル3");
		label3.setBorder(border);
		add(label3, BorderLayout.SOUTH);

		JLabel label4 = new JLabel("ラベル4");
		label4.setBorder(border);
		add(label4, BorderLayout.EAST);

		JLabel label5 = new JLabel("ラベル5");
		label5.setBorder(border);
		add(label5, BorderLayout.WEST);

	}

}
