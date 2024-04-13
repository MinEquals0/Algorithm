import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] arr = br.readLine().split(" ");

        // 첫째 줄 입력 받기
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        // 2개의 이차원 배열 받기 - 배열 미리 생성
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];

        // 첫번째 이차원 배열
        for(int i = 0; i < n; i++){
           arr = br.readLine().split(" "); // 1 1 1
           for(int j = 0; j < m; j++){
               arr1[i][j] = Integer.parseInt(arr[j]); // j로 주기
           }
        }

        // 두번째 이차원 배열
        for(int i = 0; i < n; i++){
            arr = br.readLine().split(" ");
            for(int j = 0; j < m; j++){
                arr2[i][j] = Integer.parseInt(arr[j]);
            }
        }

        // 두 배열 더하기
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr1[i][j] = arr1[i][j] + arr2[i][j];
                sb.append(arr1[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}