package com.stayready;

import java.util.ArrayList;

public class Problem02 {

    //create an array list that holds values
    static int findLongestConseSequ(int arr[]) {

        //create an array
        ArrayList<Integer> Array= new ArrayList<>();
        int ans =0;

        //Hash all the array elements
        int n = arr.length;
        for (int i = 0; i< n; ++i)
            Array.add(arr[i]);

        //check the sequence from the start
        for (int i = 0; i < n; ++i) {

            // net element in the sequence
            if (!Array.contains(arr[i] - 1)) {
                int j = arr[i];
                while (Array.contains(j))
                    j++;

                // update  optimal length if this more
                if (ans < j - arr[i])
                    ans = j - arr[i];
            }
        }
        return ans;

    }
}
