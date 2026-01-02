import java.util.*;

class Main{
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(6,7,8,3,2,5,8,9,12);
        Integer sum=0;
        
    Collections.sort(numbers);
    System.out.println("Sorted List: " +numbers);
        
    Collections.reverse(numbers);
    System.out.println("Reversed List: " +numbers);
    
    Integer max= Collections.max(numbers);
    System.out.println("Max element in the List: " +max);

    Integer min= Collections.min(numbers);
    System.out.println("Min element in the List:" +min);
    
    for(int i=0; i<numbers.size(); i++){
        sum+=numbers.get(i);
    }
    System.out.println("Sum of the List: " +sum);


    }
    
}