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
		setSize(400, 450);
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

		//閉じた多角形を塗りつぶす fillPolyline(int[] xPoints, int[] yPoints, int nPoints)
		int[] xPoints3 = { 280, 320, 360 };
		int[] yPoints3 = { 150, 50, 150 };
		graphics.drawString("fillPolyline", 280, 30);
		graphics.fillPolygon(xPoints3, yPoints3, xPoints3.length);

		//図形輪郭の描画

		//一点を指定してそこから四角を作る drawRect(intx, int y, int width, int height)
		graphics.drawString("drawRecgt", 10, 190);
		graphics.drawRect(20, 210, 40, 100);

		//drawRectにそれぞれの直径を加えて両端に丸みを帯びる drawRoundRect(int x, int y, iny width, int height, int arcWidth, int arcHeight)
		graphics.drawString("drawRoundRect", 80, 190);
		graphics.drawRoundRect(110, 210, 40, 100, 40, 20);

		//楕円形の図形が描写される drawOval(int x, int y, int width, int height)
		graphics.drawString("drawOval", 180, 190);
		graphics.drawOval(190, 210, 40, 100);

		//弧を描画 drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)
		graphics.drawString("drawAct", 250, 190);
		graphics.drawArc(250, 210, 40, 100, 30, 250);

		//fillRect, fillRoundRect, fillOval, fillArcでそれぞれ塗りつぶすこともできる
		//drawImage(Image img, int x, int y, ImageOvserver observer)で画像の貼り付けもできる
	}

}
