package array;

public class CountNumInArray {
	/**
	 * 统计一个数字在排序数组中出现的次数。
	 */
	public int GetNumberOfK(int[] array, int k) {
		int result = 0;
		for(int x:array) {
			result+=x==k?1:0;
		}
		return result;
	}
}
