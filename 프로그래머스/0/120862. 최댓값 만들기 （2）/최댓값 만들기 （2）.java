import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        // 배열 중 가장 큰 수 2개의 곱
        Arrays.sort(numbers);
        
        int idx = numbers.length - 1;
        int ans1 = numbers[idx] * numbers[idx-1];
        int ans2 = numbers[0] * numbers[1];
        
        int result = ans1 > ans2 ? ans1 : ans2;
        
        return result;
    }
}