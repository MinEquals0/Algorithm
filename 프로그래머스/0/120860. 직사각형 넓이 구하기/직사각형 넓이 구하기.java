import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int width = Math.abs(dots[0][0] - dots[1][0]);
        int length = Math.abs(dots[0][1] - dots[1][1]);
        
        for(int i = 1; i < dots.length-1; i++){
            int diffW = Math.abs(dots[i][0] - dots[i+1][0]);
            if(width < diffW) {
                width = diffW;
            }
            int diffL = Math.abs(dots[i][1] - dots[i+1][1]);
            if(length < diffL) {
                length = diffL;
            }
            
        }
        
        int answer = width * length;
        
        return answer;
    }
}