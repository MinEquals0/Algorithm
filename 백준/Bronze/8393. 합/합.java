import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);

        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum += i;
        }

        System.out.println(sum);
    }
}