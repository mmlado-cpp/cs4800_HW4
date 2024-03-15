package question2;

import java.lang.reflect.InvocationTargetException;

public class NutAllergyMacronutrientFactory extends MacronutrientFactory {
    private static NutAllergyMacronutrientFactory instance;

    private NutAllergyMacronutrientFactory() {
    }

    // singleton implementation
    public static NutAllergyMacronutrientFactory getInstance() {
        if (instance == null) {
            instance = new NutAllergyMacronutrientFactory();
        }
        return instance;
    }

    public Meal createMeal()
            throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Meal meal = new Meal();
        CarbFactory carbFact = CarbFactory.getInstance();
        FatFactory fatFact = FatFactory.getInstance();
        ProteinFactory protFact = ProteinFactory.getInstance();

        meal.setCarb(carbFact.getCarbs("nut allergy"));
        meal.setFat(fatFact.getFats("nut allergy"));
        meal.setProtein(protFact.getProteinBasedOnDiet("nut allergy"));
        return meal;

    }
}