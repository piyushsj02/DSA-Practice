// LeetCode -977
// Using Stream


import java.util.*;
class Solution {
    public int[] sortedSquares(int[] arr) {
  
        arr=Arrays.stream(arr).map(i->i*i).sorted().toArray();
        return arr;
    }
}
