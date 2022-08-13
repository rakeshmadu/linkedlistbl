package com.linkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedListServices list = new LinkedListServices();
		
		list.insertAtHead(56);
		list.append(30);
		list.append(70);
		System.out.println("before deleting :");
		list.displayLinkedList();
		
		list.pop(); //pop element
		System.out.println("After deleting :");
		list.displayLinkedList();
	}
}
