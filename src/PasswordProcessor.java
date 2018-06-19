import java.io.IOException;
import java.util.ArrayList;

public class PasswordProcessor {
    PasswordRules rules;
    public PasswordProcessor(){
        rules = new PasswordRules();
    }
    
    private boolean passes(String str){
        return rules.containsVowel(str) && rules.noThreeConsecConst(str) && rules.noTwoConsecutiveLetters(str);
    }
    
    public void displayOutput(String filename){
        ArrayList<String> passwords;
        try {
            passwords = PasswordParser.readFile(filename);
            for(String pw : passwords){
                if(passes(pw)){
                    System.out.println("<"+pw+"> is acceptable.");
                }else{
                    System.out.println("<"+pw+"> is not acceptable.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
