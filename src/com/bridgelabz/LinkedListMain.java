package com.bridgelabz;

public class LinkedListMain {

	public static void main(String[] args) {

		LinkedList<Integer> linkedList1 = new LinkedList<>();

		linkedList1.add(70);
		linkedList1.add(30);
		linkedList1.add(56);

		linkedList1.display();
		System.out.println();

		LinkedList<Integer> linkedList2 = new LinkedList<>();
		linkedList2.append(56);
		linkedList2.append(30);
		linkedList2.append(70);

		linkedList2.display();
		System.out.println();

		System.out.println("Element popped from head => " + linkedList2.pop());
		linkedList2.display();
		linkedList2.add(56);
		linkedList2.display();
		System.out.println();

		System.out.println("Element popped from last => " + linkedList2.popLast());
		linkedList2.display();

		linkedList2.append(70);
		linkedList2.display();
		System.out.println();
		Node<Integer> node = linkedList2.search(30);
		if (node != null) {
			System.out.println("Element is Found");
			linkedList2.display();
		} else {
			System.out.println("Element is not Found");
		}

	}
}