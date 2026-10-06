import java.util.ArrayList;
import java.util.Collections;
class Main {
    public static void swap(ArrayList<Integer> list, int a, Integer b){
        int temp=list.get(a);
        list.set(a,list.get(b));
        list.set(b,temp);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(1);
    
        System.out.println("DISPLAY ARRAYLIST: "+list);

        System.out.println("GET ELEMENT OF 2nd INDEX: "+list.get(2));

        list.set(2,20);
        System.out.println("UPDATE ELEMENT OF 2nd INDEX: "+list);

        list.remove(2);
        System.out.println("DELETE ELEMENT OF 2nd INDEX: "+ list);

        System.out.println("SIZE OF ARRAYLIST: "+list.size());

        System.out.println("CHECK 5 IS PRESENT OR NOT: "+ list.contains(5));

        System.out.println("PRINT ARRAYLIST USING FOR LOOP: ");
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();

        int max= Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
        }
        System.out.println("FIND MAX ELEMENT: "+max);

        for(int i=0; i<list.size(); i++){
            max=Math.max(max, list.get(i));
        }
        System.out.println("FIND MAX ELEMENT USING MAX FUNCTION: "+max);

        int ind1=1, ind2=3;
        swap(list, ind1, ind2);
        System.out.println("SWAP ARRAYLIST ELEMENTS OF GIVEN INDEX: "+list);

        Collections.sort(list);
        System.out.println("SORT ARRAYLIST IN ASSENDING ORDER: "+list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("SORT AL IN DESCENDING ORDER: "+list); 
    }
}
