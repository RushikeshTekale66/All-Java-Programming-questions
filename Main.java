import java.util.Scanner;

class Main{
    public static void main(String [] args){
        String str = "Rushikesh ";
        Scanner sc = new Scanner (System.in);

        char ch = 'R';
        for(int i=0; i<str.length(); i++){
            if(ch==str.charAt(i)){
                System.out.println("Matched");
            }
        }
    }
}