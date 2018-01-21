package linkedlist;

public class FindEnterList {
	/**
	 * 一个链表中包含环，请找出该链表的环的入口结点。
	 * 
	 */
	  public ListNode EntryNodeOfLoop(ListNode pHead)
	   {
		  ListNode p=pHead;  //我猜是快慢指针吧
		  ListNode q=pHead;  
		  while(q!=null&&p.next!=null) {
			  p=p.next;
			  q=q.next.next;
			  if(p==q)
			  {
				  p=pHead;
				  while(p!=q) {
					  p=p.next;
					  q=q.next;
				  }
				  if(p==q) return p;
			  }
		  }
		  return null;
	  }
}
