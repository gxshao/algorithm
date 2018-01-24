package array;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SlideWindow {
	/**
	 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，
	 * 那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
	 * {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}，
	 * {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
	 */
	public ArrayList<Integer> maxInWindows(int[] num, int size) {
		ArrayList<Integer> result = new ArrayList<>();
		if (num.length < size||size==0)
			return result;
		for(int i=0;i<num.length-size+1;i++) {
			result.add(max(num, i, size+i));
		}
		return result;

	}

	public int max(int[] num, int start, int size) {
		int max = Integer.MIN_VALUE;
		for (int i = start; i < size; i++) {
			max = max < num[i] ? num[i] : max;
		}
		return max;
	}

}
