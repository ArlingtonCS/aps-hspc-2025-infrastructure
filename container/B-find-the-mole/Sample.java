import java.util.Scanner;

public class Sample {
    public static String findMole(String[] datapoints) {
        // ### WRITE YOUR CODE HERE ###
    }

    // parsing code, DO NOT MODIFY
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int testCases = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            for (int i = 0; i < testCases; i++) {
                int n = scanner.nextInt();
                scanner.nextLine(); // consume newline character
                String[] datapoints = new String[n];
                for (int j = 0; j < n; j++) {
                    datapoints[j] = scanner.nextLine();
                }

                System.out.println(findMole(datapoints));
            }
        }
    }
}
