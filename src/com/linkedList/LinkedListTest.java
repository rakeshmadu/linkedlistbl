package com.linkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedListServices list = new LinkedListServices();
		
		list.insertAtHead(56);
		list.append(30); //append 
		list.append(70);
		
		System.out.println("Linked List Sequence   :");
		list.displayLinkedList();
	}
}
