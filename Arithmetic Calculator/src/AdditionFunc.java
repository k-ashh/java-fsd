import java.util.Scanner;

public class AdditionFunc {
	
	Scanner sc = new Scanner(System.in);
	
	public void add() {
		System.out.println("Enter Operand 'A':");
		double a = sc.nextDouble();
		System.out.println("Enter Operand 'B':");
		double b = sc.nextDouble();
		System.out.println("Result: A+B="+(a+b));
	
	}

}
