package Tree;

public class BinarySearchTreeAndLinkedList {
	/*
	 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
	 */
	//思路就是中序遍历
	public TreeNode Convert(TreeNode node) {
		if(node==null)
			return null;
		TreeNode pHead;
		inOrder(node, null);
		return node;
	}
	private TreeNode inOrder(TreeNode node,TreeNode parent) {
		if(node.left==null&&node.right==null) {
			node.left
		}
		inOrder(node.left,node);
		node.left=null;
		node.right=parent;
		inOrder(node.right,node);
		node.right=null;
		node.left=parent;
		return node;
	}
}
