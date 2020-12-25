package example;
//If we are creating odd number of columns in 2d array then it is called jagged array.
public class jaggedarray {

	public static void main(String[] args) {
		//when columns are not same they are jagged arrays
		int a[]= {1,2,3,4};
		int b[]= {2,4,6};
		int c[]= {3,5,6,7};
		
		//int d[][] = {a,b,c}; which is like below
		int d[][] = {
				{1,2,3,4},
				{2,4,6}, //Jagged arrays when columns are not same
				{3,5,6,7}
		};
//		System.out.println(d[0][2]); //3
		for(int i=0; i<d.length; i++) { //rows
			for(int j=0; j<d[i].length; j++) { //columns
				System.out.print(" " +d[i][j]);
			}
		System.out.println();
		}
		
		}

}