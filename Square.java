
public class Square extends Rectangle{
	
	public Square(double side) {  //Since Square is basically a rectangle with same sides, we can just extend the Rectangle class to use it for square too
		super(side, side);
	}
}
