/*
Name: Arav Neroth
Class: CS 3 3rd period
Date: 9/23/23
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ExceptionTests {

    // #1
    public void tryCatchBlock() {
        try {
            int output = 348675847 / 0;
        } catch (ArithmeticException o) {
            System.err.println("Error: really bad math detected");
        }
    }

    // #2
    public void oddNumberExceptions(int oddNumber) {
        if (!(oddNumber % 2 == 0)) {
            throw new IllegalArgumentException("We caught an Odd Number! : " + oddNumber);
        }
    }

    // #3
    public void fileException() throws FileNotFoundException {
        try {
            File coolFile = new File("C:/users/coolFile.txt");
            Scanner scanner1 = new Scanner(coolFile);
        } catch (FileNotFoundException e) {
            System.out.println("No File Found- it's probably lumped with all the other files in your downloads");
        }
    }

    // #4
    public void evenNumberCaught() throws FileNotFoundException {
        File evenNumbers = new File("/Users/neroth_927927/Documents/Computer Science 3/ExceptionHandling/evennumbers.txt");
        try (Scanner scanner2 = new Scanner(evenNumbers)) {
            while (scanner2.hasNextLine()) {
                String line = scanner2.nextLine();
                int num = Integer.parseInt(line);

                if (num > -1) {
                    throw new Exception("Positive number found: " + num);
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found- make it exist");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // #5
    public void checkEmptyFile() throws Exception {
        File emptyFile = new File("/Users/neroth_927927/Documents/Computer Science 3/ExceptionHandling/emptyfile.txt");
        Scanner scanner3 = new Scanner(emptyFile);

        try {
            if (!scanner3.hasNextLine()) {
                throw new Exception("You forgot to fill your file");
            }
        }
        catch(FileNotFoundException e){
            System.out.println("No file found- make it exist");
        }

    }

    // #6
    public void checkForDuplicateNumbers(Integer [] inputArr) throws Exception {

        for (int i = 0; i < inputArr.length - 1; i++) {

            if (inputArr[i] == inputArr[i + 1]) {
                throw new Exception("Two of a Kind!: " + inputArr[i]);
            }
        }
        System.out.println("List for duplicate numbers has been fully iterated");
    }

    // #7
    public void checkForVowels(String vString) throws Exception {

        for (int i = 0; i < vString.length() - 1; i++) {

            char checkVowel = vString.charAt(i);

            if (checkVowel == 'a' || checkVowel == 'e' || checkVowel == 'i' || checkVowel == 'o' || checkVowel == 'u') {
                throw new Exception("Vowel Found!: " + checkVowel);

            }

        }

        System.out.println("String has been searched for vowels");
    }
}
