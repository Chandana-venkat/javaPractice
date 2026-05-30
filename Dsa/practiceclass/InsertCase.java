//package practiceclass;
//
//public class InsertCase {
//	public ListNode insertAtBeg(ListNode head,int valToInsert) {
//		ListNode newNode =new ListNode(valToInsert);
//		newNode.next=head;
//		head=newNode;
//		return head;
//		
//	}
//	public void traverse(ListNode head) {
//		ListNode temp=head;
//		while(temp!=null) {
//			System.out.println(temp.val+ " ");
//			temp=temp.next;
//		}
//	} 
//	
//	public static void main(String[] args) {
//		
//		ListNode l1=new ListNode(34);
//		ListNode l2=new ListNode(23);
//        ListNode l3=new ListNode(67);
//		ListNode l4=new ListNode(89);
//		
//		l1.next=l2;
//		l2.next=l3;
//		l3.next=l4;
//		l4.next=null;
//		
//		InsertCase ic=new InsertCase();
//		System.out.println("traversing elements before insertion");
//		ListNode head=l1;
//		ic.traverse(head);
//	System.out.println();
//	
//		head =ic.insertAtBeg(head,11);
//		System.out.println("after insert at beg");
//		ic.traverse(head);
//		
//	}
//}

//package practiceclass;
//
//public class InsertCase {
//	public ListNode insertAtBeg(ListNode head, int valToInsert) {
//		ListNode newNode = new ListNode(valToInsert);
//		newNode.next = head;
//		head = newNode;
//		return head;
//
//	}
//
//	public ListNode insertAtPos(ListNode head, int valToInsert, int pos) {
//		ListNode newNode = new ListNode(valToInsert);
//		ListNode ptr = head;
//		for (int i = 1; i < pos - 1; i++) {
//			ptr = ptr.next;
//		}
//		newNode.next = ptr.next;
//		ptr.next = newNode;
//		return head;
//	}
//
//	public void traverse(ListNode head) {
//		ListNode temp = head;
//		while (temp != null) {
//			System.out.print(temp.val + " ");
//			temp = temp.next;
//		}
//	}
//
//	public static void main(String[] args) {
//
//		ListNode l1 = new ListNode(34);
//		ListNode l2 = new ListNode(23);
//		ListNode l3 = new ListNode(67);
//		ListNode l4 = new ListNode(89);
//
//		l1.next = l2;
//		l2.next = l3;
//		l3.next = l4;
//		l4.next = null;
//
//		InsertCase ic = new InsertCase();
//		System.out.println("traversing elements before insertion");
//		ListNode head = l1;
//		ic.traverse(head);
//		System.out.println();
//
//		head = ic.insertAtBeg(head, 12);
//		System.out.println("after insert at beg");
//		ic.traverse(head);
//		System.out.println("Inserting at particular position :");
//		ic.insertAtPos(head, 78, 3);
//		System.out.println();
//		ic.traverse(head);
//
//	}
//}
//insert at the end;//wrong
//package practiceclass;
//public class InsertCase {
//	public ListNode insertAtBeg(ListNode head, int valToInsert) {
//		ListNode newNode = new ListNode(valToInsert);
//		newNode.next = head;
//		head = newNode;
//		return head;
//}
//
//public ListNode insertAtPos(ListNode head, int valToInsert, int pos) {
//		ListNode newNode = new ListNode(valToInsert);
//		ListNode ptr = head;
//		for (int i = 1; i < pos - 1; i++) {
//			ptr = ptr.next;
//		}
//		newNode.next = ptr.next;
//		ptr.next = newNode;
//		return head;
//	}
//
//	public ListNode insertAtEnd(ListNode head, int valToInsert){
//		ListNode ic=new ListNode(0);
//		
//		ListNode ptr=head;
//		while(ptr.next!=null) {
//			ptr=ptr.next;
//			
//		}
//		ptr.next=newNode;
//		
//		
//		return head;
//	}
//	public void traverse(ListNode head) {
//		ListNode temp = head;
//		while (temp != null) {
//			System.out.print(temp.val + " ");
//			temp = temp.next;
//		}
//	}
//
//	public static void main(String[] args) {
//
//		ListNode l1 = new ListNode(34);
//		ListNode l2 = new ListNode(23);
//		ListNode l3 = new ListNode(67);
//		ListNode l4 = new ListNode(89);
//
//		l1.next = l2;
//		l2.next = l3;
//		l3.next = l4;
//		l4.next = null;
//
//		InsertCase ic = new InsertCase();
//		System.out.println("traversing elements before insertion");
//		ListNode head = l1;
//		ic.traverse(head);
//		System.out.println();
//
//		head = ic.insertAtBeg(head, 12);
//		System.out.println("after insert at begining");
//		ic.traverse(head);
//		System.out.println("Inserting at particular position :");
//		ic.insertAtPos(head, 78, 3);
//		System.out.println();
//		ic.traverse(head);
//		
//		ic.insertAtEnd(head, 99);
//		System.out.println();
//		ic.traverse(head);
//
//	}
//}





























