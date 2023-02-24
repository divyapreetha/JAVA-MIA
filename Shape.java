import java.lang.*;
class Rectangle {
	float length;
	float breadth;
	public float findArea(float a, float b) {
		length = a;
		breadth = b;
		float area = length * breadth;
		return area;
	}
}
class Shape {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		float myArea = rect.findArea(12,15.8f);
		System.out.println("Area of your Rectangle is " + myArea);
	}
}
