import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // 방법 2 : 배열을 0부터 2가 나오는 곳까지 순회, 2가 나오면 break;
        // 그때 인덱스 저장
        // 배열을 끝부터 2가 나올 때까지 1씩 감소하면서 순회
        // 2가 나온 인덱스 저장, break;
        // 두 인덱스에 해당하는 arr 부분 리턴
        boolean isTwo = false;
        int fir = 0;
        int end = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2) {
                fir = i;
                isTwo = true;
                break;
            }
        }

        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] == 2){
                end = i;
                break;
            }
        }

        if(!isTwo) {
            return new int[]{-1};  // 배열 리턴할 때 주의!
        }

        return Arrays.copyOfRange(arr, fir, end+1);
    }
}