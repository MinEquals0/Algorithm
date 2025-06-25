import java.util.*;

class Solution {
    public int solution(int[][] board) {
        // (3,2)에 지뢰있을 때, 위험지역 좌표
        // (3-1,2-1), (3-1, 2), (3-1,2+1)
        // (3,2-1), (3, 2), (3, 2+1)
        // (3+1, 2-1), (3+1, 2), (3+1, 2+1)
        // 위험 구역, 제외
        // (x-1,y-1), (x-1, y), (x-1,y+1)
        // (x,y-1), (x, y), (x, y+1)
        // (x+1, y-1), (x+1, y), (x+1, y+1)
        // 여기는 1로 바꾸고 0만 카운트하기
        
        int n = board.length;
        int m = board[0].length;
        int[][] danger = new int[n][m];
        
        int[] dx = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 0, 1, -1, 0, 1};
        
        // 위험 지역 표시
        for(int x = 0; x < n; x++){
            for(int y = 0; y < m; y++){
                if(board[x][y] == 1){
                    for(int i = 0; i < 9; i++){
                        int nx = x + dx[i];
                        int ny = y + dy[i];
                        
                        if(nx >= 0 && ny >= 0 && nx < n && ny < m){
                            danger[nx][ny] =  1;
                        }
                    }
                } 
                
            }
        }
        
        // 0 카운트
        int answer = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(danger[i][j] == 0){
                    answer++;
                }
            }
        }
        
        
        return answer;
    }
}