package Linkedlist;

public class Node {
	
	               int data;
	               Node next;
				   public Node(int data) {
					super();
					this.data = data;
					this.next=next;
				   }
	               
				   public Node() {
						super();
						this.data = data;
						this.next=next;
					   }
				      
				   
		 public  Node add(int a[]) {
					 Node head=new Node(a[0]);
				Node temp=head;
				
				while(temp.next!=null) {
					
					temp=temp.next;
					
					
				}
				return head;
					 
					 
				 }
		      public Node print(Node head) {
		    	  Node temp=head;
		    	  while(temp.next!=null) {
		    	 
		    	  temp=temp.next;
		    	  }
		    	  return head;
				
			}
				   
	   

}
