import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PasswordParser {
    
    static ArrayList<String> readFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        try {
            ArrayList<String> sb = new ArrayList<String>();
            String line = br.readLine();
            while (line != null) {
                if(!line.equals("end")){
                    sb.add(line);
                }
                line = br.readLine();
            }
            return sb;
        } finally {
            br.close();
        }
    }
}
