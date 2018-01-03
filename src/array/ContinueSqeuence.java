package array;

import java.util.ArrayList;

public class ContinueSqeuence {
	/**
	 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和, 他马上就写出了正确答案是100。但是他并不满足于此,
	 * 他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
	 * 现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck! 输出描述: 输出所有和为S的连续正数序列。
	 * 序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
	 */
	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		int start = 1;
		while (start < (sum + 1) / 2) {
			int tmpSum = start;
			ArrayList<Integer> tmp = new ArrayList<>();
			tmp.add(start);
			int j = start + 1;
			while (tmpSum != sum && j <=(sum + 1) / 2) {
				if (tmpSum > sum&&tmp.size()>0) {
					// 移动头
					tmp.remove(0);
				} else {
					tmpSum += j;
					tmp.add(j);
				}
				j++;
			}
			if(tmpSum==sum)
				res.add(tmp);
			start++;
		}
		return res;
	}
}
