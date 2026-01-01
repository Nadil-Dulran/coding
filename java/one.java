import java.util.Arrays;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        Integer[] arr1={5,3,8,90,65,7,4,5,6,97,4,2,8};
        Integer max=arr1[0];
        Integer maxindex=0;
                Integer sum=0;

        
        for(Integer i=0; i<arr1.length; i++){
            if(max<arr1[i]){
                max=arr1[i];
                maxindex=i;
            }
            sum+=arr1[i];
        }
        
       System.out.println("Max num of the Array:" +max);
              System.out.println("Max num:" +max +"'s index:" +maxindex);
              
                            System.out.println("Total of the Array:" +sum);

        
        Arrays.sort(arr1);
        
        System.out.println("Sorted Array:" +Arrays.toString(arr1));
        
        
        Arrays.sort(arr1, Collections.reverseOrder());
        
        System.out.println("Reversed Sorted Array:" +Arrays.toString(arr1));
    }
}