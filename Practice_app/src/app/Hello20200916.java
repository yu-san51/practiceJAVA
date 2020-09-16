package app;

import java.util.Random;

import javax.swing.JFrame;

//import org.jfree.chart.ChartFactory;
//import org.jfree.chart.ChartPanel;
//import org.jfree.chart.JFreeChart;
//import org.jfree.chart.StandardChartTheme;
//import org.jfree.chart.plot.PlotOrientation;
//import org.jfree.data.category.DefaultCategoryDataset;

public class Hello20200916 {

	//JAVAのライブラリJFreeChartを使用してグラフ描写
	//JFreeChaetをインストールしていないので、エラーが出るところはコメントアウト

	//項目ラベル
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

		//グラフ生成

		//日本語文字化け対策
		//ChartFactory.setChartTheme(StandardChartTheme.createLegacyTheme());
		//新規インスタンスを格納
		//DefaultCategoryDataset data = new DefaultCategoryDataset();
		for (int i = 0; i < labels.length; i++) {
			//setValue	データを追加
			//data.setValue(counts[i], "", labels[i]);
		}

		//createBarChart 格納された棒グラフが生成される
		//引数は(
		//		java.lang.String title グラフタイトルnullは表示なし
		//		java.lang.String categoryAxisLabel X軸のラベルnullは表示なし
		//		java.lang.String valueAxisLabel Y軸ラベル
		//		CategoryDataset dataset インスタンスの指定 nullでもOK
		//		PlotOrientation orientation 横のグラフであることを指定（縦グラフはPlotOrientation.VERTICAL）
		//		boolean legend trueにするとグラフの下に系列が表示される
		//		boolean tooltips trueにするとグラフにマウスカーソルを重ねるとツールチップが表示される
		//		boolean urls
		//		);
		//JFreeChart chart = ChartFactory.createBarChart(
		//				"",
		//				"",
		//				"",
		//				data,
		//				PlotOrientation.HORIZONTAL,
		//				false,
		//				false,
		//				false);
		//生成したインスタンスにコンストラクタの内容を格納
		//ChartPanel cpanel = new ChartPanel(chart);

		//フレーム表示
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setTitle("点数グラフ表示");
		//frame.add(cpanel, BorderLayout.CENTER);
		frame.setVisible(true);

	}

}
