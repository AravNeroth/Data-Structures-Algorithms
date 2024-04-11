/*
Name: Arav Neroth
Class: CS 3 3rd period
Date: 9/23/23
*/

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        ExceptionTests tester = new ExceptionTests();

        // Test #1: tryCatchBlock
        System.out.println("Testing tryCatchBlock:");
        tester.tryCatchBlock();
        System.out.println("tryCatchBlock test complete\n");


        // Test #2: oddNumberExceptions
        System.out.println("Testing oddNumberExceptions:");
        try {
            tester.oddNumberExceptions(7);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
        System.out.println("oddNumberExceptions test complete\n");


        // Test #3: fileException
        System.out.println("Testing fileException:");
        try {
            tester.fileException();
        } catch (FileNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        }
        System.out.println("fileException test complete\n");


        // Test #4: evenNumberCaught
        System.out.println("Testing evenNumberCaught:");
        try {
            tester.evenNumberCaught();
        } catch (RuntimeException | FileNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        }
        System.out.println("evenNumberCaught test complete\n");


        // Test #5: checkEmptyFile
        System.out.println("Testing checkEmptyFile:");
        try {
            tester.checkEmptyFile();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        System.out.println("checkEmptyFile test complete\n");


        // Test #6: checkForDuplicateNumbers
        System.out.println("Testing checkForDuplicateNumbers:");
        Integer[] inputArr = {1, 2, 3, 4, 5, 5, 6};
        try {
            tester.checkForDuplicateNumbers(inputArr);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        System.out.println("checkForDuplicateNumbers test complete\n");


        // Test #7: checkForVowels
        System.out.println("Testing checkForVowels:");
        String vString = "chocolate";
        try {
            tester.checkForVowels(vString);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        System.out.println("checkForVowels test complete");
    }
}
