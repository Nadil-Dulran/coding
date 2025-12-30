import java.util.Arrays;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        Integer[] arr1={2,7,5,9,5,3,4};
        
        int max=arr1[0];
        int maxindex=0;
                for(int i=0; i<arr1.length; i++){
            if(max<arr1[i]){
                max=arr1[i];
                maxindex=i;

            }
        }
        
        Arrays.sort(arr1);
        System.out.println("Sorted Array:" +Arrays.toString(arr1));
        
        Arrays.sort(arr1, Collections.reverseOrder());
        System.out.println("Reversed Sorted Array:" +Arrays.toString(arr1));
        

     System.out.println("Max number of the Array:" +max);
          System.out.println("Max number:" +max +"'s index of the Array:" +maxindex);
    }
}