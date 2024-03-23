import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a,b,c,d};
        int answer = 0;
        Arrays.sort(dice);

        for (int i = 0; i < dice.length; i++) {
            if(dice[0] == dice[3]){
                answer = 1111 * dice[0];
            } else if(dice[0] == dice[2]){
                answer = (int) Math.pow((10 * dice[0] + dice[3]), 2);
            } else if(dice[1] == dice[3]){
                answer = (int) Math.pow((10 * dice[1] + dice[0]), 2);
            } else if(dice[0] == dice[1] && dice[2] == dice[3] ){
                answer = (dice[0] + dice[2]) * Math.abs(dice[0] - dice[2]);
            } else if(dice[0] == dice[1] && dice[2] != dice[3]){
                answer = dice[2] * dice[3];
            } else if(dice[1] == dice[2] && dice[0] != dice[3]){
                answer = dice[0] * dice[3];
            } else if(dice[2] == dice[3] && dice[0] != dice[1]){
                answer = dice[0] * dice[1];
            } else {
                answer = dice[0];
            }
        }
        return answer;
    }
}

// 4개 같은 수 p -> 1111 * p
// 3개 같은 수 p, q -> (10*p+q)^2
// 2개 같은 수 p, q -> (p + q) * |p-q|
// 2개 같은 수 p, 다른 수 q,r -> q * r
// 다른 수 -> 나온 숫자 중 젤 작은 수