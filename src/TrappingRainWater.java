
public class TrappingRainWater {

	public static int trap(int[] height) {

		if (height.length == 0)
			return 0;

		int l = 0;
		int r = height.length - 1;
		int maxleft = height[l];
		int maxright = height[r];
		int count = 0;
		int val = 0;
		while (l < r) {
			if (maxleft <= maxright) {
				l++;
				val = maxleft - height[l];
				if (height[l] > maxleft)
					maxleft = height[l];
			} else {
				r--;
				val = maxright - height[r];
				if (height[r] > maxright)
					maxright = height[r];
			}
			if (val > 0)
				count = count + val;

		}
		return count;

	}

	public static void main(String[] args) {
		System.out.println(trap(new int[] { 5, 4, 1, 2 }));

	}

}
