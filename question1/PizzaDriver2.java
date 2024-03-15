package question1;
public class PizzaDriver2 {
    public static void main(String[] args) {
        //PIZZA HUT
        // Large + 3 toppings
        PizzaBuilder pizzaBuilder1 = new PizzaBuilder("Large");
        pizzaBuilder1.setChainName("Pizza Hut");

        pizzaBuilder1.addBacon();
        pizzaBuilder1.addBeef();
        pizzaBuilder1.addChicken();

        Pizza pizza1 = pizzaBuilder1.build();
        pizza1.eat();

        // Small + 2 toppings
        PizzaBuilder pizzaBuilder2 = new PizzaBuilder("Small");
        pizzaBuilder2.setChainName("Pizza Hut");

        pizzaBuilder2.addBacon();
        pizzaBuilder2.addBeef();

        Pizza pizza2 = pizzaBuilder2.build();
        pizza2.eat();

        //LITTLE CEASARS
        // Medium + 8 toppings
        PizzaBuilder pizzaBuilder3 = new PizzaBuilder("Medium");
        pizzaBuilder3.setChainName("Little Ceasars");

        pizzaBuilder3.addMushrooms();
        pizzaBuilder3.addPepperoni();
        pizzaBuilder3.addSausage();
        pizzaBuilder3.addBacon();
        pizzaBuilder3.addOnions();
        pizzaBuilder3.addExtraCheese();
        pizzaBuilder3.addPesto();
        pizzaBuilder3.addPeppers();
        
        Pizza pizza3 = pizzaBuilder3.build();
        pizza3.eat();
        // Small + 6 toppings
        PizzaBuilder pizzaBuilder4 = new PizzaBuilder("Small");
        pizzaBuilder4.setChainName("Little Ceasars");

        pizzaBuilder4.addMushrooms();
        pizzaBuilder4.addPepperoni();
        pizzaBuilder4.addSausage();
        pizzaBuilder4.addBacon();
        pizzaBuilder4.addOnions();
        pizzaBuilder4.addExtraCheese();

        Pizza pizza4 = pizzaBuilder4.build();
        pizza4.eat();

        //DOMINOS
        // Small + 1 topping
        PizzaBuilder pizzaBuilder5 = new PizzaBuilder("Small");
        pizzaBuilder5.setChainName("Dominos");

        pizzaBuilder5.addMushrooms();

        Pizza pizza5 = pizzaBuilder5.build();
        pizza5.eat();

        // Large + 3 toppings
        PizzaBuilder pizzaBuilder6 = new PizzaBuilder("Large");
        pizzaBuilder6.setChainName("Dominos");

        pizzaBuilder6.addMushrooms();
        pizzaBuilder6.addPepperoni();
        pizzaBuilder6.addSausage();

        Pizza pizza6 = pizzaBuilder6.build();
        pizza6.eat();
    }
}


