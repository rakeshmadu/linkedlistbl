package com.linkedList;

public class LinkedListServices {
	
	Node head = null;

	public void insertAtHead(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}
	
	public void append(int value) {
		Node currentNode = head;
		Node newNode = new Node(value);
		
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}		
		
		currentNode.next = newNode;
	}
	
	public void insertBetween(int before, int value) {
		Node currentNode = head;
		Node newNode = new Node(value);
		
		while(currentNode.data != before) {
			currentNode = currentNode.next;
		}
		
		newNode.next = currentNode.next;
		currentNode.next = newNode;
		
	}
	
	public void displayLinkedList() {
		Node currentNode = head;
		
		while(currentNode != null) {
			System.out.print(" " + currentNode.data);
			currentNode = currentNode.next;
		}
		
		System.out.println();
	}
}
