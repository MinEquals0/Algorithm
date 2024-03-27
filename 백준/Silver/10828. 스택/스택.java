import java.io.*;
import java.util.*;

public class Main {
    static class Stack {
        int[] numArr;
        int cur = 0;
        int size = 0;

        public Stack(int size) {
            this.numArr = new int[size];
        }

        void push(int x){
            numArr[cur] = x;
            cur++;
            size++;
        }

        int pop(){
            if(size == 0){
                return -1;
            }
            size--;
            return numArr[cur-- -1];
        }

        int size(){
            return size;
        }

        int empty(){
            return size == 0 ? 1 : 0;
        }

        int top(){
            return size == 0 ? -1 : numArr[cur-1]; // 커서 위치 조심
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Stack stack = new Stack(n); 
        String[] arr;

        // 입력 - 명령어 받기
        while(n-- > 0){
            // 명령어가 push 면 split(" ") 사용하기
            arr = br.readLine().split(" ");
            // switch 문을 사용해서 order 나누기
            // case "push":
            //    push(1); - 메서드 호출
            switch (arr[0]){
                case "push": {
                    int i = Integer.parseInt(arr[1]);
                    stack.push(i);
                    break;
                }
                case "pop": {
                    sb.append(stack.pop()).append("\n");
                    break;
                }
                case "size": {
                    sb.append(stack.size()).append("\n");
                    break;
                }
                case "empty" : {
                    sb.append(stack.empty()).append("\n");
                    break;
                }
                case "top": {
                    sb.append(stack.top()).append("\n");
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}