import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int hourPrice = Integer.parseInt(args[0]);
        int taxes = Integer.parseInt(args[1]);
        String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC", "Total"};
        Integer[] days = {23, 20, 23, 22, 23, 22, 23, 23, 22, 23, 22, 23, 224};
        for (int i = 0; i < months.length; i++) {
            int salaryWithoutTaxes = days[i] * 8 * hourPrice;
            int salaryWithTaxes = salaryWithoutTaxes - (salaryWithoutTaxes * taxes / 100);
            System.out.println(months[i] + " " + salaryWithTaxes + " " + salaryWithoutTaxes);
        }
    }
}