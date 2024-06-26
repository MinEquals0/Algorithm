class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int num = 1;
        int end = n * n;
        int x = 0, y = 0;
        
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        
        int dir = 0;
        
        for (int i = 1; i <= end; i++) {
            answer[x][y] = i;
            
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            
            if(nx < 0 || nx >= n || ny < 0 || ny >= n || answer[nx][ny] != 0) {
                dir++;
            }
            
            if (dir > 3) dir = 0;
            
            x += dx[dir];
            y += dy[dir];
        }
        
        return answer;
    }
}