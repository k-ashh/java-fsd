import java.util.Scanner;

public class subtractionFunc {
	
	Scanner sc = new Scanner(System.in);
		
	public void sub() {
		System.out.println("Enter Operand 'A':");
		double a = sc.nextDouble();
		System.out.println("Enter Operand 'B':");
		double b = sc.nextDouble();
		System.out.println("Result: A-B = "+ (int)(a-b));
		System.out.println();
		
	}

}

