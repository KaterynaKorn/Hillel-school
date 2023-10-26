import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("The total amount of the credit?");
        Scanner scanner = new Scanner(System.in);
        float credit = scanner.nextFloat();
        System.out.println("The monthly rate?");
        float rate = scanner.nextFloat();
        System.out.println("What do you need to calculate? 1 - Calculate the number of monthly payments; 2- Calculate the amount of the monthly payment");
        String answer = scanner.next();
        if ("1".equals(answer)){
            System.out.println("Money in the monthly payment?");
            float monthlyPay = scanner.nextInt();
            float creditM = credit;
            int i =0;
            for (i = 0; creditM > monthlyPay; i++){
               creditM = credit + credit*rate/100 - monthlyPay;
               credit =creditM;
            }
            System.out.println("Number of payments = " + (i+1));

        }
        if ("2".equals(answer)) {
            System.out.println("Number of payments?");
            int numberPay = scanner.nextInt();
            System.out.println("Number of payments = " + numberPay);
            double monthlyPay;
            double rateUnit = rate/100;
            monthlyPay = credit *(rateUnit* Math.pow((1+rateUnit),numberPay))/(Math.pow((1+rateUnit),numberPay)-1);
            System.out.println("Monthly payment = " + monthlyPay);
        }

    }
}