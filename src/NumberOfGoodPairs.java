
public class NumberOfGoodPairs {
	public static int numIdenticalPairs(int[] nums) {
        int ans = 0;
        int[] count = new int[101];

        for (int num : nums) {
            ans += count[num]++;
        }

        return ans;
    }
	
	public static void main(String args[]) {
		numIdenticalPairs(new int[] {1,1,2,1,2});
	}

}
