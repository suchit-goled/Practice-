public class BubbleSort {

    public static void main(String[] args){
        int nums[]={8,3,5,2,6,1};
        int size= nums.length;
        int temp=0;

        //printing elements before sorting
        System.out.println("before sorting");
       //iterating through each element
        for(int num:nums){
            System.out.print(num + " " );

        }
        // it control the number of iterations
        for(int i=0;i<size;i++){
           //second itertions chechs each adjusant elements
            for(int j=0;j<size-i-1;j++){
                //chechk if element is greater than next num
                if(nums[j]>nums[j+1]){
                    //add the current value in tem
                    temp=nums[j];
                    //that index with less num
                    nums[j]=nums[j+1];
                    // and the index with greater num
                    nums[j+1]=temp;
                }
            }
        }
        System.out.println("");
        System.out.println("after sorting");
        for(int num:nums){
            System.out.print(num + " " );

        }
    }
}
