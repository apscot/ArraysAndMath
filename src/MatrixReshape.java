
public class MatrixReshape {

	public int[][] matrixReshape(int[][] mat, int r, int c) {
		if (mat.length * mat[0].length != r * c)
			return mat;

		int res[][] = new int[r][c];
		int n = mat[0].length;
		int m = mat.length;

		for (int i = 0; i < m * n; i++) {
			int nr = i / c;
			int nc = i % c;

			int or = i / n;
			int oc = i % n;

			res[nr][nc] = mat[or][oc];
		}
		return res;
	}

}
