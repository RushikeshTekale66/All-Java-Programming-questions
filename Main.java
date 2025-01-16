public class Main {

    public static void main(String[] args) {
        String str = "Rushikesh";
        char [] ch = str.toCharArray();

        String result = "";
        for(int i=ch.length-1; i>=0; i--){
            result = result + ch[i];
        }

        System.out.println(result);
    }
}