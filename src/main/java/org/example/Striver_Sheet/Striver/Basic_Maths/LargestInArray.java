package org.example.Striver_Sheet.Striver.Basic_Maths;

public class LargestInArray {
    public static void main(String[] args) {
        int arr[] = {7,2,5,3,8,1,9};
        System.out.println("The Largest Element is : " + getLargest(arr));
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
}
