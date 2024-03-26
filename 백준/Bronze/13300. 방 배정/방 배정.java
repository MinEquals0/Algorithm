import java.io.*;

public class Main {
// IOException -> 이거 없으면 런타임 에러
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);

        // 총 n 명이면 n개 만큼의 배열 -> 입력값 담기
        // 계속 입력이 들어올 때 어떻게 받아야 되는걸까?
        int[][] info = new int[7][2];

        while(n-- > 0){
            arr = br.readLine().split(" ");

            int s = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[1]);

            info[y][s]++;
        }
        // info를 for문으로 돌면서 여학생 / 남학생 경우 -> k로 나눔
        // -> 결과값을 반올림 -> total 에 누적으로 더해주기
        int total = 0;
        for (int[] ints : info) {
            for (int anInt : ints) {
//                int num = (int) Math.round( (double) anInt / k); // 실수 계산 조심
                 // 실수 사용하지 않고 반올림 하는 방법
                 int num = anInt / k;
                  if(num * k != anInt){
                      num += 1;
                  }
                  total += num;
            }
        }
        System.out.println(total);
    }
}