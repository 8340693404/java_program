package Imp_Programs;


public class z_palindrome_without_var {

    public static void main(String[] args) {

        String s = "malayalam";

        System.out.println(
            (s.charAt(0) == s.charAt(s.length() - 1))
                ? "palindrome"
                : "not palindrome"
        );
    }
}

