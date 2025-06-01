package org.example.Striver_Sheet.Striver.Basic_Maths;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {12,45,7,8,99,99,5,6};
        System.out.println("The Largest Number is : " + getLargest(arr));
        System.out.println("The Second Largest Number is : " + getSecLargest(arr));
    }
    public static int getLargest(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int getSecLargest(int arr[]){
        int largest = getLargest(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i] == largest){
                arr[i] = -1;
            }
        }
        int secMax = getLargest(arr);
        return secMax;
    }
}
