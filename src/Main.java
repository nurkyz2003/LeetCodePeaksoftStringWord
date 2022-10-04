import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(lengthOfLastWord(scanner.nextLine()));
    }
        public static int lengthOfLastWord(String s) {
            if(s==null || s.length() == 0) {
                return 0;
            }
            int res = 0;
            int lengthOfWord = s.length();
            boolean result = false;
            for(int i=lengthOfWord-1; i>=0; i--){
                char symbol = s.charAt(i);
                if((symbol>='A' && symbol<='Z') || (symbol>='a' && symbol<='z')){
                    result = true;
                    res++;
                }else{
                    if(result)
                        return res;
                }
            }
            return res;
    }
}