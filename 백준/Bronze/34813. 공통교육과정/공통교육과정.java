
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char subject = str.charAt(0);

        if(subject == 'F'){
            System.out.println("Foundation");
        } else if (subject == 'C'){
            System.out.println("Claves");
        } else if (subject == 'V') {
            System.out.println("Veritas");
        } else if (subject == 'E'){
            System.out.println("Exploration");
        }


        // 2. switch
        switch (str.charAt(0)){
            case 'F':
                System.out.println("Foundation");
                break;
            case 'C':
                System.out.println("Claves");
                break;
            case 'V':
                System.out.println("Veritas");
                break;
            case 'E':
                System.out.println("Exploration");
                break;
        }

        
        // 3. map
        Map<Character, String> map = new HashMap<>();

        map.put('F', "Foundation");
        map.put('C', "Claves");
        map.put('V', "Veritas");
        map.put('E', "Exploration");

        char subject = str.charAt(0);

        System.out.println(map.get(subject));


        // 4. Enum
        char code = str.charAt(0);

        SubJectArea area = SubJectArea.fromCode(code);

        System.out.println(area.getDisplayName());

    }

}

// 4. Enum
enum SubJectArea {
    FOUNDATION('F', "Foundtaion"),
    CLAVES('C', "Claves"),
    VERITAS('V', "Veritas"),
    EXPLORATION('E', "Exploration");

    private final char code;
    private final String displayName;

    SubJectArea(char code, String displayName){
        this.code = code;
        this.displayName = displayName;
    }

    public String getDisplayName(){
        return displayName;
    }

    // 코드 -> enum 찾기
    public static SubJectArea fromCode(char code){
        for(SubJectArea area : values()){
            if(area.code == code){
                return area;
            }
        }
        return null;
    }
}


