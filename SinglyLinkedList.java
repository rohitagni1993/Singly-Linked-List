import java.util.*;

//DS to create the node
class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}



public class SinglyLinkedList {
	
	static Node head;
	
	//check if list is empty
	public static boolean isEmpty(){
		if (head == null)
			return true;
		else
			return false;
	}
	
	//To insert at the Beginning
	public static void insertAtBeginning(int value){
		Node ptr = new Node(value);
		ptr.next = head;
		head = ptr;
		System.out.println("Inserted "+ptr.data+"\n\n");
	}
	
	
	//To insert values at the end of the list
		public static void insertAtEnd(int data){
				
			Node ptr = new Node(data);
			Node loc;
			
			if (isEmpty())
				head = ptr;
			else{
				for (loc = head ; loc.next != null ; loc = loc.next);
				loc.next = ptr;
			}

			System.out.println("Inserted "+ptr.data+"\n\n");
		}
	

		
		
	//To display the entire list
	public static void viewList(Node head){
		if (isEmpty()){
			System.out.println("List is empty!\n\n");
			return;
		}
		else{
			Node ptr;
			System.out.println("The list is: ");
			for (ptr = head ; ptr != null ; ptr = ptr.next)
				System.out.print(ptr.data+" ");
			System.out.println("\n\n");
		}
	}
	
	public static Node search(int n){
		Node ptr;
		for (ptr = head ; ptr != null ; ptr = ptr.next){
			if (ptr.data == n)
				return ptr;
		}
		return null;
	}
	
	public static void delete(int n){
		Node ptr = search(n);
		if (ptr == null){
			System.out.println("Not Found!\n\n");
			return;
		}
		else if (ptr == head)
			head = head.next;
		else{
			Node loc;
			for (loc = head ; loc.next != ptr ; loc = loc.next);
			loc.next = ptr.next;
		}
		ptr = null;	
	}
	
	
	//main method
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("---MENU---\n");
			System.out.println("1: Insert at beginning");
			System.out.println("2: Insert at end");
			System.out.println("3: View List");
			System.out.println("4: Delete a node");
			System.out.println("5: Exit\n");
			System.out.println("Please enter your choice number: ");
			
			int choice = sc.nextInt();
			
			switch(choice){
			
			case 1: System.out.println("Enter a value: ");
					int val = sc.nextInt();
					insertAtBeginning(val);
					break;
			
			case 2: System.out.println("Enter value: ");
					int data = sc.nextInt();
					insertAtEnd(data);
					break;
			
			case 3:	viewList(head);
					break;	
					
			case 4: if (isEmpty()){
						System.out.println("List Empty!!\n\n");
					}
					else{
						System.out.println("Enter the value you want to delete: ");
				        int num = sc.nextInt();
				        delete(num);
		        		break;
					}
			        
			case 5: sc.close();
					System.exit(0);
					break;
					
			default: System.out.println("Enter a valid choice!\n\n");
					 break;
			}
		}
	}
}
