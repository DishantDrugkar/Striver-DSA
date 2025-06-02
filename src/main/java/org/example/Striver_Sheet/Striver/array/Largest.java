package org.example.Striver_Sheet.Striver.array;

public class Largest {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,9,0};
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
