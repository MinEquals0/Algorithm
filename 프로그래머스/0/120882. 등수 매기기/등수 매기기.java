import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        
        int n = score.length;
        double[] aveArr = new double[n];
        int[] ranks = new int[n];

        // 평균 점수 계산
        for (int i = 0; i < n; i++) {
            aveArr[i] = (score[i][0] + score[i][1]) / 2.0;
        }

        // 평균 점수와 원래 인덱스를 함께 저장
        List<double[]> idxScores = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            idxScores.add(new double[]{i, aveArr[i]});
        }

        // 평균 점수 기준 내림차순 정렬
        idxScores.sort((a, b) -> Double.compare(b[1], a[1]));

        // 등수 매기기
        int rank = 1;
        for (int i = 0; i < n; i++) {
            if (i > 0 && idxScores.get(i)[1] != idxScores.get(i - 1)[1]) {
                rank = i + 1;
            }
            ranks[(int) idxScores.get(i)[0]] = rank;
        }

        return ranks;
    }
}