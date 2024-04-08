import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] lenArr = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        int[] result = {}; 
        for (int i = 0; i < lenArr.length; i++) {
            if (arr.length < lenArr[i]) { 
                return Arrays.copyOf(arr, lenArr[i]);
            } else if (arr.length == lenArr[i]) {
                return arr;
            }
        }
        return result; 
    }
}