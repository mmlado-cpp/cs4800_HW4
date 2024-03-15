package question2;

import java.lang.reflect.InvocationTargetException;

public class NoRestrictionMacronutrientFactory extends MacronutrientFactory {
    private static NoRestrictionMacronutrientFactory instance;

    private NoRestrictionMacronutrientFactory() {
    }

    // singleton implementation
    public static NoRestrictionMacronutrientFactory getInstance() {
        if (instance == null) {
            instance = new NoRestrictionMacronutrientFactory();
        }
        return instance;
    }

    public Meal createMeal()
            throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Meal meal = new Meal();
        CarbFactory carbFact = CarbFactory.getInstance();
        FatFactory fatFact = FatFactory.getInstance();
        ProteinFactory protFact = ProteinFactory.getInstance();

        meal.setCarb(carbFact.getCarbs("no restriction"));
        meal.setFat(fatFact.getFats("no restriction"));
        meal.setProtein(protFact.getProteinBasedOnDiet("no restriction"));
        return meal;

    }
}
