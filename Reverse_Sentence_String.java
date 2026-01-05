package Imp_Programs;

public class Reverse_Sentence_String {
    public static void main(String[] args) {
        // Hardcoded input
        String input = "I am a student";

        // Split sentence into words
        String[] words = input.split(" ");

        // Reverse the words
        
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}


