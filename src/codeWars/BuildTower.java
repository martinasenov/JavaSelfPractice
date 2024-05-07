package codeWars;

import java.util.Arrays;

public class BuildTower {


    public static String[] towerBuilder(int nFloors) {

        String[] tower = new String[nFloors];
        int maxStars = 2 * nFloors - 1;

        for (int i = 0; i < nFloors; i++) {
            tower[i] = "";
            int starsInRow = 2 * i + 1;
            int spacesOnEachSide = (maxStars - starsInRow) / 2;


            for (int j = 0; j < spacesOnEachSide; j++) {
                tower[i] += " ";
            }


            for (int j = 0; j < starsInRow; j++) {
                tower[i] += "*";
            }

            for (int j = 0; j < spacesOnEachSide; j++) {
                tower[i] += " ";
            }
        }

        return tower;
    }


    public static void main(String[] args) {


        System.out.println(Arrays.toString(towerBuilder(5)));


    }

}

/*
Build Tower
Build a pyramid-shaped tower, as an array/list of strings, given a positive integer number of floors. A tower block is represented with "*" character.

For example, a tower with 3 floors looks like this:

[
  "  *  ",
  " *** ",
  "*****"
]

And a tower with 6 floors looks like this:

[
  "     *     ",
  "    ***    ",
  "   *****   ",
  "  *******  ",
  " ********* ",
  "***********"
]

 */