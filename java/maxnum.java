class Main{
   public static void main(String[] args) {
       Integer[] arr1={2,7,8,4,6,9,3,5,6,7};

       int max=arr1[0];
       int maxindex=0;

       for(int i=0; i<arr1.length; i++){
        if(max< arr1[i]){
            max=arr1[i];
            maxindex=i;
        }
       }
       System.out.println("Max number is: " +max);
       System.out.println("Max number " +max +"'s index is: " +maxindex);
   }
} 
