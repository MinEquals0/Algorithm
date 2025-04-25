class Solution {
    public int solution(int hp) {
//         int gen = hp / 5;
//         hp %= 5;
        
//         int sol = hp / 3;
//         hp %= 3;
        
//         int work = hp / 1;
        
//         int army = gen + sol + work;
        
//         return army;
        
        return hp / 5 + (hp % 5 / 3) + hp % 5 % 3;
       
        
    }
}