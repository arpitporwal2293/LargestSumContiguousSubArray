
public class Kadane {

	//kadane's algorithm will be used here;
	/*algo :
		max_so_far = 0;
		max_ending_here = 0;

		loop through the array
			max_ending_here += a[i]
			if(max_ending_here<0){
				max_ending_here=0
			}
			if(max_so_far<max_ending_here){
				max_so_far = max_ending_here
			}
		return max_so_far*/
	
	public static int maxSum(int[] arr){
		int max_so_far = 0;
		int max_ending_here = 0;
		for(int i=0;i<arr.length;i++){
			max_ending_here += arr[i];
			if(max_ending_here<0){
				max_ending_here = 0;
			}
			if(max_so_far<max_ending_here){
				max_so_far = max_ending_here;
			}
		}
		return max_so_far;
	}
	
	public static void main(String[] args) {
		int[] arr = {-3,-2,4,3,6,-2,-1,7};
		System.out.println(maxSum(arr));
	}
	
}
