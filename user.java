import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner Sc = new Scanner (System.in);

        System.out.print("Enter no. of  elements:");
        int n = Sc. nextInt();

        int[] arr1 = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for(int i=0; i<n; i++){
            arr1[i] = Sc. nextInt();

        }
        int sum=0;
        for (int i =0; i< arr1.length; i++){
            sum += arr1[i];
        }
        System.out.println("Sum of the array:" + sum);
        }
}