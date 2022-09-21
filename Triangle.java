public class Triangle extends Shape {
	private double height;
	private double base;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double calculateArea() { //Abstract methods from Shape Class
		return 0.5*height*base;
	}
	
	public double calculateCircumference() { //Only works with Right-angled triangles
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


