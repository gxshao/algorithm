package Tree;

public class SymmetricTree {
	/*
	 * 请实现一个函数，用来判断一颗二叉树是不是对称的。 
	 * 注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
	 * 
	 */
	public boolean isSymmetrical(TreeNode root) {
		if (root == null)
			return true;
		return sperate(root.left,root.right);
		
	}
	public boolean sperate(TreeNode left,TreeNode right) {  // 左边比较右边，一直到叶子节点
		if(left==null&&right==null)
			return true;
		 if(left==null||right==null) return false;
		 if(left.val==right.val)
		 {
			 return sperate(left.left,right.right)&&sperate(left.right,right.left);
		 }
		 return false;
	}
}
