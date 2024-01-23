package in.co.rays.oop;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Shape s=new Shape();
//		s.setRadius(5);
//		s.setColor("red");
//		System.out.println(s.getRadius());
//		System.out.println(s.getColor());
		
		Rectangle r =new Rectangle();
		r.setBreadth(20);
		r.setLength(30);
		r.area();
		
		Circle c=new Circle();
		c.setRadius(5);
		c.area();

		
	}

}
