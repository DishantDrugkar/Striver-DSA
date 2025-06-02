package org.example.Striver_Sheet.Striver.array;

public class RotateArray {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;
       rotate(nums, k);
       for(int i=0; i<nums.length; i++){
           System.out.print(nums[i] + " ");
       }
    }
    public static void rotate(int nums[], int k){
        k = k % nums.length;
        int n = nums.length;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }

    public static void reverse(int nums[], int start, int end){
        while(start <= end){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
    }
}
