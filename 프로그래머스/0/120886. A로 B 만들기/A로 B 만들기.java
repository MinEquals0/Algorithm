import java.util. *;

class Solution {
    public int solution(String before, String after) {
        // int cnt = 0;
        // StringBuilder sb = new StringBuilder(after);
        
        // for(int i = 0; i < before.length(); i++){
        //     char ber = before.charAt(i);
        //     for(int j = 0; j < sb.length(); j++){
        //         if(ber == sb.charAt(j)){
        //             cnt++;
        //             sb.deleteCharAt(j);
        //             break;
        //         }
        //     }
        // }
        // return cnt == before.length() ? 1 : 0;
        
        char[] arr1 = before.toCharArray();
        char[] arr2 = after.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        return Arrays.equals(arr1, arr2) ? 1 : 0;
    }
}
