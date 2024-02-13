package PracticeTasks;

public class frequencyOfaWord {

    public static void main(String[] args) {

        String sentence = "java JAVA jAvA JAva";
        String word = "java";

        // Convert the entire sentence to lower case to make the search case-insensitive
        String lowerCaseSentence = sentence.toLowerCase();

        int frequency = 0;
        int index = 0;

        // Use indexOf to find each occurrence of the word "java"
        while ((index = lowerCaseSentence.indexOf(word, index)) != -1) {
            frequency++;
            index += word.length(); // Move the index past the found word to search for the next occurrence
        }

        System.out.println(frequency);
    }
}




/*
 3.  Write a program that can return the frequency of the word java from a sentence
         Ex:
         sentence = "java JAVA jAvA JAva"

         output:
         4*/
