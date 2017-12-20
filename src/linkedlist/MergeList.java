package linkedlist;

public class MergeList {
	/**
	 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
	 */
	 public ListNode Merge(ListNode list1,ListNode list2) {
	        ListNode node=new ListNode(0);
	        ListNode temp=new ListNode(0);
	        node.next=temp;
	        while(list1!=null||list2!=null) {
	        	
	        	if(list1!=null&&list2!=null) {
	        		if(list1.val<list2.val) {
	        			temp.next=list1;
	        			list1=list1.next;
	        		}else {
	        			temp.next=list2;
	        			list2=list2.next;
	        		}
	        	}else if(list1!=null){
	        		temp.next=list1;
	        		break;
	        	}else if(list2!=null){
	        		temp.next=list2;
	        		break;
	        	}
	        	temp=temp.next;
	        }
	        
	        return node.next.next;
	}
}
