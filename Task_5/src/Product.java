public class Product {
    private String name;
    private int code;
    private double price;
    private String definition;
    private boolean availability;

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }


    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public String getDefinition() {
        return definition;
    }

    public boolean isAvailability() {
        return availability;
    }

    public Product(String name, int code, double price, String definition, boolean availability) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.definition = definition;
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", price=" + price +
                ", definition='" + definition + '\'' +
                ", availability=" + availability +
                '}';
    }
}
