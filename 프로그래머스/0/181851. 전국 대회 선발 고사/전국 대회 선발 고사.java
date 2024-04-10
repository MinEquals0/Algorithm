import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[] index = new int[101];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i]) {
                index[rank[i]] = i;
                list.add(rank[i]);
            }
        }

        Collections.sort(list);

        int x = list.get(0);
        int y = list.get(1);
        int z = list.get(2);

        int result = index[x] * 10000 + index[y] * 100 + index[z];
        return result;
    }
}