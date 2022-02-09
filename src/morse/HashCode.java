package morse;

import java.util.HashMap;
import java.util.Scanner;

public class HashCode {

    public static void main(String[] args) {
        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String symbols = "!?+#¤%&/()=@£${[]}^¨~<>|;:";

        HashMap<Character, Character> hash = new HashMap<Character, Character>();
        for(int i=0; i<alfabet.length();i++) {
            hash.put(alfabet.charAt(i), symbols.charAt(i));
        }

        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        for(int i=0; i<text.length();i++) {
            System.out.print(hash.get(text.charAt(i)));
        }
    }
}
