class Main {
    public static void main(String[] args) {
        String str = "Rushikesh";

        int start = 0;
        int end = str.length()-1;

        char[] charArr = str.toCharArray();

        while (start<end) {
            char temp = charArr[start];
            charArr[start] = charArr[end];
            charArr[end] = temp;
            start++;
            end--;
        }
        String str2= new String (charArr);
        System.out.println(str2);
    }
}