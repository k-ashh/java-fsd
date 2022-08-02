import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		
		AdditionFunc a = new AdditionFunc();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("--------Welcome to basic Arithematic Calculator--------");
			System.out.println("MENU:");
			System.out.println("1. Add    2. Subtract    3. Multipli    4. Divide    5. Exit");
			System.out.println("Please Enter one of the above choice");
			int ch = sc.nextInt();
			switch(ch) {
				case 1:
					a.add();
					break;
				
				case 2:
					
					break;
				
				case 3:
					break;
				
				case 4: 
					break;
					
				case 5:
					break;
					
				default:
					System.out.println("Please Enter A Valid Choice !!!");
						
					
			}
			
		}		

	}

}
