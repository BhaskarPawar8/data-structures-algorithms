package src.Sorting;

public class BubbleSort {

    public static void main(String[] args) {

        int[] nums = {4,2,6,8,9,1,3};

        int size = nums.length;

        System.out.println("Before sorting");
        for (int n : nums){
            System.out.print(n + " ");
        }
        System.out.println("");

        int temp = 0;
        for(int i =0; i<size; i++){
            for(int j =0; j<size-i-1; j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums [j+1];
                    nums[j +1] = temp;
                }
            }
            System.out.println("during sorting");
            for (int n : nums){
                System.out.print(n + " ");
            }
        }



    }
}
