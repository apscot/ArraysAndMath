
public class CovertArray {

	public static int[][] construct2DArray(int[] original, int m, int n) {

		int[][] res = {};
		if (original.length != m * n)
			return res;
		res = new int[m][n];
		int carry = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				res[i][j] = original[carry];
				carry++;
			}

		}
		return res;
	}

	public static void main(String[] args) {

		int[][] res = construct2DArray(new int[] { 1, 1, 1, 1 }, 4, 1);
		System.out.println(res);
	}

}
