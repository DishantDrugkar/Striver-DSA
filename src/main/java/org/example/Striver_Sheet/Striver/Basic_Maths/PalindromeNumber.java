package org.example.Striver_Sheet.Striver.Basic_Maths;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 12321;
        System.out.println(isPalindrome(num));
    }
    public static boolean isPalindrome(int num){
        int reverse = 0;
        int originalNumber = num;
        while(num > 0){
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }
        if(originalNumber == reverse){
            System.out.println("The Number is Palindrome");
            return true;
        }
        return false;
    }
}
