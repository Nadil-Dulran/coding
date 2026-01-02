

class Solution {
    public static void main(String[] args) {
        
        // Define an array
        int[] arr = {12, 45, 7, 89, 23, 56};

        // Assume first element is maximum
        int max = arr[0];
        int test=0;


        for(Integer i=0; i<arr.length; i++){
          if(max<arr[i]){
            max=arr[i];
            test=arr[i-1];

          }
        }

        // Print result
        System.out.println("Maximum element in the array is: " + max);
          System.out.println("Maximum -1 element in the array is: " +test);
    }
}