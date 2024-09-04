/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        String str = "iihhii";
        boolean isPalindrome = true;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                isPalindrome = false;
            }
        }

        System.out.println(isPalindrome);
    }
}