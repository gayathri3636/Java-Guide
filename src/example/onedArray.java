package example;

//simple onedimensional array
//public class onedArray {
//
//	public static void main(String args[]) {
//		int nums[] = new int[4];
//		nums[0]=1;
//		nums[1]=12;
//		nums[2]=13;
//		nums[3]=14;
//		for(int i=0; i<4; i++) {
//			System.out.println(nums[i]);
//		}
//	}
//
//}

//**********************************************************
//passing array to method in java
//find min element in array
class onedArray{
	static void min(int arr[]) {
		int min = arr[0];
		for(int i=0; i<arr.length;i++) 
			if(min>arr[i])
				min=arr[i];
		System.out.println(min);
		
	}

	public static void main(String args[]) {
	int a[]= {12, 14, 54, 67};
	min(a);
}
}