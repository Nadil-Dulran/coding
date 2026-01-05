import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        
        // Define an array
        int[] arr = {12, 45, 7, 89, 23, 56};

        // Normal Array
        System.out.println("Array:" +Arrays.toString(arr));

        // Assume first element is maximum
        int max = arr[0];
        int test= arr[0];


        for(Integer i=0; i<arr.length; i++){
          if(max<arr[i]){
            max=arr[i];
          }
        else if (arr[i] > test && arr[i] != max) {
                test = arr[i];  // update second max
            }
        }

        // Print result
        System.out.println("Maximum element in the array is: " + max);
          System.out.println("Second Maximum element in the array is: " +test);
    }
}