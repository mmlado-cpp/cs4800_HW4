package question1;
import java.util.ArrayList;
import java.util.List;

// Define the Pizza class
class Pizza {
    private String chainName;
    private String size;
    private List<String> toppings;

    public Pizza(String size) {
        this.size = size;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setChainName(String name) {
        this.chainName = name;
    }

    public void eat() {
        System.out.println("Enjoy your pizza from " + chainName);
        System.out.println("Size: " + size);
        System.out.println("Toppings:");
        for (String topping : toppings) {
            System.out.println("- " + topping);
        }
    }
}