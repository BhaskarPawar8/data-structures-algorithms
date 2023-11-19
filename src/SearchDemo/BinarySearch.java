package src.SearchDemo;

public class BinarySearch {
// workes on sorted array only
    public static int performBinarySearch(int[] inputvalues, int search){
     //   4,6,9,34,56,70,87,99
        int left =0;
        int right = inputvalues.length -1;

        int stepsTaken =0;
        while (left <= right) {
            stepsTaken ++;
            int mid = (left + right) /2;
            if (inputvalues[mid] == search) {
                System.out.println("Total steps taken by binary search: " + stepsTaken);
                return mid;
            } else if (inputvalues[mid] < search)
            {
                left = mid + 1;
            }
            else
                right = mid - 1;
        }
        System.out.println("Total steps taken by binary search: " + stepsTaken);
        return -1;
    }

    public static void main(String[] args) {

        int[] samplevalues = {4,6,9,34,56};
        int searchValue=34;

        int result = performBinarySearch(samplevalues, searchValue);

        if(result != -1)
            System.out.println("Returned value's index from the search: " + result);
        else
            System.out.println("Values not found.");
    }
}
