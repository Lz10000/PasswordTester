
public class PasswordRules {

    final char[] vowels = {'a','e','i','o','u'};
    final char[] consonants = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
    
    
    public boolean containsVowel(String str){
        for(int i=0; i<vowels.length; i++){
            if(str.contains(Character.toString(vowels[i]))){
                return true;
            }
        }
        return false;
    }
    
    public boolean noThreeConsecutives(String str, char[] chars){
        for(int i=0; i<chars.length; i++){
            if(str.contains(Character.toString(chars[i]))){
                int index = str.indexOf(chars[i]);
                if(index+2 < str.length()){
                    if(str.charAt(index) == str.charAt(index+1) && str.charAt(index) == str.charAt(index+2)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public boolean noThreeConsecVowels(String str){
        return noThreeConsecutives(str, vowels);
    }
    
    public boolean noThreeConsecConst(String str){
        return noThreeConsecutives(str, consonants);
    }
    
    public boolean noTwoConsecutiveLetters(String str){
        
        for(int i=0; i<str.length(); i++){
            for(int j=1; j<str.length()-1; j++){
                if(str.charAt(i) != 'e' || str.charAt(i) != 'o'){
                    if(str.charAt(i) == str.charAt(j)){
                        return false;
                    }
                }
            } 
        }
        return true;
    }
    
}
