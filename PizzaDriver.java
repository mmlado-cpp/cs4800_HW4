public class PizzaDriver {
    public static void main(String[] args) {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        pizzaBuilder.addMushrooms();
        Pizza pizza = pizzaBuilder.build();
        pizza.eat();
    }
}
