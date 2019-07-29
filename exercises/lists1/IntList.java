public class IntList {
	public int first;
	public IntList rest;

	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}
   public IntList() {
	}


	
    /** Returns an IntList identical to L, but with
      * each element incremented by x. L is not allowed
      * to change. */
    public static IntList incrList(IntList L, int x) {
        /* Your code here. */
        IntList R= null;
		IntList last= null;

		while(L != null){
			IntList newItem = new IntList();
			newItem.first = L.first + x;
			if(R == null){
				R = newItem;
			}else{
				last.rest = newItem;
			}
			last = newItem;
			L = L.rest;
		}
		return R;        
    }

    /** Returns an IntList identical to L, but with
      * each element incremented by x. Not allowed to use
      * the 'new' keyword. */
   
      
    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);
       
       

        

        
       
        System.out.println(incrList(L, 3));
               
    }

} 