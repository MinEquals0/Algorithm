class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int sum = a + b + c;
        int doub = (int)(Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2));
        int tri =  (int)(Math.pow(a,3)+ Math.pow(b,3) + Math.pow(c,3));
        
        if(a == b && b == c) {
            answer = sum * doub * tri;
        } else if(a == b || b == c || c == a){
            answer = sum * doub;
        } else {
            answer = sum;
        }
        return answer;
    }
}