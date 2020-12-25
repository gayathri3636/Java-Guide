package example;
//for each loop iterates through each element in array
public class enhancedforloop {

	public static void main(String[] args) {
		//For each for one d array
//		int a[]= {2,4,56,7};
//		for(int k:a) {
//			System.out.println(k);
//		}
		
		//For multidimensional array
		int d[][] = {
				{1,2,3,4},
				{2,4,6},
				{3,5,6,7}
		};
		for (int[] k: d) { 
			for(int l:k) {
				System.out.print(" " +l);
			}
		System.out.println();
		}
	}

}
