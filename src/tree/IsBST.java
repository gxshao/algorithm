package tree;

public class IsBST {
	/**
	 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
	 */
	public boolean IsBalanced_Solution(TreeNode root) {
		if (root == null)
			return true;
		return TreeDepth(root) <= 1;
	}

	public int TreeDepth(TreeNode root) {
		if (root == null)
			return 0;
		return Math.max(TreeDepth(root.left), TreeDepth(root.right)) + 1
				- Math.min(TreeDepth(root.left), TreeDepth(root.right));
	}
}
