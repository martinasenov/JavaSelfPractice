package PracticeTasks;

public class frequencyOfChar {

    public static void main(String[] args) {
        String str = "aaabbbbccccc";
        char ch = 'c';
        int frequency = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch) {
                frequency++;
            }
        }

        System.out.println(frequency);
    }
}




 /* 2. write a program that can return the frequency of a character from a string
          Ex:
          str = "aaabbbbccccc"
          ch = 'c'

          output:
          5*/