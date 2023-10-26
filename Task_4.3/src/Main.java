public class Main {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int hourPrice = Integer.parseInt(args[1]);
        int taxes = Integer.parseInt(args[2]);
        if (month == 2)
        {
            int salaryWithoutTaxes = 20 * 8 * hourPrice;
            int salaryWithTaxes = salaryWithoutTaxes - (salaryWithoutTaxes * taxes / 100);
            System.out.println("Salary without taxes = " + salaryWithoutTaxes);
            System.out.println("Salary with taxes = " + salaryWithTaxes);
        }
        else
        {
            if (month % 2 != 0)
            {
                int salaryWithoutTaxes = 23 * 8 * hourPrice;
                int salaryWithTaxes = salaryWithoutTaxes - (salaryWithoutTaxes * taxes / 100);
                System.out.println("Salary without taxes = " + salaryWithoutTaxes);
                System.out.println("Salary with taxes = " + salaryWithTaxes);
            } else
            {
                int salaryWithoutTaxes = 22 * 8 * hourPrice;
                int salaryWithTaxes = salaryWithoutTaxes - (salaryWithoutTaxes * taxes / 100);
                System.out.println("Salary without taxes = " + salaryWithoutTaxes);
                System.out.println("Salary with taxes = " + salaryWithTaxes);
            }
        }
    }
}