package question2;

import java.lang.reflect.InvocationTargetException;

public class VeganMacronutrientFactory extends MacronutrientFactory {
    private static VeganMacronutrientFactory instance;

    private VeganMacronutrientFactory() {
    }

    public static VeganMacronutrientFactory getInstance() {
        if (instance == null) {
            instance = new VeganMacronutrientFactory();
        }
        return instance;
    }

    public Meal createMeal()
            throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Meal meal = new Meal();
        CarbFactory carbFact = CarbFactory.getInstance();
        FatFactory fatFact = FatFactory.getInstance();
        ProteinFactory protFact = ProteinFactory.getInstance();

        meal.setCarb(carbFact.getCarbs("vegan"));
        meal.setFat(fatFact.getFats("vegan"));
        meal.setProtein(protFact.getProteinBasedOnDiet("vegan"));
        return meal;

    }
}