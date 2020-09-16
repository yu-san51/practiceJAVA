package app;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Hello20200915 {

	//出力用のラベル
	private static final String[] labels = {
			" 0～ 9点",
			"10～19点",
			"20～29点",
			"30～39点",
			"40～49点",
			"50～59点",
			"60～69点",
			"70～79点",
			"80～89点",
			"90～99点",
			"   100点",
	};

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//点数をランダムで格納
		int[] points = new int[1000];
		Random random = new Random();
		for (int i = 0; i < points.length; i++) {
			points[i] = random.nextInt(101);
		}

		//集計
		int[] counts = new int[11];
		for (int point : points) {
			counts[point / 10]++;
		}

		//最高人数の取得
		int maxCount = 0;
		for (int count : counts) {
			if (maxCount < count) {
				maxCount = count;
			}
		}

		//ラベル作成
		JLabel[] jLabels = new JLabel[labels.length];
		for (int i = 0; i < labels.length; i++) {
			jLabels[i] = new JLabel(String.format("%s: %4d人: ", labels[i], counts[i]));
			jLabels[i].setHorizontalAlignment(JLabel.RIGHT);
		}

		//グラフ用コンポーネント作成
		JComponent[] jComponents = new JComponent[labels.length];
		final int maxCountFinal = maxCount;
		for (int i = 0; i < labels.length; i++) {
			final double count = counts[i];
			jComponents[i] = new JComponent() {
				@Override
				public void paint(Graphics g) {
					super.paintComponents(g);
					g.setColor(Color.ORANGE);
					//点数ごとの人数の最大値を取得し 人数x最大値/横幅でグラフに対する割合を出力
					g.fillRect(0, 0, (int) (count / maxCountFinal * getWidth()), getHeight());
				}
			};
		}

		//フレームに配置して表示
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("点数分布図");
		frame.setSize(450, 300);
		frame.setResizable(false);
		frame.setLayout(new GridLayout(labels.length, 3, 10, 10));
		for (int i = 0; i < labels.length; i++) {
			frame.add(jLabels[i]);
			frame.add(jComponents[i]);
			frame.add(new JLabel(""));
		}
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
