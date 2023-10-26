import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int weeksNumber = 4;
        int monthNumber = 12;

        Scanner scanner = new Scanner (System.in);
        System.out.println("Введіть кількість робочих годин на тиждень");
        int numberWorkHoursWeek = scanner.nextInt();
        System.out.println("Кількість робочих годин на тиждень: " + numberWorkHoursWeek);
        System.out.println("Введіть річну зарплатню з податками");
        int yearSalaryWithTaxes = scanner.nextInt();
        System.out.println("Річна зарплатня з податками: " + yearSalaryWithTaxes);
        System.out.println("Введіть відсоток податку ");
        int taxes = scanner.nextInt();
        System.out.println("Відсоток податку: " + taxes);

        float yearSalaryWithoutTaxes = yearSalaryWithTaxes + (yearSalaryWithTaxes * taxes/100);
        float hourPriceWithoutTaxes = yearSalaryWithoutTaxes/monthNumber/weeksNumber/numberWorkHoursWeek;
        System.out.println("Вартість години без податку: " + hourPriceWithoutTaxes);

        float hourPriceWithTaxes = yearSalaryWithTaxes/monthNumber/weeksNumber/numberWorkHoursWeek;
        System.out.println("При " + numberWorkHoursWeek + " робочих годин на тиждень з річною зарплатею в " + yearSalaryWithTaxes + " та податком " + taxes + "%, година часу коштує " + hourPriceWithTaxes);








    }
    }
