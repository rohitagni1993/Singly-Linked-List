import java.util.*;

//DS to create the node
class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
	}
}



public class SinglyLinkedList {
	
	//To display the entire list
	public static void viewList(Node head){
		if (head == null){
			System.out.println("List is empty!\n");
			return;
		}
		else{
			Node ptr;
			for (ptr = head ; ptr.next != null ; ptr = ptr.next)
				System.out.print(ptr+" ");
		}
	}
	
	//To insert values at the end of the list
	public static void insertAtEnd(Node head, int data){
			
		Node ptr = new Node(data);
		Node loc;
		
		if (head == null)
			head = ptr;
		else{
			for (loc = head ; loc.next != null ; loc = loc.next);
			loc.next = ptr;
		}
	}
	
	//main method
	public static void main(String args[]){
		Node head = null;
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("---MENU---\n");
			System.out.println("1: Insert at beginning");
			System.out.println("2: Insert at end");
			System.out.println("3: View List");
			System.out.println("4: Exit\n");
			System.out.println("Please enter your choice number: ");
			
			int choice = sc.nextInt();
			
			switch(choice){
			
			case 1: System.out.println("Insert at beginning selected\n");
					break;
			
			case 2: System.out.println("Enter value: ");
					int data = sc.nextInt();
					insertAtEnd(head,data);
					break;
			
			case 3:	viewList(head);
					break;
			
			case 4: sc.close();
					System.exit(0);
					break;
			}
		}
	}
}
