import java.util.Scanner;

public class multiplicationFunc {
	Scanner sc = new Scanner(System.in);
	
	public void mul() {
		System.out.println("Enter Operand 'A':");
		double a = sc.nextDouble();
		System.out.println("Enter Operand 'B':");
		double b = sc.nextDouble();
		System.out.println("Result: A*B = "+ (int)(a*b));
		System.out.println();
	}
}