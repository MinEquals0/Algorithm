import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        //  String input = br.readLine().trim();  // 숫자 뒤에 공백이 올 경우 대비
        
        if(input.equals("0")){
            System.out.println("YONSEI");
        } else {
            System.out.println("Leading the Way to the Future");

        }
        
        
    }

}
