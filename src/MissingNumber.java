package src.Sorting;

public class MissingNumber {

        static int missingNumber(int array[], int n) {

            int size = array.length;
            int temp =0;
            for(int i=0;i < size; i++){
                for(int j=0;j < size-i-1; j++) {
                    if(array[j] > array [j+1]){
                        temp = array[j];
                        array [j] = array[j+1];
                        array[j+1]= temp;
                    }
                }
            }

            System.out.println("Sorted array");
            for(int i=0;i<size;i++){
                System.out.print(array[i]);
            }


            for(int i=0;i<=size;i++){
                if(array[i] == i+1){
                    continue;
                }
                else
                    return i+1;
            }

            return -1;
    }

    public static void main(String[] args) {

        int[] nums = {6,1,2,8,3,4,7,10,5};

        int size = nums.length;

        int result = missingNumber(nums,size);
        System.out.println("Missing number:" + result);

    }
}
