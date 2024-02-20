//Coding Ninja



import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

 

  public static ArrayList < Double > findMedian(ArrayList < Integer > arr, int n, int k) {

   ArrayList<Double> res=new ArrayList<Double>();

        for (int i = 0; i <= n - k; i++) {

            int[] window = new int[k];

            for (int j = 0; j < k; j++) {

                window[j] = arr.get(i+j);

            }

            Arrays.sort(window);

            double median=0.0;

            if (k % 2 == 0) {

                median = (window[k / 2 - 1] + window[k / 2]) / 2.0;

            } else {

                median = window[k / 2];

            }

            res.add(median);

  }

  return res;

}

 

}