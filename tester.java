package linkedList;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList ll = new LinkedList();
		/*ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);*/
		
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		//ll.removeFirst();
		ll.removeLast();
		
		System.out.println(ll.isEmpty());
		System.out.println(ll.size());
		System.out.println(ll.toString());
	}

}
