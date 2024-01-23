package in.co.rays.oop;

public class Circle extends Shape {
	private double PI =3.14;
	private int radius;
	public  void setRadius(int radius) {
		this.radius=radius;
	}
	
	public int getRadius() {
		return radius;
		
	}
	
	public void area() {
		Double carea=getRadius()*getRadius()*PI;
		System.out.println(carea);
	}

}
