package expedia;

import java.util.Scanner;

class Node {
	int data;
	Node next;
	
	Node(int data) {
		this.data = data;
	}
}

class LinkedList {
	Node head;
	
	LinkedList() {
		head = null;
	}
	
	public void addNode(int item) {
		
		if (head == null) {
			head = new Node(item);
		} else {
			Node start = head;
			
			while (head != null && head.next != null) {
				head = head.next;
			}
			
			head.next = new Node(item);
			head = start;
		}
	}
	
	
	public void printList() {
		Node start = head;
		
		while (head != null) {
			if (head.next == null) {
				System.out.print(head.data);
			} else {
				System.out.print(head.data + "->");
			}
			head = head.next;
		}
		
		System.out.println();
		head = start;
	}
	
	public void deleteNodesGreaterThanX(int x) {
		Node start = head;
		Node prevNode = head;
		
		while (head != null) {
			
			if (head.data > x && prevNode.equals(head)) {
				//System.out.println("head > x & head=prev " + head.data);
				head = head.next;
				start = head;
				prevNode = head;
				
			} else if (head.data > x) {
				//System.out.println("head > x " + head.data);
				prevNode.next = head.next;
				head = prevNode;
				
				prevNode = head;
				head = head.next;
			} else {
				//System.out.println("next.." + head.data);
				
				prevNode = head;
				head = head.next;
			}
			
		}
		
		head = start;
	}
}

public class DeleteNodesGreaterThanX {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of nodes for LinkedList: ");
		int x = in.nextInt();
		System.out.println("Enter the nodes: ");
		while (x-- > 0) {
			int inp = in.nextInt();
			list.addNode(inp);
		}
		
		list.printList();
		list.deleteNodesGreaterThanX(in.nextInt());
		list.printList();
		
	}

}
