import java.util.*;
public class SmallestNumber {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     System.out.println("array size:" + n);
     int[] arr = new int[n];
     for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();


     }

     smallestNumber(arr, n);
     largestNumber(arr, n);
 }
     public static void smallestNumber(int[] arr, int n){
         int smallest = arr[0];

         for (int i = 1; i < n; i++) {
             if (arr[i] < smallest) {
                 smallest = arr[i];
             }
         }


         System.out.println("Smallest number: " + smallest);
     }
     public static void largestNumber(int[] arr, int n){
         int largest = arr[0];

         for (int i = 1; i < n; i++) {
             if (arr[i] > largest) {
                 largest = arr[i];
             }
         }


         System.out.println("largest number: " + largest);
     }
 }


