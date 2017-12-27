import Stack.QueueImplByTwoStack;
import Tree.AllpathForValue;
import Tree.HasSubtree;
import Tree.MirrorOfTree;
import Tree.ReConstructBinaryTree;
import Tree.TreeNode;
import array.AjustArray;
import binary.CountOneOfNumber;
import dynamicPrograming.Finbonacci;
import dynamicPrograming.RectCover;
import linkedlist.ListNode;
import linkedlist.ReverseList;
import math.ExponentOfBase;
import math.printMatrixByClockWise;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ListNode node=new ListNode(new int[] {1,2,3,4,5,6,7});
		//new int[][] {{1,2,3,4,5,6,7}}
		//new int[][] {{1},{2},{3},{4},{5}}
		//new int[][]{{1,2},{3,4},{5,6},{7,8},{9,10}}
		//new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}
		//new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}}
		//new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}}
		//new printMatrixByClockWise().printMatrix(new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}});
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		System.out.println(new AllpathForValue().FindPath(root, 3));
		
		System.out.println();
	
	}
	

}
