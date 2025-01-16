public class Main {

    public static void main(String[] args) {
        String str = "Rushikesh";
        char [] ch = str.toCharArray();
        int count = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>'a' && str.charAt(i)<'z'){
                count++;
            }
        }

        int count2 = 0;
        for (char c : ch) {
            if(c>'a' && c<'z'){
                count2++;
            }
        }

        System.out.println(count);
        System.out.println(count2);
    }
}