class Solution {
    public int[] solution(int[] arr) {
        // arr 을 for문으로 돌면서 if 문으로 판별
        // 50보다 크거나 같은 짝수 -> arr[i] / 2
        // 50보다 작은 홀수 -> arr[i] * 2

        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 50 && arr[i] % 2 == 0){
                arr[i] /= 2;  // arr[i] = arr[i] / 2
            } else if(arr[i] < 50 && arr[i] % 2 == 1){
                arr[i] *= 2;
            }
        }
        return arr;
    }
}