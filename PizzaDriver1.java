
public class PizzaDriver1 {
    public static void main(String[] args) {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        Pizza pizza = pizzaBuilder.setSize("Large")
                                  .addPepperoni()
                                  .addMushrooms()
                                  .build();

        pizza.eat();
    }
}