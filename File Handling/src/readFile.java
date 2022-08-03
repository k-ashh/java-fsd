import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class readFile {
	
	public void read_file() {
		Scanner sc = new Scanner(System.in);
        try {
        	System.out.println("Enter the name of the file you want to Read:\n");
        	String f_name = sc.next();
        	File file = new File(f_name+".txt");
            Scanner rd = new Scanner(file);
            while (rd.hasNextLine()) {
                String data = rd.nextLine();
                System.out.println(data);
            }
            rd.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File Does not exit.!!!");
        }
	}
}