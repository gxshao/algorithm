package linkedlist;

public class ReverseList {
	
	public ListNode reverseList(ListNode head) {
		ListNode cur=head;
		ListNode pre;
		ListNode tail;
		if(head==null)
			return null;
		pre=head.next;
		head.next=null;
		while(pre!=null) {
			tail=pre.next; //把后面的节点存下来
			pre.next=cur; //把当前节点 放到中间节点的后面
			cur=pre;     //节点后移
			pre=tail;    //节点后移
			
		}
		head=cur;
		head.printSelf();
		return head;
		
    }
}
