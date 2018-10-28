package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	/** This program will count words in the story a tale of two  cities. note that words counted may not be part of the
     * story.*/

        // Give program access to .txt file
        File file = new File("aTaleOfTwoCities.txt");

        // Passing in the the above File variable into the scanner to be "read".
        Scanner scanner = new Scanner(file);

        // variable used to store the number of words in the file.
        int words = 0;

        // hasNextLine is a boolean method that returns true if there is a Nextline
        while (scanner.hasNextLine()){
            //takes scanner to read nextline
            String line = scanner.nextLine();
            // the right side of this code is counting the the splits between
            words += line.split("").length;

        }

        System.out.println("This file has " + words + " in it.");
    }
}
