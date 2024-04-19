import java.util.Arrays;

public class MaxSubArray {
	public int maxSubArray(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}

		int maxSum = nums[0];
		int currSum = 0;

		for (int i = 0; i < nums.length; i++) {
			if (currSum < 0)
				currSum = 0;
			currSum = currSum + nums[i];
			maxSum = Math.max(maxSum, currSum);
		}
		return maxSum;

	}

	public static void main(String args[]) {

	}

}
