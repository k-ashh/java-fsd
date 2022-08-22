import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class writeFile {
	public void write_file() { 
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the name of the file to be written:");
			String f_name = sc.next();
            FileWriter wr = new FileWriter(f_name+".txt");
            
			System.out.println("Enter the text to be written in the file:");
			
			sc.nextLine();
			String txt;
			txt = sc.nextLine();

            
            wr.write(txt);
            wr.close();
            System.out.println("Write Successfull.");
        }
        catch (FileNotFoundException f) {
            System.out.println("File Does not exit.!!!");
        }
        catch (IOException e) {
            System.out.println("Please Enter a Valid input!");
        }
		

    }
}
