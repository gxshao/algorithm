package tree;

public class KNode {
	/*
	 * 
	 * 给定一颗二叉搜索树，请找出其中的第k大的结点。 例如， 5 / \ 3 7 /\ /\ 2 4 6 8 中，按结点数值大小顺序第三个结点的值为4。
	 */
	int count = 0;

	public TreeNode KthNode(TreeNode root, int k) {  //中序遍历
		if (root != null) {
			TreeNode node = KthNode(root.left, k);
			if (node != null)
				return node;
			count++;
			if (count == k)
				return root;
			node = KthNode(root.right, k);
			if (node != null)
				return node;
		}
		return null;
	}
}
