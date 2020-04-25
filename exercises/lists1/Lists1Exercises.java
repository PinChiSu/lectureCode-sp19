public class Lists1Exercises {
    /** Returns an IntList identical to L, but with
      * each element incremented by x. L is not allowed
      * to change. */
    public static IntList incrList(IntList L, int x) {
        /* Your code here. */
        //use L1 to remember the origin L's address,and use iterative:))
        IntList L1 = L;
        int j = L1.size() - 1;
        for(int i = 0; i < L1.size(); i++){
            if(i == 0){
                L = new IntList(L1.get(j) + x, null);
                j--;
                continue;
            }
            else{
                L = new IntList(L1.get(j) + x, L);
                j--;
            }
        }
        
        return L;        
    }

    /** Returns an IntList identical to L, but with
      * each element incremented by x. Not allowed to use
      * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        /* Your code here. */
        //creat a IntList L1 to remember the origin L's address,after iterative,let L equals L1~
        IntList L1 = L;
        while(L != null){
            L.first += x;
            L = L.rest;
        }
        L = L1;
        return L;
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);
        System.out.println(dincrList(L, 3));
        //System.out.println(L.iterativeSize());

        // Test your answers by uncommenting. Or copy and paste the
        // code for incrList and dincrList into IntList.java and
        // run it in the visualizer.
         System.out.println(L.get(1));
        // System.out.println(incrList(L, 3));
        // System.out.println(dincrList(L, 3));        
    }
}