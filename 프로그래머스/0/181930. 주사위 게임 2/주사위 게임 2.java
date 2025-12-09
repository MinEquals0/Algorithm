class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if (a == b && b == c){
            //answer = (a+b+c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
             answer = (a+b+c) * (square(a) + square(b) + square(c)) * (cube(a) + cube(b) + cube(c));
        } else if (a != b && b != c && a != c){
            answer = a + b + c;
        } else {
            //answer = (a+b+c) * (a*a + b*b + c*c);
             answer = (a+b+c) * (square(a) + square(b) + square(c));
        }
        return answer;
    }

    public int square(int x){
            return x * x;
    }

    public int cube(int x){
        return x * x * x;
    }  
}
