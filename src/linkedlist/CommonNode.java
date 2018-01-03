package linkedlist;

public class CommonNode {
	/**
	 * 输入两个链表，找出它们的第一个公共结点。
	 * 
	 * @param pHead1
	 * @param pHead2
	 * @return
	 */
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		ListNode p1 = pHead1;
		ListNode p2 = pHead2;
		while (p1 != p2) {  //一替换 则退出
			p1 = (p1 == null ? pHead2 : p1.next);  //为空替换 不为空往后走一步
			p2 = (p2 == null ? pHead1 : p2.next);
		}
		return p1;
	}
}
