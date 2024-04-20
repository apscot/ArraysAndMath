public class MaxChunksToSorted {

	public static int maxChunkToSort(int arr[]) {
		int res = 0;
		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
			if (max == i)
				res++;
		}
		return res;
	}

	public static void main(String args[]) {

		System.out.println(maxChunkToSort(new int[] { 1, 0, 2, 3, 4 }));
		System.out.println(maxChunkToSort2(new int[] { 2, 1, 3, 4, 4, 5, 4, 6, 5 }));
	}

	public static int maxChunkToSort2(int arr[]) {
		int res = 0;
		int[] lMax = new int[arr.length];
		int[] rMin = new int[arr.length];

		lMax[0] = arr[0];
		for (int i = 1; i < arr.length; i++)
			lMax[i] = Math.max(lMax[i - 1], arr[i]);
		rMin[arr.length - 1] = arr[arr.length - 1];

		for (int j = arr.length - 2; j >= 0; j--)
			rMin[j] = Math.min(rMin[j + 1], arr[j]);
		
		for(int i=0;i<arr.length-1;i++) {
			if(lMax[i]<=rMin[i+1])
				res++;
		}

		return res+1;

	}

}