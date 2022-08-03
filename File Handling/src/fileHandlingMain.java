import java.util.Scanner;
public class fileHandlingMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		createFile c = new createFile();
		readFile r = new readFile();
		writeFile w = new writeFile();
		appendFile a = new appendFile();
	
		while(true) {
			System.out.println("\n--------File Handling Program--------\n");
			System.out.println("Operations:");
			System.out.println("1. Create a File \t 2. Read a File \n3. Write a File \t 4. Append a File \n5. Exit");
			System.out.println("Please Enter one of the above choice");
			int ch = sc.nextInt();
			System.out.println();
			switch(ch) {
				case 1:
					c.create();
					break;
				
				case 2:
					r.read_file();
					break;
				
				case 3:
					w.write_file();
					break;
				
				case 4: 
					a.append_file();
					break;
				
				case 5:
					System.out.println("Exiting Program...");
					System.exit(0);
					break;
					
				default:
					System.out.println("Please Enter A Valid Choice !!!");
										
			}
		}
	}
}
