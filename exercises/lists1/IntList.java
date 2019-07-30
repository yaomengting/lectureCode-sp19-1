public class IntList {
	public int first;
	public IntList rest;

	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}
   public int size(){
	   if(rest == null){
		   return 1;
	   }
	   return 1 + this.rest.size();
   }

	public int iterativesize(){
		IntList P = this;
		int size = 0;
		while(P!= null){
			size++;
			P = P.rest;
		}

		return size;
	}
	/** iterative way to get the ith item of first value */
	public int get(int i){
		while(n>0 && L != null){
			n--;
			L = L.rest;
		}
		return L.first;
	}
	/** recursion to get the ith item of first value */
	public int get(int i){
		if(i == 0){
			return first;
		}

		return rest.get(i-1);
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
    public static IntList dincrList(IntList L, int x) {
		IntList C = L;
        while(C != null){
			C.first -= x;
			C = C.rest;
		}
		/* Your code here. */
        return L;
	
    }
      
    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);
       
       

        

        
       
        System.out.println(incrList(L, 3));
		System.out.println(dincrList(L, 3));
        System.out.println(L.size());  
		System.out.println(L.get(2));  

    }

} 