package org.example.Striver_Sheet.Striver.array;

public class SortedArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        System.out.println(isSorted(arr));
    }
    public static boolean isSorted(int arr[]){
        for(int i=1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
