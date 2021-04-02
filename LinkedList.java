package linkedList;

public class LinkedList {
	private Node first;
	private Node last;
	private int size;

	private class Node{
		int data;
	    Node next;
		
		Node(int data){
			this.data = data;
		}
		
	}
	
	LinkedList(){
		size = 0;
		first = null;
	}
	
	public boolean addFirst(int value) {
		Node node = new Node(value);
		if(isEmpty()) {
			first = last = node;
		}
		else {
			node.next = first;
			first = node;
		}
		size++;
		return true;			
			
	}
	
	public boolean addLast(int value) {
		Node node = new Node(value);
		if(isEmpty())
			first = last = node;
		else {
			last.next = node;
			last = node;
		}
		size++;
		return true;
	}
	
	public int indexOf(int value) {
		int index = 0;
		Node current = first;
		if(isEmpty())
			return -2;
		else {
			while(current != null) {
				if(current.data == value)
					return index;
				index++;
				current = current.next;
			}
		}
		return -1;
	}
	
	public boolean removeFirst() {
		if(isEmpty())
			return false;
		else if(size == 1) 
			first = last = null;
		else {
			//first (remove->) second -> last
			Node second = first.next;
			first.next = null;
			first = second;
			//first = first.next;
		}
		size--;
		return true;
	}
	
	public boolean removeLast() {
		if(isEmpty())
			return false;
		else if(size == 1) 
			first = last = null;
		else {
			//10 -> 20 -> 30
			Node current = first;
			while(current.next != last) {
				current = current.next;
			}
			current.next = null;
		}
		size--;
		return true;
	}
	
	public boolean contains(int value) {
		if(isEmpty())
			return false;
		else {
			Node current = first;
			while(current != last) {
				if(current.data == value)
					return true;
				current = current.next;
			}
		}
		return false;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		if(size == 0)
			return true;
		else
			return false;
	}
	
	public void clear() {
		first = last = null;
	}
	
	public String toString() {
		String s = "[";
		Node current = first;
		for(int i = 0; i < size() - 1; i++) {
			s += current.data + " -> ";
			current = current.next;
		}
		s += current.data + "]";
		return s;
	}
}
