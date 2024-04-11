//� A+ Computer Science  -  www.apluscompsci.com
//Name - Arav Neroth
//Date - 9/11/23
//Class - CS 3 3rd period
//Lab  - look at the file name

import static java.lang.System.*;
import java.util.ArrayList;

    public class Palin {

        private String word;

        public Palin(String word) {
            this.word = word;
        }

        public int getLength() {
            return word.length();
        }

        public String getWord() {
            return word;
        }

        public boolean isPalin() {

            int length = getLength();

            for (int i = 0; i < (length / 2); i++) {

                if (getWord().charAt(i) != getWord().charAt(length - 1 - i)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return word;
        }

    }