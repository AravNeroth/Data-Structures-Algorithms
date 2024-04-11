
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class ShrubRunner {

    public static void main(String args[]) throws IOException {
        Scanner file = new Scanner(new File("shrubbery.dat"));
        ArrayList<Shrubbery> objects = new ArrayList<>();
        ArrayList<Shrubbery> result = new ArrayList<>();
        int amount = file.nextInt();

        for (int r = 0; r < amount; r++) {
            int per = file.nextInt();
            for (int i = 0; i < per; i++) {

                objects.add(new Shrubbery(file.next(), file.nextInt(), file.nextDouble(), file.nextDouble()));
                file.nextLine();


            }
            String type = file.nextLine();
            Shrubbery.compare = type;

            Collections.sort(objects);

            for (Shrubbery l : objects) {
                System.out.println(l.toString());

            }
            objects.clear();
            System.out.println();

        }


    }
}
