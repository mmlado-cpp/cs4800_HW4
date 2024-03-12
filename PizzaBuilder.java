class PizzaBuilder {
    private Pizza pizza;

    public PizzaBuilder() {
        this.pizza = new Pizza();
    }

    public PizzaBuilder setSize(String size) {
        this.pizza.setSize(size);
        return this;
    }

    public PizzaBuilder setChainName(String name) {
        this.pizza.setChainName(name);
        return this;
    }

    public PizzaBuilder addPepperoni() {
        this.pizza.addTopping("Pepperoni");
        return this;
    }

    public PizzaBuilder addSausage() {
        this.pizza.addTopping("Sausage");
        return this;
    }

    public PizzaBuilder addMushrooms() {
        this.pizza.addTopping("Mushrooms");
        return this;
    }

    public PizzaBuilder addBacon() {
        this.pizza.addTopping("Bacon");
        return this;
    }

    public PizzaBuilder addOnions() {
        this.pizza.addTopping("Onions");
        return this;
    }

    public PizzaBuilder addExtraCheese() {
        this.pizza.addTopping("Extra Cheese");
        return this;
    }

    public PizzaBuilder addPeppers() {
        this.pizza.addTopping("Peppers");
        return this;
    }

    public PizzaBuilder addChicken() {
        this.pizza.addTopping("Chicken");
        return this;
    }

    public PizzaBuilder addOlives() {
        this.pizza.addTopping("Olives");
        return this;
    }

    public PizzaBuilder addSpinach() {
        this.pizza.addTopping("Spinach");
        return this;
    }

    public PizzaBuilder addTomatoAndBasil() {
        this.pizza.addTopping("Tomato and Basil");
        return this;
    }

    public PizzaBuilder addBeef() {
        this.pizza.addTopping("Beef");
        return this;
    }

    public PizzaBuilder addHam() {
        this.pizza.addTopping("Ham");
        return this;
    }

    public PizzaBuilder addPesto() {
        this.pizza.addTopping("Pesto");
        return this;
    }

    public PizzaBuilder addHamAndPineapple() {
        this.pizza.addTopping("Ham and Pineapple");
        return this;
    }

    public PizzaBuilder addSpicyPork() {
        this.pizza.addTopping("Spicy Pork");
        return this;
    }
    

    public Pizza build() {
        return this.pizza;
    }
}