package tree;

public class HasSubtree {
	/**
	 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
	 * 
	 * @param root1
	 * @param root2
	 * @return
	 */
	public boolean HasSubtree(TreeNode root1, TreeNode root2) {
		if (root2 == null ||root1==null) {
			return false;
		}
		return isSubTree(root1, root2) || HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2); //判断根节点和判断子树共同结果

	}

	private boolean isSubTree(TreeNode node1,TreeNode node2) {  //把判断子树单独提出来
		if(node2==null) return true; //到了叶子节点
		if(node1==null) return false; //A树与B树分支不一样
		if(node1.val==node2.val) 
			return isSubTree(node1.left, node2.left)&&isSubTree(node1.right, node2.right); //进行递归左右子树比对节点是否一样
		else
			return false;
	}
}
