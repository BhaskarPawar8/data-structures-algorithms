package src.SearchDemo;

public class LinearSearch {
    // workes on sorted or unsorted array, doesnt matter as it has to traverse entire array
    public static int performLinearSearch(int[] inputvalues, int search){
        int stepsTaken =0;
        for(int i=0; i < inputvalues.length; i++){
            stepsTaken ++;
            if(inputvalues[i] == search){
                System.out.println("Total steps taken by linear search: " + stepsTaken);
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] samplevalues = {4,6,9,34,56};
        int searchValue=34;

        int result = performLinearSearch(samplevalues, searchValue);

        if(result != -1)
            System.out.println("Returned value's index from the search: " + result);
        else
            System.out.println("Values not found.");
    }
}
