package jj;

public class array {

	public static void main(String[] args) {
		int x[][]= new int[2][3];
		x[0][0]= 13;
		x[0][1]=12;
		x[0][2]=11;
		
		x[1][0]=7;
		x[1][1]=6;
		x[1][2]=5;
		
		System.out.println(x.length);
		System.out.println(x[0].length);
		
		for(int row=0; row<x.length; row++)
			for (int col=0; col<x[0].length; col++)
		{
			System.out.println(x[row][col]);
			
			
		}
 
	}

}
