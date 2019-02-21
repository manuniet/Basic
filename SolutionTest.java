package logic.misc;

import java.util.Arrays;


public class SolutionTest {

	int checkRight(String in1,String in2){
		
		int result =-1;
		
		if(in1.length()!=in2.length())
		return result;
		
		
		return result;
		
	}
	public static void printMatrix(int num) {
	    int n = 1;
	    int[][] matrix = new int[num][num];
	    for (int top = 0, bottom = num - 1; top <= bottom; top++, bottom--) {
	        for (int i = 0; i < num; i++) {
	            matrix[top][i] = n++;
	        }
	        if (top == bottom) {
	            break;
	        }
	        for (int i = 0; i < num; i++) {
	            matrix[bottom][i] = n++;
	        }
	    }
	    for(int i=0;i<num;i++){
	    	for(int j=0;j<num;j++){
	    		if(j==0)
	    		System.out.print(matrix[i][j]);
	    		else
	    			System.out.print("*"+matrix[i][j]);	
	    		
	    	}
	    System.out.println("\n");
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMatrix(5);
	}

}
