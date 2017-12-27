package Tree;

import java.util.ArrayList;

public class AllpathForValue {
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		ArrayList<ArrayList<Integer>> data = new ArrayList<>();
		if(root==null) {
			return data;
		}
		backtrack(data,new ArrayList<>(),root,target);
		return data;
	}

	private void backtrack(ArrayList<ArrayList<Integer>> data, ArrayList<Integer> arrayList,TreeNode node, int target) {
		// TODO Auto-generated method stub
		if(node==null)
			return;
		arrayList.add(node.val);
		if(node.left==null&&node.right==null) {
			int val=0;
			for(int x:arrayList) {
				val+=x;
			}
			if(val==target) {
				data.add(new ArrayList<Integer>(arrayList));	
			}
			return;
		}
		ArrayList<Integer> leftlist=new ArrayList<>(arrayList);
		ArrayList<Integer> rightlist=new ArrayList<>(arrayList);
		backtrack(data, leftlist, node.left, target);
		backtrack(data, rightlist, node.right, target);	
	}
	
}
