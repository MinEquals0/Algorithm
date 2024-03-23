class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] i : queries){
            int x = i[0];
            int y = i[1];

            if (x >= 0 && x < arr.length && y >= 0 && y < arr.length) {
                int temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            }
        }

        return arr;
    }
}
