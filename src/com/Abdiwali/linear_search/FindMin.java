package com.Abdiwali.linear_search;

public class FindMin {
    // assume arr.length != 0
    // return the minimum value in the array
    static int min(int[] arr){
        int ans=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
