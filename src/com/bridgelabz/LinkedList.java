package com.bridgelabz;

public class LinkedList<T> {
	Node<T> head;

	Node<T> tail;

	public void add(T data) {
		Node<T> newNode = new Node<>(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
	}

	public void display() {
		Node<T> temp = head;
		if (head == null) {
			System.out.println("Linked List is empty");
		}
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
	}

	public void append(T data) {
		Node<T> newNode = new Node<>(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {

			tail.setNext(newNode);
			tail = newNode;
		}
	}

	public T pop() {
		T temp = head.getData();
		head = head.getNext();
		return temp;
	}

	public T popLast() {
		T temp = tail.getData();
		Node<T> secondLast = head;
		while (secondLast.getNext() != tail) {
			secondLast = secondLast.getNext();
		}
		secondLast.setNext(null);
		tail = secondLast;
		return temp;
	}

	public Node<T> search(T searchData) {
		Node<T> temp = head;
		while (temp != null) {
			if (temp.getData().equals(searchData)) {
				return temp;
			}
			temp = temp.getNext();
		}
		return null;

	}
}
