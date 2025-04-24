class Solution {
    public int solution(int[] sides) {
        
        if(sides[0] > sides[1] && sides[0] > sides[2]){
            return ((sides[0] < sides[1]+sides[2]) ? 1 : 2);
        } else if (sides[1] > sides[0] && sides[1] > sides[2]){
            return ((sides[1] < sides[0]+sides[2]) ? 1 : 2);
        } else {
            return ((sides[2] < sides[0]+sides[1]) ? 1 : 2);
        } 
    }
}