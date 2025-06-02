package org.example.Striver_Sheet.Striver.array;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,5,5,6,7,8,8,8};
        System.out.println(remove(arr));
    }
    public static int remove(int arr[]){
        if(arr.length == 0 ) return 0;
        int i =0;
        for(int j=1; j<arr.length; j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}
