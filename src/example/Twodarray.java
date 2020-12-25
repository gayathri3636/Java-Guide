package example;

public class Twodarray {

	public static void main(String[] args) {
		//Instead of creating single arrays like this we can create 2d array
		int a[]= {1,2,3,4};
		int b[]= {2,4,6,8};
		int c[]= {3,5,6,7};
		
		//int d[][] = {a,b,c}; which is like below
		int d[][] = {
				{1,2,3,4},
				{2,4,6,8},
				{3,5,6,7}
		};
//		System.out.println(d[0][2]); //3
		for(int i=0; i<3; i++) { //rows
			for(int j=0; j<4; j++) { //columns
				System.out.print(" " +d[i][j]);
			}
		System.out.println();;
		}
		
		}

}
