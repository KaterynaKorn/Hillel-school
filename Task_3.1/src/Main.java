import java.util.Scanner;

public class Main {

        static void doWhenYes() {
            System.out.println("What do you want to see: 1 - rectangle, 2 - right triangle, 3 - inverted right triangle, 4 - triangle?");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.next();
            System.out.println("The figure is: " + name);
            switch (name) {
                case "1":
                    System.out.println("Please insert the width");
                    int width = scanner.nextInt();
                    System.out.println("Please insert the lenght");
                    int lenght = scanner.nextInt();
                    System.out.println("Width = " + width + " Lenght = " + lenght);
                    for (int i = 0; i < width; i++) {
                        for (int j = 0; j < lenght; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case "2":
                    System.out.println("Please insert the lenght");
                    int lenghtT = scanner.nextInt();
                    System.out.println(" Lenght = " + lenghtT);
                    for (int i = 0; i < lenghtT; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println(" * ");
                    }
                    break;
                case "3":
                    System.out.println("Please insert the lenght");
                    int lenghtI = scanner.nextInt();
                    System.out.println(" Lenght = " + lenghtI);
                    for (int i = 0; i < lenghtI; i++) {
                        for (int j = lenghtI; j > i; j--) {
                            System.out.print("   ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print(" * ");
                        }
                        System.out.println(" * ");

                    }
                    break;
                case "4":
                    System.out.println("Please insert the lenght");
                    int lenghtH = scanner.nextInt();
                    System.out.println(" Lenght = " + lenghtH);
                    for (int i = 0; i < lenghtH; i++) {
                        for (int j = lenghtH; j > i; j--) {
                            System.out.print("   ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print(" * ");
                        }
                        for (int z = 1; z <= i; z++) {
                            System.out.print(" * ");
                        }
                        System.out.println(" * ");
                    }
                    break;

                default:
                    System.out.println("The figure name isn't correct");
            }
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = null;
        do {
            doWhenYes();
            System.out.println("Do you want to see a figure again?");
            answer = scanner.next();
        } while ("yes".equals(answer));
    }
}