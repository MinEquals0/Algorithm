import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] arr;


        // 배열 9 * 9 생성
        int[][] result = new int[9][9];

        for(int i = 0; i < 9; i++){ // 행을 받는데니까
            arr = br.readLine().split(" "); // 3 23 85
            for(int j = 0; j < 9; j++){
                result[i][j] = Integer.parseInt(arr[j]);
            }
        }

        // 최대값을 담을 max 변수 생성 - max랑 각 요소들 비교
        // 요소가 max보다 크면 max에 저장
        // i, j를 저장할 변수 생성
        int max = 0;
        int lowIdx = 0;
        int colIdx = 0;

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(max < result[i][j]) {
                    max = result[i][j];
                    lowIdx = i;
                    colIdx = j;
                }
            }
        }
        System.out.println(max);
        System.out.println((lowIdx+1) + " " + (colIdx+1));
    }
}
                           
