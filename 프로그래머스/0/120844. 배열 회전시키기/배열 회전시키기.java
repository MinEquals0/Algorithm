class Solution {
    public int[] solution(int[] numbers, String direction) {
        int len = numbers.length;
        int[] arr = new int[len];

        if(direction.equals("right")){
            arr[0] = numbers[len-1];
            for(int i = 1; i < numbers.length; i++){
                arr[i] = numbers[i-1];
            }
        } else {
            arr[len-1] = numbers[0];
            for(int i = 1; i < numbers.length; i++){
                arr[i-1] = numbers[i];
            }
        }
        return arr;
    }
}