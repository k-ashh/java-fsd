import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class createFile{
	
	public void create() {
	
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Please Enter the name of file to be Created:\n");
			String f_name = sc.next();
			File file = new File(f_name+".txt");
			if (file.createNewFile()) {
				System.out.println("File created : "+ file.getName());
			}
			else {
				System.out.println("File already exists!!!");
			}
		}
		catch (IOException e) {
				System.out.println("Invalid Input!!\n Exiting...");
		}
		
	}
	
}

