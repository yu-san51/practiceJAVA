package practice;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Slider extends JFrame {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Slider();
	}

	public Slider() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(350, 250);

		init();

		setVisible(true);
	}

	private void init() {
		//JSpinner JSliderはユーザに連続した値から選択してもらうときに使用
		//つまみをスライドすることで値を選択
		setLayout(new FlowLayout());

		//SpinnerNumberModel(int value, int minimum, int maximum, int stepSize)
		//初期値、最小、最大、進むレベル

		//引数を入れない場合は初期値は0、最小最大は無制限
		//ただしsetLayoutにすると桁数が1桁になるBorderLayoutなら自動的に横幅を広げる
		JSpinner spinner1 = new JSpinner();
		add(spinner1);

		JSpinner spinner2 = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
		add(spinner2);

		JSpinner spinner3 = new JSpinner(new SpinnerNumberModel(0, -10000, 10, 1));
		add(spinner3);
	}
}
