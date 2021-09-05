package ch09;


class Circle {
	int circleX, circleY, halfLength;
	
	public Circle(int x, int y, int half) {
		circleX = x; circleY = y; halfLength = half;
	}
	
	public void showCircleInfo() {
		System.out.println("circle x y: " + "[" + circleX + ", " + circleY + "]");
		System.out.println("circle radius: " + halfLength);
	}
}

//class Point {
//	int xPos, yPos;
//	public Point(int x, int y) {
//		xPos = x; yPos = y;
//	}
//	
//	public void showPointInfo() {
//		System.out.println("[" + xPos + ", " + yPos + "]");
//	}
//}

public class Q09_1 {

	public static void main(String[] args) {

		Circle c = new Circle(2, 2, 4);
		c.showCircleInfo();
		
	}

}
