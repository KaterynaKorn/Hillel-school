public class Main {
    public static void main(String[] args) {

        System.out.println("First number = " + args[0]);
        System.out.println("Second number = " + args[1]);

        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);

        System.out.println( "The result = " + Math.pow(firstNumber, secondNumber));

      }

}


