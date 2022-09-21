public class Triangle extends Shape {
	private double base;
	private double side1;
	private double side2;
	
	public Triangle(double base, double side1, double side2) {  //Constructor for Triangle
		this.base = base;
		this.side1 = side1;
		this.side2 = side2;
	}

	public double calculateArea() {  //Abstract Area method from Shape Class
		double x = (side1+side2+base)/2;
		return Math.pow((x(x-a)(x-b)(x-c)), 0.5);
	}
	
	public double calculateCircumference() {  //Only works with Right-angled triangles
		double hyp = Math.pow((height*height)+(base*base),0.5);
		return height+base+hyp;
	}
	
	public double getHeight() {  //getter method for height
		return this.height;
	}
	
	public double getBase() {  //getter method for base
		return this.base;
	}
	
	public void setHeight(double height) {  //setter method for height
		this.height = height;
	}
	
	public void setBase(double base) {  //setter method for base
		this.base = base;
	}
	
	

}


