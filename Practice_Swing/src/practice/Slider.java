package practice;

import java.awt.FlowLayout;
import java.util.Dictionary;
import java.util.Hashtable;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
		//引数はマイナスでも可
		JSlider slider1 = new JSlider();
		add(slider1);

		//スライダーにメモリ表示させる
		//paintTicksでメモリ表示の準備
		slider1.setPaintTicks(true);
		//大メモリと小メモリを設定
		slider1.setMinorTickSpacing(10);
		slider1.setMajorTickSpacing(20);

		//スライダーの値を表示する、値が変更されたときに値を出力
		JLabel label = new JLabel(String.valueOf(slider1.getValue()));
		add(label);

		slider1.addChangeListener(event -> {
			label.setText(String.valueOf(slider1.getValue()));
		});

		JSlider slider2 = new JSlider(0, 10, 2);
		add(slider2);
		slider2.setPaintTicks(true);
		slider2.setMinorTickSpacing(1);
		slider2.setMajorTickSpacing(2);
		//ラベルの表示 ラベルの初期値は大メモリに合わせて表示
		slider2.setPaintLabels(true);

		JSlider slider3 = new JSlider();
		add(slider3);
		slider3.setPaintTicks(true);
		slider3.setMinorTickSpacing(10);
		slider3.setMajorTickSpacing(20);

		//0,50,100に対して任意のラベルを設定 setLabelTable(Dictionary labels)メソッド
		//Dictionaryクラスは抽象メソッドを含むため実際にはそのサブクラスであるHashtableを使う
		Dictionary<Integer, JComponent> dictionary = new Hashtable<>();
		dictionary.put(new Integer(0), new JLabel("min"));
		dictionary.put(new Integer(50), new JLabel("middle"));
		dictionary.put(new Integer(100), new JLabel("max"));

		//JLabel(Icon image)を使用するとラベルに画像が付けられる

		slider3.setPaintLabels(true);
		slider3.setLabelTable(dictionary);

	}
}
