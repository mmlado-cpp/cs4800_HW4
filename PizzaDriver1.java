
public class PizzaDriver1 {
    public static void main(String[] args) {
        //first pizza with 3 toppings on size small 
        PizzaBuilder pizzaBuilder1 = new PizzaBuilder();
        pizzaBuilder1.setChainName("Pizza Hut");
        pizzaBuilder1.setSize("Small");
        pizzaBuilder1.addMushrooms();
        pizzaBuilder1.addPepperoni();
        pizzaBuilder1.addSausage();
        Pizza pizza1 = pizzaBuilder1.build();
        pizza1.eat();

        //second pizza with 6 toppings on size medium  
        PizzaBuilder pizzaBuilder2 = new PizzaBuilder();
        pizzaBuilder1.setChainName("Pizza Hut");
        pizzaBuilder1.setSize("Medium");
        pizzaBuilder1.addMushrooms();
        pizzaBuilder1.addPepperoni();
        pizzaBuilder1.addSausage();
        Pizza pizza1 = pizzaBuilder1.build();
        pizza1.eat();
    }
}