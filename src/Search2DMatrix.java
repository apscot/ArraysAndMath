
public class Search2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {

		int dBound = matrix.length;
		int rBound = matrix[0].length;

		int i = 0;
		int j = rBound - 1;

		while (i >= 0 && i < dBound && j >= 0 && j < rBound) {
			if (matrix[i][j] > target)
				j--;
			else if (matrix[i][j] < target)
				i++;
			else
				return true;

		}
		return false;

	}

}
