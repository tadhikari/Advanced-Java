
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
	
	public void play(String s, int i) {
		
		char[] c = s.toCharArray();
		
		if(c[0]=='1' && c[1]=='1' && board[0]==0) {	
			board[0]=i;
		}

		else if(c[0]=='1' && c[1]=='2' && board[1]==0) {			
			board[1]=i;
		}
		
		else if(c[0]=='1' && c[1]=='3' && board[2]==0) {
			board[2]=i;
		}
		
		else if(c[0]=='2' && c[1]=='1' && board[3]==0) {
			board[3]=i;
		}
		
		else if(c[0]=='2' && c[1]=='2' && board[4]==0) {
			board[4]=i;
		}
		
		else if(c[0]=='2' && c[1]=='3' && board[5]==0) {
			board[5]=i;
		}
		
		else if(c[0]=='3' && c[1]=='1' && board[6]==0) {
			board[6]=i;
		}
		
		else if(c[0]=='3' && c[1]=='2' && board[7]==0) {
			board[7]=i;
		}
		
		else if(c[0]=='3' && c[1]=='3' && board[8]==0) {
			board[8]=i;
		}
		
	}
	
	
	
	
		
	public boolean playerWon(int i) {
		
		if((board[0]==i && board[1]==i && board[2]==i) || 
			(board[3]==i && board[4]==i && board[5]==i) ||
			(board[6]==i && board[7]==i && board[8]==i) ||
			
			(board[0]==i && board[3]==i && board[6]==i)||
			(board[1]==i && board[4]==i && board[7]==i)||
			(board[2]==i && board[5]==i && board[8]==i)||
			
			(board[0]==i && board[4]==i && board[8]==i)||
			(board[6]==i && board[4]==i && board[2]==i)){
			
			return true;
			
		}
		
		return false;
	}
	
	
	
	
	
	}
	
	
	
	
	
	

