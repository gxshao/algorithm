package binary;

public class CountOneOfNumber {
	/**
	 * 计算一个整数中1的个数
	 * 思路是这样的:把他-1 要么前面不变  要么后面全为1  比如10000B-1B =1111B
	 * @param n
	 * @return
	 */
	public int NumberOf1(int n) {
		if (n == 0)
			return 0;
		int count = 0;
		while (n!=0) {
			n=n&(n-1);
			count++;
		}

		return count;
	}
}
