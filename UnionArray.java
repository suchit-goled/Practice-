
import java.util.HashSet;

public class UnionArray {

    public static int addition(int[] arr1, int[] arr2){
        HashSet<Integer> set=new HashSet<>();

        for (int k : arr1) {

            set.add(k);
        }
        for (int j : arr2) {

            set.add(j);
        }
        return set.size();
    }

    public static void main(String[] args){

        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};

        System.out.println(addition(arr1,arr2));
    }
}
