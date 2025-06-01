package org.example.Striver_Sheet.Striver.Basic_Maths;

public class CountDigits {
    public static void main(String[] args) {
        int num = 21;
        System.out.println("The count Digit of this number is : " + count(num));
    }

    public static int count(int num){
        int sum = 0;
        while(num > 0){
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;
        }
        return sum;
    }
}
