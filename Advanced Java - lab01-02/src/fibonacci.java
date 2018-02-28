
public class fibonacci {
	
	public void fibo(int n) {
		int a = 0;
		int b = 1;
		int c = 1;
		
		while(c <= n) {
			System.out.print(c+ " ");
			c = a + b; 
			a = b;
			b = c;
		}
		
		
	}
	
	
	
	
	
	
	
}
