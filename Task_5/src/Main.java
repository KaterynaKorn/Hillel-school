public class Main {
    public static void main(String[] args) {
Product productList = new Product("Milk",324, 50,"without lactoze", true);
        System.out.println(productList);

        Employee employeeList = new Employee("Korneeva", "Kateryna", "QA", 20);
        System.out.println(employeeList);

        Triangle triangle = new Triangle(2,2,1);
        System.out.println(triangle);
        System.out.println("Perimetr = " + triangle.perimetr());
        System.out.println("Area = " + triangle.area());

        Credit credit = new Credit(12,200,1, 23);
        System.out.println(credit);
    }


}