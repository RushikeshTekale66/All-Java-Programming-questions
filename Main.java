/**
 * Main
 */
public class Main {

    public static void main(String [] args){
        String str = "rusur";
        boolean result = true;
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                result = false;
            }
        }
        if(result) System.out.println("Palindrome");
        else System.out.println("Not palindrome");
    }
}