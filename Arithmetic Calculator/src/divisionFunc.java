import java.util.Scanner;
import java.io.*;

public class divisionFunc {
	Scanner sc = new Scanner(System.in);
	
	public void div() {
		System.out.println("Enter Operand 'A':");
		int a = sc.nextInt();
		System.out.println("Enter Operand 'B':");
		int b = sc.nextInt();
	
		try {
		
			System.out.println("Result: A/B = "+(a/b));
			System.out.println();
		
		} catch (Exception e) {
		
			System.out.println("Division By Zero is not possible.!\n");
		}
	}
}