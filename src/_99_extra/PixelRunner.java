package _99_extra;

public class PixelRunner {
	public static void main(String[] args) {
		PixelParty pp = new PixelParty();
		pp.setColor(87, 34, 175);
		pp.drawCircle(50, 400, 30);
		pp.drawRectangle(200, 250, 100, 234);
		pp.drawTriangle(34, 87, 39, 44, 400, 100);
		pp.saveImage();
		pp.displayImage();
	}
}
