package com.linkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedListServices list = new LinkedListServices();
		
		list.insertAtHead(56);
		list.append(70);
		System.out.println("before inserting element between:");
		list.displayLinkedList();
		System.out.println("After inserting element between:");
		list.insertBetween(56, 30);
		list.displayLinkedList();
	}
}
