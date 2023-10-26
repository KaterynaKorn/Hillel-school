import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int price = Integer.parseInt(args[0]);
        System.out.println("Quantity of product you want to buy?");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        float priceAll;
        float priceAllSale;
        priceAll = price * quantity;
        float rate = 0;
        if (quantity <= 10) {
        }
        else if (quantity <= 20)
          {
              rate=0.05F;
           }
        else if (quantity <= 30)
        {
            rate=0.1F;
        }
       else if (quantity <= 40)
        {
            rate=0.12F;
        }
        else if (quantity <= 50)
        {
            rate=0.124F;
        }
        else if (quantity <= 60)
        {
            rate=0.128F;
        }
        else if (quantity <= 70)
        {
            rate=0.132F;
        }
        else if (quantity <= 80)
        {
            rate=0.134F;
        }
        else
        {
            rate=0.14F;
        }
        priceAllSale = priceAll - (priceAll * rate);
        System.out.println("Price for " + quantity + " = " + priceAllSale);
    }
    }
