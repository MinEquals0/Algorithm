class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        // 좌우 -1 +1, 상하 +1, -1
        // keyinput 배열 순회 -> 배열 방향을 읽음 -> if, case 문으로 처리
        // 맵의 크기 조심하기 board의 값을 2로 나눈 값이 양쪽으로 갈 수 있는 값
        
        int[] answer = {0,0};
        // 범위
        int halfX = board[0] / 2;   
        int halfY = board[1] / 2;   
        
        for(String key : keyinput) {
            int nextX = answer[0];
            int nextY = answer[1];
            
            switch(key) {
                case "up":
                    nextY++;
                    break;
                case "down":
                    nextY--;
                    break;
                case "right":
                    nextX++;
                    break;
                case "left":
                    nextX--;
                    break;
            }
            
            if(nextX >= -halfX && nextX <= halfX && nextY >= -halfY && nextY <= halfY){
                answer[0] = nextX;
                answer[1] = nextY;
            }
            
        }
        return answer;
    }
}