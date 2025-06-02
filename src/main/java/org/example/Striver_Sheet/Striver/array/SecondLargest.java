package org.example.Striver_Sheet.Striver.array;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,4,5,6,7,7};
        System.out.println("The Largest Element is : " +  getLargest(arr));
        System.out.println("The Second Largest Element is : " +  secLargest(arr));
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

    public static int secLargest(int arr[]){
        int large = getLargest(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i] == large){
                arr[i] = -1;
            }
        }
        int secMax = getLargest(arr);
        return secMax;
    }
}
