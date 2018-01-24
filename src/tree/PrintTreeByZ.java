package tree;

import java.util.ArrayList;
import java.util.Collections;

public class PrintTreeByZ {
	/**
	 * 请实现一个函数按照之字形打印二叉树， 即第一行按照从左到右的顺序打印， 第二层按照从右至左的顺序打印， 第三行按照从左到右的顺序打印，其他行以此类推。
	 * [[8],[10,6],[5,7,9,11]]
	 */

	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		// 我觉得采用回溯法
		ArrayList<ArrayList<Integer>> data = new ArrayList<>();
		if (pRoot == null)
			return data;
		backTrack(data, pRoot, 0);
		
		for(int i=1;i<data.size();i+=2) {
			ArrayList<Integer> tmp=data.get(i);
			Collections.reverse(tmp);
		}
		return data;
	}

	public void backTrack(ArrayList<ArrayList<Integer>> data, TreeNode node, int level) {
		if(node==null)
			return;
		if (data.size() > level) {
			data.get(level).add(node.val);
		} else {
			ArrayList<Integer> tmpList = new ArrayList<>();
			tmpList.add(node.val);
			data.add(tmpList);
		
		}
		backTrack(data, node.left, level + 1);
		backTrack(data, node.right, level + 1);

	}
}
