import array.AjustArray;
import array.ContinueSqeuence;
import array.CountNumOfArray;
import array.FindKInArray;
import array.FindMaxSumOfSubArray;
import array.InversePairs;
import array.RepeatNumberInArray;
import array.SlideWindow;
import array.SumofS;
import array.UglyNumber;
import binary.CountOneOfNumber;
import dynamicPrograming.Finbonacci;
import dynamicPrograming.RectCover;
import linkedlist.DeleteRepeatNode;
import linkedlist.ListNode;
import linkedlist.ReverseList;
import math.ExponentOfBase;
import math.printMatrixByClockWise;
import other.Add;
import other.LastRemain;
import other.OntToN;
import stack.QueueImplByTwoStack;
import string.FirstMerge;
import string.JundgeNum;
import string.LeftRotate;
import string.OrderString;
import string.ReverseWords;
import string.StringToInt;
import tree.AllpathForValue;
import tree.HasSubtree;
import tree.MirrorOfTree;
import tree.ReConstructBinaryTree;
import tree.SerializeTree;
import tree.TreeNode;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ListNode node=new ListNode(new int[] {1,2,3,4,5,6,7});
		// new int[][] {{1,2,3,4,5,6,7}}
		// new int[][] {{1},{2},{3},{4},{5}}
		// new int[][]{{1,2},{3,4},{5,6},{7,8},{9,10}}
		// new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}
		// new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}}
		// new
		// int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}}
		// new printMatrixByClockWise().printMatrix(new
		// int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}});
		TreeNode root = new TreeNode(5);
		TreeNode root4 = new TreeNode(4);
		TreeNode root3 = new TreeNode(3);
		TreeNode root2 = new TreeNode(2);
		root.left = root4;
		root4.left = root3;
		root3.left = root2;
		long s = System.currentTimeMillis();
		// "+100","5e2","-123","3.1416"和"-1E-16"
		// new DeleteRepeatNode().deleteDuplication(new ListNode(new int[]
		// {1,2,3,3,4,4,5})).printSelf();
		System.out.println(new SlideWindow().maxInWindows(new int[] {2,3,4,2,6,2,5,1}, 3));
		System.out.println("运行时间：" + (System.currentTimeMillis() - s));

	}

}
