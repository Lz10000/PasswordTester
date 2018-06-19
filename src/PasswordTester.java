import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PasswordTester {

    public static void main(String[] args) {
        
       PasswordProcessor pwprocess = new PasswordProcessor();
       
       try {
        pwprocess.displayOutput("say.txt");
    } catch (Exception e) {
        
        e.printStackTrace();
    }
        
    }
    
    
    

}
