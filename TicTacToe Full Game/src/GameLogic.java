
public class GameLogic {

		int[] board;
		boolean p1;
	public GameLogic(){
			board = new int[] {0,0,0,0,0,0,0,0,0};	
			
		}
	
	

	public boolean gameIsDraw() {
		
		for(int i:board) {
			if(i==0) {
				return false;
			}
		}
		
		return true;
	}
	
	public boolean isFree(int pos) {
		
		if(board[pos]==0) {
			return true;
		}
		return false;
	}
	
	public void play(String s, int i) {
		
		char[] c = s.toCharArray();
		
		if(s.equals("1,1") && board[0]==0) {	
			board[0]=i;
			System.out.println("Tribikram");
			
		}

		else if(s.equals("1,2") && board[1]==0) {			
			board[1]=i;
			
		}
		
		else if(s.equals("1,3") && board[2]==0) {
			board[2]=i;
			
		}
		
		else if(s.equals("2,1") && board[3]==0) {
			board[3]=i;
		
		}
		
		else if(s.equals("2,2") && board[4]==0) {
			board[4]=i;
			
		}
		
		else if(s.equals("2,3") && board[5]==0) {
			board[5]=i;
			
		}
		
		else if(s.equals("3,1") && board[6]==0) {
			board[6]=i;
			
		}
		
		else if(s.equals("3,2") && board[7]==0) {
			board[7]=i;
			
		}
		
		else if(s.equals("3,3") && board[8]==0) {
			board[8]=i;
			
		}
		
		
	}
	
	
	
	
		
	public Object[] playerWon(int i) {
		
		if	(board[0]==i && board[1]==i && board[2]==i)  {
			return new Object[] {true,"1,2,3"};
		}
		else if	(board[3]==i && board[4]==i && board[5]==i){
			return new Object[] {true,"4,5,6"};
		}
		else if	(board[6]==i && board[7]==i && board[8]==i){
			return new Object[] {true,"7,8,9"};
		}
			
		else if	(board[0]==i && board[3]==i && board[6]==i){
			return new Object[] {true,"1,4,7"};
		}
		else if	(board[1]==i && board[4]==i && board[7]==i){
			return new Object[] {true,"2,5,8"};
		}
		else if	(board[2]==i && board[5]==i && board[8]==i){
			return new Object[] {true,"3,6,9"};
		}
		else if	(board[0]==i && board[4]==i && board[8]==i){
			return new Object[] {true,"1,5,9"};
		}
		else if	(board[6]==i && board[4]==i && board[2]==i){
			return new Object[] {true,"7,5,3"};
			//return new Object[] {true};
			
		}
		
		//return new Object[] {false};
		return new Object[] {false,""};
	}
	
	
	
	
	
	}
	
	
	
	
	
	

