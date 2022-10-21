import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static void checkNumber(boolean contains, int number) throws NumberException {
        if(contains) {
            throw new NumberException("Du försöker skriva en siffra som redan finns", number);
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("Skriv ett nummer: ");
        int number = scanner.nextInt();
        boolean numberExistsAlready = numbers.contains(number);

        while (numberExistsAlready) {
            try {
                checkNumber(numberExistsAlready, number);
            } catch (NumberException e) {
                System.out.println(e.getMessage() + ": " + e.number);
            }

            System.out.println("Skriv ett nummer: ");
            number = scanner.nextInt();
            numberExistsAlready = numbers.contains(number);
        }
        numbers.add(number);

        for (int n : numbers) {
            System.out.println(n);
        }

    }
}
