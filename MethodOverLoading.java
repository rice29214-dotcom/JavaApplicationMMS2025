import java.util.Scanner;

public class MethodOverLoading{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("1. Calculate Area of a Square");
		System.out.println("2. Calculate Area of a Rectangle");
		System.out.println("3. Calculate Area of a Triangle");
		
		System.out.print("Enter your choice ");
		int choice = input.nextInt();
		
		switch(choice){
			case 1:
			    System.out.print("Enter the lenght of the square ");
				int squareLenght = input.nextInt();
				MethodOverLoading.area(squareLenght );
			break;
			
			case 2:
				System.out.print("Enter the lenght of the rectangle ");
				int rectangleLenght = input.nextInt();
				
				System.out.print("Enter the breadth of the rectangle ");
				int breadthLenght = input.nextInt();
				
				MethodOverLoading.area(rectangleLenght, breadthLenght );
			break;

			
			case 3:
				System.out.print("Enter the lenght of the triangle ");
				int triangleLenght = input.nextInt();
				
				System.out.print("Enter the base of the rectangle ");
				double base = input.nextInt();
				
				MethodOverLoading.area(triangleLenght, base);
			break;
			
			default:
				System.out.print("Invalid input");
		}	
	
			
	
	}
	public static void area(int lenght){
		int areaOfSquare = (int)Math.pow(lenght,2);
		System.out.printf("The area of the square is %d",areaOfSquare);
	}
	
 	public static void area(int lenght,int breadth){
		int areaOfReactangle = lenght * breadth;
		System.out.printf("The area of the rectangle is %d",areaOfReactangle);
	}
	public static void area(int lenght,double base){
		double areaOfTriangle = 0.5 * lenght * base;
		System.out.printf("The area of the triangle is %.2f",areaOfTriangle);
		
	}
}
	
	