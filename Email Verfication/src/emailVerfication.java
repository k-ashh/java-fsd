import java.util.regex.*;    
import java.util.*;    

public class emailVerfication {

	public static void main(String[] args) {
		
		ArrayList<String> email_list = new ArrayList<>();
		
		boolean flag=false;		
		email_list.add("ashu@mphasis.com");  
		email_list.add("kumar@mphasis.com");  
		email_list.add("xyz@mphasis.com");  
		email_list.add("abc@mphasis.com");  
		email_list.add("manager@mphasis.com");  
		email_list.add("hr@mphasis.com");  
		email_list.add("ceo@mphasis.com");  
		email_list.add("xyz@gmail.com");  
		
		Scanner scan = new Scanner(System.in);
		
		String regex = "^(.+)@(.+)$";  
		Pattern pattern = Pattern.compile(regex);  
		System.out.println("Enter the email to be checked:");
		String mail = scan.next();
		while(true) {
			Matcher matcher = pattern.matcher(mail);
			if(matcher.matches()) {
				break;
			}
			System.out.println("Please Enter a valid Email !!!");
			mail = scan.next();
		}
		
		for(String email : email_list) {
			if(mail.equalsIgnoreCase(email))
				flag=true;
		}
		
		
		if(flag) {
			System.out.println("Email is found in the array.");
		}
		else {
			System.out.println("Email is found in the array.");
		}
		
	}
}
