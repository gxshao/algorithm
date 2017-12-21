package Tree;

public class TreeNode {
	int val;
	public TreeNode left = null;
	public TreeNode right = null;

	public TreeNode(int x) {
		val = x;
	}
	/**
	 * 生成一颗二叉树
	 * @param arr
	 */
	public TreeNode(char[] arr) {
		
	}

	public void printSelf() {
		System.out.print("先序遍历为:");
		printPreTree(this);
		System.out.println();

		System.out.print("中序遍历为:");
		printInTree(this);
		System.out.println();

		System.out.print("后序遍历为:");
		printTailTree(this);
		System.out.println();
	}

	/**
	 * 先序遍历
	 * 
	 * @param root
	 */
	private void printPreTree(TreeNode root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		printPreTree(root.left);
		printPreTree(root.right);
	}

	/**
	 * 中序遍历
	 * 
	 * @param root
	 */
	private void printInTree(TreeNode root) {
		if (root == null)
			return;
		printInTree(root.left);
		System.out.print(root.val + " ");
		printInTree(root.right);
	}

	/**
	 * 后序遍历
	 * 
	 * @param root
	 */
	private void printTailTree(TreeNode root) {
		if (root == null)
			return;
		printTailTree(root.left);
		printTailTree(root.right);
		System.out.print(root.val + " ");
	}

}
