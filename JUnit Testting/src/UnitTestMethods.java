public class UnitTestMethods {
	
	public int addInts(int x,int y) {
		return x + y;
	}
	
	public String addString(String x,String y) {
		return x+y;
	}
	
	public int strLen(String a){
		
		return a.length();
		
	}
	
	public Integer divXbyY(int x,int y) {
		
		if(y==0) {
			return null;
		}
		
		return (int) x/y;
	}
	
	public int[] reverseIntArray(int[] x) {
		
		int[] y = new int[x.length];
		int temp = 0;
		for(int i = x.length-1;i >= 0;i--) {
			y[temp] = x[i];
			temp+=1;
		}
		
		return y;
	}
	
	public int[] range(int x) {
		int[] s = new int[x];
		for(int i=0;i<x;i++) {
			s[i] = i;
		}
		
		return s;
	}
	
	public int[] range(int x,int y) {
		int[] s = new int[y];
		for(int i=x;i<y;i++) {
			s[i] = i;
		}
		
		return s;
	}
	
	public int[] range(int x,int y,int step) {
		int[] s = new int[y];
		for(int i=x;i<y;i+=step) {
			s[i] = i;
		}
		
		return s;
	}
	
}
