public class Square extends Rectangle{
	private String name;
	
	public Square(double side) {  //Since Square is basically a rectangle with same sides, we can just extend the Rectangle class to use it for square too
		super(side, side);
		this.name = "Square";
	}
}
