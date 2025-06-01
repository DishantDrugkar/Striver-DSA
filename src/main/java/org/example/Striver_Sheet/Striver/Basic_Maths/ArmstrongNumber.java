package org.example.Striver_Sheet.Striver.Basic_Maths;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 3745;
        System.out.println(armstrong(num));
    }
    public static boolean armstrong(int num){
        int sum = 0;
        int originalNumber = num;
        while(num > 0){
            int lastdigit = num % 10;
            sum = sum + (lastdigit * lastdigit * lastdigit);
            num = num / 10;
        }
        if(originalNumber == sum){
            System.out.println("The number is Armstrong Number");
            return true;
        }
        return false;
    }
}
