import java.util.Scanner;

class Main{
    public static void main(String [] args){
        String str = "Rushikesh ";
        Scanner sc = new Scanner (System.in);

        String ch = "";
        int maxcount =0;
        int maxIndex =0;
        for(int i=0; i<str.length(); i++){
             int count = 0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if (count>maxcount){
                maxcount+=count;
                maxIndex = i;
            }
        }
        System.out.println("maximum occuring character is : " +  str.charAt(maxIndex+1));
    }
}