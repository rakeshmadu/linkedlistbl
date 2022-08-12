package com.linkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedListServices list = new LinkedListServices();
		
		list.insertAtHead(70);   //Node with data 70 is First Created
		list.insertAtHead(30);   //- Next 30 is added to 70
		list.insertAtHead(56);   //- Finally 56 is added to 30
		System.out.println("Linked List Sequence   :"); //- expected LinkedList Sequence: 56->30->70   

		list.displayLinkedList(); //displays output
		    

	}
}
