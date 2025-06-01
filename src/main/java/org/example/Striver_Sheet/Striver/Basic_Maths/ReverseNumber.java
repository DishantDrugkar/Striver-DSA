package org.example.Striver_Sheet.Striver.Basic_Maths;

public class ReverseNumber {
    public static void main(String[] args) {

        int num = 12345;
        System.out.println("The Reverse number is : " + reverse(num));
    }
    public static int reverse(int num){
        int RevNum  = 0 ;
        while(num > 0){
            int lastDigit = num % 10;
            RevNum = RevNum * 10 + lastDigit;
            num = num / 10;
        }
        return RevNum;
    }
}
