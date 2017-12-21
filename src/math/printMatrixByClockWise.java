package math;

import java.util.ArrayList;

public class printMatrixByClockWise {
	/**
	 * ¾ØÕóË³Ê±ÕëÊä³ö
	 * @param matrix
	 * @return
	 */
	public ArrayList<Integer> printMatrix(int[][] matrix) {
		ArrayList<Integer> res = new ArrayList<>();
		if (matrix.length <= 0) {
			return res;
		}
		int top = matrix.length;
		int right = matrix[0].length;
		int left = 0;
		int down = 0;
		int row = 0;
		int column = 0;
		while (top != 0 && right != 0 && (top != row && column != right)) {
			for (; column < right; column++)
				res.add(matrix[row][column]);
			column--;
			right--;
			row++;
			down++;
			for (; row < top; row++)
				res.add(matrix[row][column]);
			row--;
			top--;
			column--;
			if (top != 0 && top != left) {
				for (; column >= left; column--)
					res.add(matrix[row][column]);
				column++;
				left++;
				row--;
			}
			if (right != 0) {
				for (; row >= down; row--)
					res.add(matrix[row][column]);
				row++;
				column++;
			}
		}

		return res;
	}

}
