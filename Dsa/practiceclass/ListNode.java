//package practiceclass;
//
//public class ListNode {
//	int val;
//	ListNode next;
//	public ListNode(int x) {
//		this.val=x;
//		
//	}
//	public static void main(String[] args) {
//		ListNode l1=new ListNode(67);
//		ListNode l2=new ListNode(78);
//		ListNode l3=new ListNode(21);
//		ListNode l4=new ListNode(90);
//		l1.next=l2;
//		l2.next=l3;
//		l3.next=l4;
//		l4.next=null;
//		ListNode temp=l1;
//		while(temp!=null) {
//			System.out.println(temp.val);
//			temp=temp.next;
//		}
//		
//	}
//}

//package practiceclass;
//
//public class ListNode {
//	int val;
//	ListNode next;
//	public ListNode(int x) {
//		this.val=x;
//		
//	}
//	public static void traverse(ListNode head) {
//		ListNode ptr=head;
//		while(ptr!=null) {
//			System.out.println(ptr.val);
//			ptr=ptr.next;
//			
//		}
//	}
//	public static void main(String[] args) {
//		ListNode l1=new ListNode(90);
//		ListNode l2=new ListNode(37);
//		ListNode l3=new ListNode(19);
//		ListNode l4=new ListNode(10);
//		l1.next=l2;
//		l2.next=l3;
//		l3.next=l4;
//		l4.next=null;
//		
//		//ListNode tr= new ListNode();//no
//		ListNode head=l1;
//		ListNode.traverse(head);
//		
//		}
//	}

//package practiceclass;
//
//
//public class ListNode {
//	int val;
//	ListNode next;
//	public ListNode(int x) {
//		this.val=x;
//	}
//		public static void traverse(ListNode head) {
//		ListNode ptr=head;
//		while(ptr!=null) {
//			System.out.println(ptr.val);
//			ptr=ptr.next;
//			
//	}
//		}
//	public static void main(String[] args) {
//		ListNode l1=new ListNode(90);
//		ListNode l2=new ListNode(37);
//		ListNode l3=new ListNode(19);
//		ListNode l4=new ListNode(10);
//		l1.next=l2;
//		l2.next=l3;
//		l3.next=l4;
//		l4.next=null;
//		
//	}
//		
//	}

package practiceclass;
public class ListNode {
	int val;
	ListNode next;
	public ListNode(int x) {
		this.val=x;}

	
	public ListNode insertAtBeg(ListNode head,int valToinsert) {
		ListNode newNode =new ListNode(valToinsert);
		newNode.next=head;
		head=newNode;
		return head;
		
	}
	public void traverse(ListNode head) {
		ListNode temp=head;
		while(temp!=null) {
			System.out.println(temp.val+ " ");
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		ListNode l1=new ListNode(34);
		ListNode l2=new ListNode(23);
		ListNode l3=new ListNode(67);
		ListNode l4=new ListNode(89);
		
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=null;
		
		ListNode ic=new ListNode(0);
		System.out.println("traversing elements before insertion");
		ListNode head=l1;
		ic.traverse(head);
		System.out.println();
		head=ic.insertAtBeg(head, l1);
		//ListNode head(l1);
		System.out.println("after insert at beg");
		ic.traverse(head);
		
		}
	}
	
	



















