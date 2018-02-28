package inputSanitation;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sanitizer s = new  sanitizer();
		
		Scanner scan = new Scanner(System.in);
		
		String string = scan.nextLine();
		
		s.isSafe(string);
		//s.paren(string);
		
	}

}
