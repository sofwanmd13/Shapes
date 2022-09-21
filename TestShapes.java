import java.util.*;
public class TestShapes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		String shape;
		
		do {
			System.out.println("Select the type of shape to add, or Q to quit: ");  //Asking user for input on which type of shape is being entered, or if they want to quit
			shape = input.next();
			
			if (shape.equals("rectangle")||shape.equals("Rectangle")) {  //When Rectangle shape type is entered
				System.out.println("Enter Length: ");   //Prompting to enter variables for shape
				double length = input.nextDouble();
				
				System.out.println("Enter Width: ");
				double width = input.nextDouble();
				
				shapes.add(new Rectangle(length, width));   //Creating new shape of type Rectangle and adding it to ArrayList
			}
			
			else if (shape.equals("square")||shape.equals("Square")) {  //When Square shape type is entered
				System.out.println("Enter Length of side: ");   //Prompting to enter variables for shape
				double length = input.nextDouble();
				
				shapes.add(new Square(length));   //Creating new shape of type Square and adding it to ArrayList
			}
			
			else if (shape.equals("circle")||shape.equals("Circle")) {  //When Circle shape type is entered
				System.out.println("Enter Radius: ");   //Prompting to enter variables for shape
				double radius = input.nextDouble();
				
				shapes.add(new Circle(radius));   //Creating new shape of type Circle and adding it to ArrayList
			}
			
			else if (shape.equals("triangle")||shape.equals("Triangle")) {  //When Triangle shape type is entered
				System.out.println("Enter side1: ");   //Prompting to enter variables for shape
				double side1 = input.nextDouble();

				System.out.println("Enter side2: ");
				double side2 = input.nextDouble();
				
				System.out.println("Enter side3: ");
				double side3 = input.nextDouble();
				
				shapes.add(new Triangle(side1, side2, side3));   //Creating new shape of type Triangle and adding it to ArrayList
			}
			
			else if (!(shape.equals("Q")||shape.equals("q"))) {  //When no proper shape type, or Q/q is entered
				System.out.println("Wrong Shape, please try again");
			}
				
		}while (!(shape.equals("Q")||shape.equals("q")));  //Loop condition to run till Q/q is entered to quit
		
		System.out.println("Calculating Areas and Perimeters for your shapes ...\n");  //Calculating areas for all shapes in ArrayList and displaying them
		for(int i=0;i<shapes.size();i++) {
			System.out.printf("Area of Shape " + (i+1) + ": %.2f\n", shapes.get(i).calculateArea());
			System.out.printf("Perimeter of Shape " + (i+1) + ": %.2f\n\n", shapes.get(i).calculatePerimeter());
		}
		input.close();
		
	}

}
