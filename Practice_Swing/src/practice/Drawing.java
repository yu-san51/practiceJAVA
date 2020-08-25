package practice;

import java.awt.Graphics;

import javax.swing.JFrame;

public class Drawing extends JFrame {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Drawing();
	}

	public Drawing() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(350, 250);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		//JFrameのなかにgetContentPaneメソッドがありオブジェクトを所得できる
		//そのオブジェクトにgetGraphicsがありそのオブジェクトが描画を可能としている
		Graphics graphics = getContentPane().getGraphics();

		//描画処理 graphics.～の形式で記述できる
		//座標は左上が原点で(0, 0) x軸は左から右へ　Y軸は上から下へ

		//文字列の描画 graphics.drawString(String str, int x, int y)
		graphics.drawString("Hello.", 10, 10);

		//直線の描画
		//2点を結ぶ線分を描画 drawLine(int x1, int y1, int x2, int y2)
		graphics.drawString("drawLine", 10, 30);
		graphics.drawLine(10, 150, 30, 50);

		//引数に指定した座標線分描画 drawPolyline(int[] xPoints, int[] yPoints, int nPoints)
		int[] xPoints1 = { 80, 120, 160 };
		int[] yPoints1 = { 150, 50, 150 };
		graphics.drawString("drawPolyline", 80, 30);
		graphics.drawPolyline(xPoints1, yPoints1, xPoints1.length);

		//dorawPolylineに加えて最初の点と最後の点を結ぶ直線も描画される drawPolygon(int[] xPoints, int[] yPoints, int nPoints)
		int[] xPoints2 = { 180, 220, 260 };
		int[] yPoints2 = { 150, 50, 150 };
		graphics.drawString("drawPolygon", 180, 30);
		graphics.drawPolygon(xPoints2, yPoints2, xPoints2.length);
	}

}
