package src.Arrays;

/*Given an array, arr of positive integers. Find the third largest element in it. Return -1 if the third largest element is not found.

        Examples:

        Input: arr[] = [2, 4, 1, 3, 5]
        Output: 3
        Explanation: The third largest element in the array [2, 4, 1, 3, 5] is 3.
        Input: arr[] = [10, 2]
        Output: -1
        Explanation: There are less than three elements in the array, so the third largest element cannot be determined.
        Input: arr[] = [5, 5, 5]
        Output: 5
        Explanation: In the array [5, 5, 5], the third largest element can be considered 5, as there are no other distinct elements.*/
public class ThirdLargestElement {
    static int thirdLargest(int arr[]) {

        int size = arr.length;
        if(size == 0 || size < 3)
            return -1;

        int largest =-1;
        int secondLargest=-1;
        int thirdLargest=-1;

        for(int i =0; i < size; i++){
            if(arr[i] >= largest){
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = arr[i];

            }

            if(arr[i] >= secondLargest && arr[i] < largest){
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            }

            if(arr[i] >= thirdLargest && arr[i] < secondLargest){
                thirdLargest = arr[i];
            }
        }
        return thirdLargest;
    }

    public static void main(String[] args) {
        ThirdLargestElement thirdLargestElement = new ThirdLargestElement();
        int[] abc= {855, 450, 132, 359, 233, 825, 604, 481, 262 ,337 ,720 ,525, 652 ,300, 906, 219, 926, 906 ,293 ,864 ,817 ,498 ,30, 639 ,661};
        System.out.println(thirdLargestElement.thirdLargest(abc));

    }
}
