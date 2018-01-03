package array;

import java.util.HashMap;

public class OnceInArray {
	// num1,num2分别为长度为1的数组。传出参数
	// 将num1[0],num2[0]设置为返回结果
	/**
	 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
	 */
	public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int x : array) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		boolean flag = false;
		for (int key : map.keySet()) {
			if (map.get(key) == 1) {
				if (flag)
					num1[0] = key;
				else
					num2[0] = key;
				flag = true;
			}
		}
	}
}
