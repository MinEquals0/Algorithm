class Solution {
    public int[] solution(int[] arr) {
       int len = 0;
       int idx = 0;

        for(int i = 0; i < arr.length; i++){
            len += arr[i];
        }

        int[] x = new int[len];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i]; j++){
                x[idx++] = arr[i];
            }
        }
        return x;
    }
}