package in.co.rays.oop;

public class Rectangle  extends Shape{
	private int length;
	private int breadth;
	
	public  void setLength(int length) {
		this.length=length;
	}
	public  void setBreadth(int breadth) {
		this.breadth=breadth;
	}
	public int getLength() {
		return length;
		
	}
	public int getBreadth() {
		return breadth;
		
	}
	public void area() {
		int rarea=getLength()*getBreadth();
		System.out.println(rarea);
	}
	

}
