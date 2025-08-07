package Bit_Manipulations;

// lower case to upper case conversion:


// upper case to lower case conversion


public class Bit12 {
    public static String convertToUpperCase(String s){
        String ss="";
        for(int i=0; i<s.length(); i++)
            ss=ss+(char)(s.charAt(i)^32);
        return ss;
    }

    public static String convertToLowerCase(String s){
        String ss="";
        for(int i=0; i<s.length(); i++)
            ss=ss+(char)(s.charAt(i)|32);
        return ss;
    }

    public static void main(String[] args) {
        System.out.println(convertToUpperCase("abc"));

        System.out.println(convertToLowerCase("ABC"));
    }

}
