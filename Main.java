public class Main {
    public static void main(String[] args) {
        String [] arr = {"Rushi", "tekt"};

        for(int i=0; i<arr.length; i++){
            String s = arr[i];
            int len = s.length()-1;
            if(s.charAt(0)==s.charAt(len)){
                System.out.println(s);
            }
        }
    }
}
