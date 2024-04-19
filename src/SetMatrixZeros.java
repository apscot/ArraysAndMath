import java.util.ArrayList;
import java.util.List;

public class SetMatrixZeros {
	public static void setZeroes(int[][] matrix) {
		List<Val> valList = new ArrayList<>();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					Val val = new Val(i, j);
					valList.add(val);
				}
			}
		}
		for (Val val : valList) {
			for (int i = 0; i < matrix.length; i++) {

				matrix[i][val.col] = 0;
			}
			for (int j = 0; j < matrix[0].length; j++) {

				matrix[val.row][j] = 0;
			}

		}
	}

	static class Val {
		int row;
		int col;

		Val(int row, int col) {
			this.row = row;
			this.col = col;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub [[1,1,1],[1,0,1],[1,1,1]]

		int[][] arr = new int[3][3];
		arr[0][0] = 1;
		arr[0][1] = 1;
		arr[0][2] = 1;

		arr[1][0] = 1;
		arr[1][1] = 0;
		arr[1][2] = 1;

		arr[2][0] = 1;
		arr[2][1] = 1;
		arr[2][2] = 1;

		setZeroes(arr);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
