class PizzaBuilder {
    private Pizza pizza;

    public PizzaBuilder() {
        this.pizza = new Pizza();
    }

    public PizzaBuilder setSize(String size) {
        this.pizza.setSize(size);
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

    // Define methods for other toppings...

    public Pizza build() {
        return this.pizza;
    }
}