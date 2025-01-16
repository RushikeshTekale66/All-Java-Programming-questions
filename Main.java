public class Main {

    public static void main(String[] args) {
        String str = "Rushikesh Ramesh Tekale";
        String [] arr = str.split(" ");
        
        for(String s : arr){
            System.out.print(s + " : ");
            for(int i=s.length()-1; i>=0; i--){
                System.out.print(s.charAt(i));
            }
            System.out.println();
        }

       
    }
}