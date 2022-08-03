import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class appendFile {
	public void append_file() { 
        Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the name of the file to be Appended:");
			String f_name = sc.next();
			BufferedWriter br = new BufferedWriter(new FileWriter(f_name+".txt", true));
            
			System.out.println("Enter the text to be Appended in the file:");
			
			sc.nextLine();
			String txt;
			txt = sc.nextLine();
            
            br.write("\n"+txt);
            br.close();
            System.out.println("Append Successfull.");
        }
        catch (IOException e) {
            System.out.println("Please Enter a Valid input!");
        }
    }
}
