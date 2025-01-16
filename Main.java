public class Main {

    public static void main(String[] args) {
        String str = "Rushikesh Ramesh Tekale";
        String [] arr = str.split(" ");

        String result = "";
        
        for(String s : arr){
            String s1 = "";
            for(int i=s.length()-1; i>=0; i--){
                s1 = s1 + s.charAt(i);
            }
            result = result + s1 + " ";
        }

        result = result.trim();

        System.out.println(result);

       
    }
}