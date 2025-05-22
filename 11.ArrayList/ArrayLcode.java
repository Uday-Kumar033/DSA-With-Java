import java.util.ArrayList;
import java.util.Collection;

class ArrayLcode{
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<Integer>();
       // Arraylist <String>  str  = new Arraylist <String>():
       // Arraylist<Boolean>  bool = new Arraylist <Boolean>():
       list.add(4);//add elements to the list
       list.add(5);
       list.add(9);
       list.add(2);
       System.out.println(list);
       //to get element from array
       int element = list.get(0);
       System.out.println(element);
       //add element in between list
       list.add(2,5);
       System.out.println(list);
       //delete element from  array list
       list.remove(2);
       System.out.println(list);
       // set the list
       list.set(0,5);
       // getting size of list
       int size = list.size();
       System.out.println(size);
       //loop on list
       for(int i = 0; i<list.size();i++){
        System.out.print(list.get(i) +" ");
       }
       //Sorting of list
      // list.add(0);
      //int sorting =Collections.sort(list);
      // System.out.println(sorting);
     }
}