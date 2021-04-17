package repl_it_tasks.from150to200;

import java.util.Arrays;

public class Task171_ChessBoard_1aTo8h {

	public static void main(String[] args) {
		 String[][] chessBoard = new String[8][8];

		  for(int i=0;i<=7;i++){
		    for( char j='a';j<='h';j++){
		      
		      int col=j-97;
		      
		      chessBoard[i][col]=(i+1)+""+j;
		    }
		  }
		    

		    
		    //DO NOT CHANGE
		    System.out.println(Arrays.deepToString(chessBoard));
		  }
		}