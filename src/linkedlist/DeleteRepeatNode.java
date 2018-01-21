package linkedlist;

public class DeleteRepeatNode {
	/**
	 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
	 * 重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
	 */
	 public ListNode deleteDuplication(ListNode pHead)
	    {
		 if(pHead==null||pHead.next==null)
			 return pHead;
		 			//这个是双指针问题 用地一个节点作为基准后面的节点以此循环到不等于当前节点为止
		 ListNode r=new ListNode(-1);
		 ListNode pre=null;  //保留他的头结点
		 ListNode q=pHead.next;//他的下一个节点
		 ListNode p=pHead;
		 r.next=p;
		 while(q!=null) {
			 if(q.val==p.val)
			 {
				 while(q!=null&&q.val==p.val) {
					 q=q.next;
				 }
				 //如果q为空 则已经跑到最终点了
				 p=q;
				 if(pre==null)
					 r.next=q;
				 else
					 pre.next=p;
				 if(q==null)
					 continue;
				 q=q.next;
				
				
			 }else
			 {
				 pre=p;
				 p=p.next;
				 q=q.next;
			 }
		 }
		 
		 return r.next;
	    }
	 
}
