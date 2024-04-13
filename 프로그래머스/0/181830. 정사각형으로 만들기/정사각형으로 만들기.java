import java.util.*;

class Solution {
    public int[][] solution(int[][] arr) {
        int lowLen = arr.length;
        int columnLen = arr[0].length;
        int n = Math.max(lowLen, columnLen);

        int[][] newArr = new int[n][n];
        
        for(int i = 0; i < lowLen; i++){
           newArr[i] = Arrays.copyOf(arr[i], n); 
        }
        return newArr;
    }
}