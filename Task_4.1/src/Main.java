import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Insert the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 != 0) {
            System.out.println("The number is odd");
        } else {
            System.out.println("The number is even");
        }
        if (number > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }
        if (number < 2) {
            System.out.println("The number is composite");
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    System.out.println("The number is composite");
                    return;
                }
            }
                System.out.println("The number is simple");
            }
        }
    }

