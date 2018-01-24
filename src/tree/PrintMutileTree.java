package tree;

import java.util.ArrayList;

public class PrintMutileTree {
		/**
		 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
		 * @param pRoot
		 * @return
		 */
	   public ArrayList<ArrayList<Integer>> Print(TreeNode root) {
		   ArrayList<ArrayList<Integer>> data=new ArrayList<>();
		   if(root==null) return data;
		   backTrack(data,root,0);
		   return data; 
	    }
	   public void backTrack(ArrayList<ArrayList<Integer>> data,TreeNode root,int level) {
		   	if(root==null)
			   	return;
		   	if(data.size()>level)
		   	{
		   		data.get(level).add(root.val);
		   	}else {
		   		ArrayList<Integer> tmpList=new ArrayList<>();
		   		tmpList.add(root.val);
		   		data.add(tmpList);
		   	}
		   	backTrack(data, root.left, level+1);
		   	backTrack(data, root.right, level+1);
		   	
	   }
	    
}
