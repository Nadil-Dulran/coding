class Solution {
    public static void main(String[] args) {

        String str1 = "madam";   // input string
        String reverse = "";

        // Reverse the string
        for (int i = str1.length() - 1; i >= 0; i--) {
            reverse = reverse + str1.charAt(i);
        }

        // Check palindrome
        boolean palindrome = str1.equals(reverse);

        if (palindrome) {
            System.out.println("Palindrome string");
        } else {
            System.out.println("Not a palindrome string");
        }
    }
}
