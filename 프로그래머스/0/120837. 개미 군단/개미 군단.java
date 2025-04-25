class Solution {
    public int solution(int hp) {
        int gen = 0;
        int sol = 0;
        int work = 0;
        
        while(hp != 0){
            gen = hp / 5;
            hp -= gen * 5;
            System.out.println(hp);
            sol = hp / 3;
            hp -= sol * 3;
            work = hp / 1;
            hp -= work;
        }
        
        int army = gen + sol + work;
        
        return army;
        
    }
}