
public class LongestNonNegSubArray {
	
	

	public static void main(String[] args) {
	
		int[] arr = new int[]{1, 0, 4, 0, 1, -1, -1, 0, 0, 1, 0, -1};
		
		int maxCount=0;
		int start =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				if(i>0) {
					maxCount= Math.max(maxCount,i-start);
					start=i+1;
				}
				else {
					start= start+1;
				}
			}
		}
		maxCount=Math.max(maxCount,arr.length-start);
		System.out.println(maxCount);

	}

}
