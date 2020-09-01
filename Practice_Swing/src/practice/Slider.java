package practice;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;
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

		//init();
		initSlider();

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

		//現在の値を出力
		spinner2.addChangeListener(event -> {
			System.out.println("現在の値：" + spinner2.getValue());
		});
	}

	private void initSlider() {
		setLayout(new FlowLayout());
		//引数を入れないときは範囲が0~100, 初期値が50の水平スライダが作成される
		JSlider slider1 = new JSlider();
		add(slider1);

		JSlider slider2 = new JSlider(0, 10, 2);
		add(slider2);

		JSlider slider3 = new JSlider(-1000, 0, -100);
		add(slider3);

	}
}
