import java.util.*;
public class TestShapes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		String shape;
		
		do {
			System.out.println("Select the type of shape to add, or Q to quit: ");
			shape = input.next();
			
			if (shape.equals("rectangle")||shape.equals("Rectangle")) {
				System.out.println("Enter Length: ");
				double length = input.nextDouble();
				
				System.out.println("Enter Width: ");
				double width = input.nextDouble();
				
				shapes.add(new Rectangle(length, width));
			}
			
			else if (shape.equals("square")||shape.equals("Square")) {
				System.out.println("Enter Length of side: ");
				double length = input.nextDouble();
				
				shapes.add(new Square(length));
			}
			
			else if (shape.equals("circle")||shape.equals("Circle")) {
				System.out.println("Enter Radius: ");
				double radius = input.nextDouble();
				
				shapes.add(new Circle(radius));
			}
			
			else if (shape.equals("triangle")||shape.equals("Triangle")) {
				System.out.println("Enter height: ");
				double height = input.nextDouble();

				System.out.println("Enter base: ");
				double width = input.nextDouble();
				
				shapes.add(new Triangle(height, width));
			}
			
			else if (!shape.equals("Q")) {
				System.out.println("Wrong Shape, please try again");
			}
				
		}while (!shape.equals("Q"));
		
		System.out.println("Computing areas for your shapes ...");
		for(int i=0;i<shapes.size();i++) {
			System.out.println("Area of Shape " + (i) + ": " + shapes.get(i).calculateArea());
		}
		input.close();
		
	}

}
