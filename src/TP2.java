import java.util.Arrays;

public class TP2 {

	public static void main(String[] args) {
		int[][] arr= {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				if(i==2 && j==3 || i==3&&j==3 ) {
					arr[i][j]=1;
				}
				else if(i==2 || i==3) 
						arr[i][j]=0;
				
				else {
					sum = sum+arr[i][j];
				}
					
				
			}
		}
		
		for (int[] row : arr) {

			System.out.println(Arrays.toString(row));
		}
		System.out.println(sum);
		
		
	}
}
