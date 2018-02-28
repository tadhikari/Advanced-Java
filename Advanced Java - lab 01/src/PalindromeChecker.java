import java.util.Scanner;
public class PalindromeChecker {
	
	public void checker() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please Enter your word");
		String word = scan.nextLine();
		scan.close();
		char[] charecters = word.toCharArray();
		String temp="";
		for(int i=charecters.length-1;i>=0;i--) {
			temp+=charecters[i];
		}
		
		if(word.equals(temp)) {
			System.out.println("It is palindrome");
		}
		
		else {
			System.out.println("It is not palindrome");
		}
		
		
		String abc = "tribikram";
		String jpt = abc;
		abc = "adhikari";
		System.out.println(jpt);
		
	}
	
	
	
	
}
