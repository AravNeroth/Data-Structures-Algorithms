import java.util.*;


public class test {

    class Shrubbery implements Comparable<Shrubbery> {
        String name;
        int niceRating;
        double price;
        double volume;

        Shrubbery(String name, int niceRating, double price, double volume) {
            this.name = name;
            this.niceRating = niceRating;
            this.price = price;
            this.volume = volume;
        }

        @Override
        public int compareTo(Shrubbery other) {
            // Compare shrubberies based on Sir Arthur's request
            if (Main.currentRequest.equals("SIZE")) {
                return Double.compare(other.volume, this.volume); // Largest size
            } else if (Main.currentRequest.equals("PRICE")) {
                return Double.compare(this.price, other.price); // Smallest price
            } else {
                return Integer.compare(other.niceRating, this.niceRating); // Largest nice value
            }
        }
    }

    public class Main {
        static String currentRequest;

        public void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            for (int i = 0; i < N; i++) {
                int Q = scanner.nextInt();
                scanner.nextLine(); // Consume the newline

                List<Shrubbery> shrubberies = new ArrayList<>();

                for (int j = 0; j < Q; j++) {
                    String line = scanner.nextLine();
                    String[] parts = line.split(" ");
                    String name = parts[0];
                    int niceRating = Integer.parseInt(parts[1]);
                    double price = Double.parseDouble(parts[2]);
                    double volume = parts.length == 4 ? Double.parseDouble(parts[3]) : 0.0;

                    shrubberies.add(new Shrubbery(name, niceRating, price, volume));
                }

                currentRequest = scanner.nextLine();

                // Sort the shrubberies based on the current request
                Collections.sort(shrubberies);

                // Print the sorted shrubberies by name
                for (Shrubbery shrubbery : shrubberies) {
                    System.out.println(shrubbery.name);
                }

                if (i < N - 1) {
                    System.out.println(); // Empty line between data sets
                }
            }
        }
    }

}
