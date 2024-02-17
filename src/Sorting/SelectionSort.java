package src.Sorting;

public class SelectionSort {

    public static void main(String[] args) {

        int[] nums = {4, 2, 6, 8, 9, 1, 3};

        int size = nums.length;
        int minIndex =-1;

        System.out.println("Before sorting");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println("");

        for(int i=0; i < size-1 ; i++){
            minIndex = i;
            for(int j=i+1; j < size ; j++){
                if(nums[minIndex] > nums[j]){
                    minIndex =j;
                }
            }

            int temp = nums [i];
            nums[i] = nums [minIndex];
            nums [minIndex] = temp;

            System.out.println("during sorting");
            for (int n : nums) {
                System.out.print(n + " ");
            }
        }



    }
}
