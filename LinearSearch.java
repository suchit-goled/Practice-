public class LinearSearch {

    public static void main(String[] args) {

        int nums[] = {5, 6, 7, 12, 14, 15, 17};

        int target = 14;


        int result=linearsSearch(nums, target);

        if(result!=1)
            System.out.println("element found at index"+result);
        else
            System.out.println("element not found");
    }
    public  static int linearsSearch(int[] nums, int target) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                return i;
            }

        }
        return -1;
    }

}
