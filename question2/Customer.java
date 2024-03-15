package question2;

public class Customer {

    private String name;
    private String diet;

    private Meal meal;

    public Customer(String name, String diet) {
        this.name = name;
        if (diet.equals("paleo") || diet.equals("vegan") || diet.equals("nut allergy")) {
            this.diet = diet;
        } else {
            this.diet = "no restriction";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiet(String diet) {
        if (diet.equals("paleo") || diet.equals("vegan") || diet.equals("nut allergy")) {
            this.diet = diet;
        } else {
            this.diet = "no restriction";
        }
    }

    public String getDiet() {
        return diet;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public void displayMeal() {
        System.out.print(name + "'s " + diet + " meal - ");
        meal.printMeal();
    }
}
