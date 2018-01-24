package tree;

public class ReConstructBinaryTree {
	public TreeNode reConstructBinaryTree(int[] pre,int[] in) {
		return genTree(pre,in,0,pre.length-1,0,in.length-1);
	}

	private TreeNode genTree(int[] pre, int[] in, int startPre, int endPre,int startIn, int endIn) {
		if(startPre>endPre||startIn>endIn) {
			return null;
		}
		TreeNode root=new TreeNode(pre[startPre]);
		for(int i=startIn;i<=endIn;i++) {
			if(in[i]==root.val) {
				root.left=genTree(pre, in, startPre+1,startPre+i-startIn, startIn, i-1);
				root.right=genTree(pre, in, i+1-startIn+startPre, endPre, i+1, endIn);
			}
			
		}
		
		return root;
	}
}
