import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int[] preArr = {}; 
        int x = 0;

        while(!Arrays.equals(arr, preArr)) { 
            preArr = arr.clone();
            x++;
            for(int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }
        }
        return x-1;
    }
}