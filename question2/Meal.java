package question2;

public class Meal {
    private Carb carb;
    private Fat fat;
    private Protein protein;

    public Fat getFat() {
        return fat;
    }

    public void setFat(Fat fat) {
        this.fat = fat;
    }

    public Carb getCarb() {
        return carb;
    }

    public void setCarb(Carb carb) {
        this.carb = carb;
    }

    public Protein getProtein() {
        return protein;
    }

    public void setProtein(Protein protein) {
        this.protein = protein;
    }

    public void printMeal() {
        System.out.println("Carb: " + carb.getName() + ", Protein: " + protein.getName() + ", Fat: " + fat.getName());
    }

    public MacronutrientFactory getMacronutrientFactory(Customer customer) {
        String diet = customer.getDiet();
        if ("paleo".equals(diet)) {
            return PaleoMacronutrientFactory.getInstance();
        } else if ("vegan".equals(diet)) {
            return VeganMacronutrientFactory.getInstance();
        } else if ("nut allergy".equals(diet)) {
            return NutAllergyMacronutrientFactory.getInstance();
        } else {
            return NoRestrictionMacronutrientFactory.getInstance();
        }
    }
}
