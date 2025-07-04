class Solution {
    public int solution(int[][] dots) {
        // 선분 조합 AB AC AD BC BD CD
        // 기울기 조합 AB - CD, AC - BD, AD - BC
        if(isParallel(dots[0], dots[1], dots[2], dots[3])) {
            return 1;
        }
        
        if(isParallel(dots[0], dots[2], dots[1], dots[3])){
            return 1;
        }
        
        if(isParallel(dots[0], dots[3], dots[1], dots[2])){
            return 1;
        }
        
        return 0;
    }
    
    // m = (y2 - y1) / (x2 - x1) 기울기 이용
    public boolean isParallel(int[] a1, int[] a2, int[] b1, int[] b2){
        int dx1 = a2[0] - a1[0];
        int dy1 = a2[1] - a1[1];
        int dx2 = b2[0] - b1[0];
        int dy2 = b2[1] - b1[1];
        
        // 두 선분이 평행하다면, 선분1 기울기 = 선분2 기울기
        // 선분1의 기울기 = dy1 / dx1 
        // 선분2의 기울기 = dy2 / dx2
        // dy1/dx1 == dy2/dx2
        
        return dx2 * dy1 == dx1 * dy2;
            
    }
}
