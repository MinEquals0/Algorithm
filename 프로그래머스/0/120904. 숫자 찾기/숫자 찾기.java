class Solution {
    public int solution(int num, int k) {
        // int answer = 0;
        
        // char[] arr = Integer.toString(num).toCharArray();
        
        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i] - '0' == k){
        //         answer = i+1;
        //         return answer;
        //     }
            
        // }
        
        // return  -1;
        
        String str = String.valueOf(num);
        String kStr = String.valueOf(k);
        
        int answer = str.indexOf(kStr);
        
        return answer < 0 ? -1 : answer+1;
    }
}
