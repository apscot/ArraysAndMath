import java.util.Arrays;

public class MaxOfAbsValExpression {
	
	//First Approach
	public int maxAbsValExpr(int[] arr1, int[] arr2) {
		final int n = arr1.length;
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		int[] d = new int[n];

		for (int i = 0; i < n; ++i) {
			a[i] = arr1[i] + arr2[i] + i;
			b[i] = arr1[i] + arr2[i] - i;
			c[i] = arr1[i] - arr2[i] + i;
			d[i] = arr1[i] - arr2[i] - i;
		}

		return Math.max(Math.max(diff(a), diff(b)), Math.max(diff(c), diff(d)));
	}

	private int diff(int[] nums) {
		final int min = Arrays.stream(nums).min().getAsInt();
		final int max = Arrays.stream(nums).max().getAsInt();
		return max - min;
	}

	//Second Approach
	public int maxAbsValExpr2(int[] x, int[] y) {
		int maxCase1 = Integer.MIN_VALUE;
		int maxCase2 = Integer.MIN_VALUE;
		int maxCase3 = Integer.MIN_VALUE;
		int maxCase4 = Integer.MIN_VALUE;
		int minCase1 = Integer.MAX_VALUE;
		int minCase2 = Integer.MAX_VALUE;
		int minCase3 = Integer.MAX_VALUE;
		int minCase4 = Integer.MAX_VALUE;

		for (int i = 0; i < x.length; i++) {
			maxCase1 = Math.max(maxCase1, x[i] + y[i] - i);
			maxCase2 = Math.max(maxCase2, x[i] - y[i] - i);
			maxCase3 = Math.max(maxCase3, -x[i] + y[i] - i);
			maxCase4 = Math.max(maxCase4, -x[i] - y[i] - i);
			minCase1 = Math.min(minCase1, x[i] + y[i] - i);
			minCase2 = Math.min(minCase2, x[i] - y[i] - i);
			minCase3 = Math.min(minCase3, -x[i] + y[i] - i);
			minCase4 = Math.min(minCase4, -x[i] - y[i] - i);
		}

		return Math.max(Math.max(maxCase1 - minCase1, maxCase2 - minCase2),
				Math.max(maxCase3 - minCase3, maxCase4 - minCase4));
	}

}
