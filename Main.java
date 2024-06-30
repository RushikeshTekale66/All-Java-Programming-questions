import java.util.Scanner;

class Main{
    public static void main(String [] args){
        String str = "Rushikesh ";
        Scanner sc = new Scanner (System.in);

        char ch = 's';
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(ch==str.charAt(i)){
                count ++;
            }
        }
        System.out.println("count of " + ch + " is "+ count);
    }
}