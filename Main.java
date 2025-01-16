public class Main {

    public static void main(String[] args) {
        String str = "Rushikesh";

        System.out.println("Print character at given index : " + str.charAt(2));
        System.out.println("Check the string contains the sequence of character Rushi : "+ str.contains("Rushi"));

        System.out.println("Check the String starts with R : " + str.startsWith("u"));
        System.out.println("Check the String ends with h : " + str.endsWith("h"));

        System.out.println("Print the hash code of string : " + str.hashCode());

        System.out.println("Print the index of character in string R : " + str.indexOf("R"));
        System.out.println("Print the last index of character h : " + str.lastIndexOf("h"));

        System.out.println("Replace the character in string R : " + str.replace("R", "T"));
        System.out.println("Replace all the characters in the string h : " + str.replaceAll("h", "hh"));
        System.out.println("Replace the first occurance of character only h : " + str.replaceFirst("h", "T"));

        System.out.println("Convert string in to lowercase : " + str.toLowerCase());
        System.out.println("Convert string into the uppercase : " + str.toUpperCase());
    }
}