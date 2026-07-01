import java.util.ArrayList;
import java.util.Collection;
import java.util.*;
public class ArrayLists {
    public static void main (String[] args){
        //defining the array  list using the preexisting class called ArrayList or creating the instance
        //it has method like add,get,remove,set(modifying values at index),size
      ArrayList<Integer> list1= new ArrayList<Integer>();

        //adding elements in list
        System.out.println("adding elements in list");
      list1.add(0);
      list1.add(2);
      list1.add(3);

        System.out.println(list1);

        // getting elements in list using index value
      int element=list1.get(0);
        System.out.println("getting value at index 0");
        System.out.println(element);

        //add elements in between
        list1.add(1,1);
        System.out.println("adding elements at index");
        System.out.println(list1);

        //set element
        list1.set(0,5);
        System.out.println("modifying elements at index 0");
        System.out.println(list1);

        list1.remove(3);
        System.out.println("removing the element ");
        System.out.println(list1);

        //printing the size of the  list
        int size=list1.size();
        System.out.println("printing size of the list");
        System.out.println(size);

        //looping the arraylist
        System.out.println("printing elements in array using loops");
        for(int i=0;i<size;i++){

            System.out.print(list1.get(i)+" ");
        }

        //sorting the elements
        System.out.println("");
        System.out.println("sorting the elements using collection");

        Collections.sort(list1);
        System.out.println(list1);
    }
}
