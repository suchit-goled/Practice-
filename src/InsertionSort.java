public class InsertionSort {

        public static void main(String[] args){
            int nums[]={8,3,5,2,6,1};
            int size= nums.length;
            int temp=0;


            System.out.println("before sorting");
            for(int num:nums){
                System.out.print(num + " " );

            }
            for(int i=1;i<size;i++){
                int key=nums[i];
                int j=i-1;

                while(j >= 0 && nums[j] > key){
                    nums[j+1]=nums[j];
                    j=j-1;
                }
                nums[j+1]=key;
            }
            System.out.println(" ");
            System.out.println("after sorting");
            for(int num:nums){
                System.out.print(num + " " );

            }
        }
    }


