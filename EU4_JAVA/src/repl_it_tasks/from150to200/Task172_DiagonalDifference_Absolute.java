package repl_it_tasks.from150to200;

import java.util.Scanner;

public class Task172_DiagonalDifference_Absolute {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
		                              {scan.nextInt(), scan.nextInt(), scan.nextInt()},
		                              {scan.nextInt(), scan.nextInt(), scan.nextInt()}
		                            };
		    int result = 0;
		    int left=0;
		    int right=0;
		    
		    for(int i=0;i<3;i++){
		      left+=matrix[i][i];
		    }
		    for(int i=0;i<3;i++){
		      right+=matrix[i][2-i];
		    }
		    
		    result=left-right;
		    
		    // FINAL PRINT
		    System.out.println(Math.abs(result));
		  }
		}