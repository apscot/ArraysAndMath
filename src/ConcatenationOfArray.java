import java.util.Arrays;

public class ConcatenationOfArray {

	public static void main(String[] args) {
		printArray(getConcatenation(new int[] {1,2,3}));

	}
	public static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length*2];

        for(int i=0;i<nums.length;i++)
            result[i] = nums[i];
        for(int i=0;i<nums.length;i++)
            result[nums.length+i] = nums[i];

        return result;
    }
	
	public static void printArray(int[] nums) {
		Arrays.stream(nums).forEach(System.out::print);
	}

}
