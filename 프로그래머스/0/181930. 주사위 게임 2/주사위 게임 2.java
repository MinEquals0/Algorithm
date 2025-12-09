class Solution {
    public int solution(int a, int b, int c) {
        int sum = a + b + c;
        int sumSquare = square(a) + square(b) + square(c);
        int sumCube = cube(a) + cube(b) + cube(c);
        int answer = 0;
        
        if (a == b && b == c){
            //answer = (a+b+c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
            //answer = (a+b+c) * (square(a) + square(b) + square(c)) * (cube(a) + cube(b) + cube(c));
            answer = sum * sumSquare * sumCube;
        } else if (a != b && b != c && a != c){
            //answer = a + b + c;
            answer = sum;
        } else {
            //answer = (a+b+c) * (a*a + b*b + c*c);
            //answer = (a+b+c) * (square(a) + square(b) + square(c));
            answer = sum * sumSquare;
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
