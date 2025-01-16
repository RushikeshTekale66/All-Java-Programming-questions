public class Main {

    public static void main(String[] args) {
        String str = "iii";
        char [] ch = str.toCharArray();

        int start = 0, end = ch.length-1;

        boolean result = true;

        while (start<end) {
            if(ch[start]!=ch[end]){
                result = false;
            }
            start++;
            end--;
        }
        if(result){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}