
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
        pizzaBuilder2.setChainName("Pizza Hut");
        pizzaBuilder2.setSize("Medium");

        pizzaBuilder2.addMushrooms();
        pizzaBuilder2.addPepperoni();
        pizzaBuilder2.addSausage();
        pizzaBuilder2.addBacon();
        pizzaBuilder2.addOnions();
        pizzaBuilder2.addExtraCheese();

        Pizza pizza2 = pizzaBuilder2.build();
        pizza2.eat();

        //third pizza with 9 toppings on size large  
        PizzaBuilder pizzaBuilder3 = new PizzaBuilder();
        pizzaBuilder3.setChainName("Pizza Hut");
        pizzaBuilder3.setSize("Large");

        pizzaBuilder3.addMushrooms();
        pizzaBuilder3.addPepperoni();
        pizzaBuilder3.addSausage();
        pizzaBuilder3.addBacon();
        pizzaBuilder3.addOnions();
        pizzaBuilder3.addExtraCheese();
        pizzaBuilder3.addPesto();
        pizzaBuilder3.addPeppers();
        pizzaBuilder3.addOlives();
        
        Pizza pizza3 = pizzaBuilder3.build();
        pizza3.eat();
    }
}