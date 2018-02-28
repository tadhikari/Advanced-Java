package inputSanitation;

import java.util.ArrayList;

public class sanitizer {

	

	public void isSafe(String s) {
		s = s.toLowerCase();
		if(sqlCheck(s)) {
			System.out.println("Unsafe");
			System.out.println("First problem encountered: 'Contains SQL'");
		}
		else if(unbalancedQuote(s)) {
			System.out.println("Unsafe");
			System.out.println("First problem encountered: 'Ubalanced Quote'");
		}
		else if(octalChecker(s)) {
			System.out.println("Unsafe");
			System.out.println("First problem encountered: 'Contains Octal'");
		}
		else if(balancedPar(s)) {
			System.out.println("Unsafe");
			System.out.println("First problem encountered: 'Unbalanced Parenthesis'");
		}
		
		else if(containsJava(s)) {
			System.out.println("Unsafe");
			System.out.println("First problem encountered: 'Contains Java Code'");
		}
		
		else {
			System.out.print("Safe");
		}
	}
	
	
	public boolean balancedPar(String string) {
		
		Stack s = new Stack();
		char[] paren = paren(string);
		boolean balanced = true;
		int index = 0;
		
		while(index < paren.length && balanced) {
			char symbol = paren[index];
			if(symbol == '(') {
				s.push(symbol);
			}
			else {
				if (s.isEmpty()) {
					balanced = false;
				}
				else {
					char opn =s.pop();
					//if (symbol==')' && opn=='(') {balanced = false;}
						
				}
			}
			index+=1;
		}
		
		if(balanced && s.isEmpty()) {
			return false;
		}
		
		return true;
	}
	
	
	private char[] paren(String string) {
		String paren="";
		char[] s = string.toCharArray(); 
		for(char c:s) {
			if(c == '(' || c == ')' ) {
				paren+=c;
			}
		}
		return paren.toCharArray();
	}
	
	
	public boolean containsJava(String s) {
		
		String[] words = s.split("\\s+");
		for(String c:words) {
			if(c.equals("int")) {
				return true;
			}
		}
		return false;
	}
	
	
	public boolean sqlCheck(String s) {
		
		String[] splitted = s.split("\\s+");
		
		boolean isSelect = false;
		boolean isWhere = false;
		
		for(String c:splitted) {
			if(c.equals("select")) {
				isSelect = true;
			}	
			if(c.equals("where")) {
				isWhere = true;
			}
		}
		if(isSelect == true && isWhere == true) {
			//System.out.print("contains sql");
			return true;
		}
		return false;
	}
	
	public boolean unbalancedQuote(String s) {
		
		char[] splitted = s.toCharArray();
		
		int counter1=0;
		int counter2=0;
		
		for(char c:splitted) {
		
			if(c == '\'') {
				counter1++;
			}
			
			else if(c == '"') {
				counter2++;
			}
			
		}
		
		if(counter1%2==0 && counter2%2==0) {
			return false;
		}
		
		return true;
	}
	
	public boolean octalChecker(String s) {
		String[] splittedText = s.split("\\s+");
		
		for(String c:splittedText) {
			
			char[] wordByParts = c.toCharArray();
			
			if(wordByParts[0]=='0') {
				return true;
			}	
		}
		return false;
	}
}

class Stack {
	
	ArrayList<Character> items;
	
	public Stack() {
		items = new ArrayList<Character>();
	}
	
	public void push(char c) {
		items.add(c);
	}
	
	public char pop() {
		return items.remove(items.size()-1);
	}
	
	public boolean isEmpty() {
		
		if(items.size()==0) {
			return true;
		}
		
		return false;
	}
}

