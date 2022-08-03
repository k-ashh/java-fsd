import java.util.Scanner;

public class calculatorMain {

	public static void main(String[] args) {
		
		additionFunc a = new additionFunc();
		subtractionFunc s = new subtractionFunc();
		multiplicationFunc m = new multiplicationFunc();
		divisionFunc d = new divisionFunc();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("--------Welcome to basic Arithematic Calculator--------");
			System.out.println();
			System.out.println("MENU:");
			System.out.println("1. Add    2. Subtract    3. Multiply    4. Divide    5. Exit");
			System.out.println("Please Enter one of the above choice");
			int ch = sc.nextInt();
			System.out.println();
			switch(ch) {
				case 1:
					a.add();
					break;
				
				case 2:
					s.sub();
					break;
				
				case 3:
					m.mul();
					break;
				
				case 4: 
					d.div();
					break;
					
				case 5:
					System.out.println("Exiting Calculator...");
					System.exit(0);
					break;
					
				default:
					System.out.println("Please Enter A Valid Choice !!!");
						
					
			}
			
		}		

	}

}
