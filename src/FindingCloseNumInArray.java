import java.util.Arrays;

public class FindingCloseNumInArray {

	public static void main(String[] args) {
		int elelemt =8; //1
		int[] arr= {1,7,5,9,6};
		System.out.println(findMinElelmet(arr,elelemt));
	}

	private static int findMinElelmet(int[] arr, int elelemt) {
		int min=99999 ;
		int diff,res=0;
		
			for(int j=0;j<arr.length;j++) {
				diff =Math.abs(elelemt-arr[j]);
				if(diff<min) {
					min = diff;
					res =arr[j];
				}
				
			}
		
		return res;
	}
}
