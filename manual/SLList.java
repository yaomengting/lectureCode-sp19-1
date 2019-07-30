public class SLList{
	private static class IntNode{
		public int item;
		public IntNode next;

		public IntNode(int i, IntNode n){
			item = i;
			next = n;
		}
	}

	private IntNode first;

	public SLList(int x){
		first = new IntNode(x, null);
	}

	/** Adds x to the front of the list. */
	public void addFirst(int x){
		first = new IntNode(x, first);
	}

	/** Returns the first item in the list */
	public int getFirst(){
		return first.item;
	}

	public void addLast(int x){
		IntNode p = first;

		while(p.next != null){
			p = p.next;
		}

		p.next = new IntNode(x, null);
	}

	public int size(IntNode p){
		if(p.next == null){
			return 1;
		}
		return 1 + size(p.next);
	}

	public int size(){
		return size(first);

	}


	public static void main(String[] args){
		/* Creates a list of one integer, namely 10 */
		SLList L = new SLList(15);
		L.addFirst(10);
		L.addLast(5);
		L.addLast(20);
		System.out.println(L.getFirst());
		System.out.println(L.size());
	}

}