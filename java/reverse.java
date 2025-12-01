import java.util.Arrays;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        Integer[] arr1= {1,9,6,4,8,3,9,2,8,};
        Arrays.sort(arr1, Collections.reverseOrder());

        System.out.println("Reversed Array:" + Arrays.toString(arr1));

    }
}