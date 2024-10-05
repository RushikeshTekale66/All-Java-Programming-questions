class Main{
    public static void main(String [] args){
        String str = "Rushikesh";
        String str2 = "";
        for(int i=0; i<str.length(); i++){
            str2 =str.charAt(i) + str2 ;
        }
        System.out.println(str2);
    }
}
