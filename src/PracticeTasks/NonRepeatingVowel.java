package PracticeTasks;

import java.util.Scanner;

public class NonRepeatingVowel {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a string: ");
            String input = scanner.nextLine();

            System.out.println("First non-repeating vowel index: " + firstNonRepeatingVowel(input));

            scanner.close();
        }

        public static int firstNonRepeatingVowel(String s) {
            int[] vowelCounts = new int[5];


            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                switch (ch) {

                    case 'a':
                        vowelCounts[0]++;
                    break;

                    case 'e':
                        vowelCounts[1]++;
                        break;
                    case 'i':
                        vowelCounts[2]++;
                        break;
                    case 'o':
                        vowelCounts[3]++;
                        break;
                    case 'u':
                        vowelCounts[4]++;
                        break;
                }
            }


            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                switch (ch) {
                    case 'a':
                        if (vowelCounts[0] == 1)
                            return i;
                        break;
                    case 'e':
                        if (vowelCounts[1] == 1)
                            return i;
                        break;
                    case 'i':
                        if (vowelCounts[2] == 1)
                            return i;
                        break;
                    case 'o':
                        if (vowelCounts[3] == 1)
                            return i;
                        break;
                    case 'u':
                        if (vowelCounts[4] == 1)
                            return i;
                        break;
                }
            }

            return -1;
        }
    }


