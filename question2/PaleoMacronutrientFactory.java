package question2;

import java.lang.reflect.InvocationTargetException;

public class PaleoMacronutrientFactory extends MacronutrientFactory {
    private static PaleoMacronutrientFactory instance;

    private PaleoMacronutrientFactory() {
    }

    public static PaleoMacronutrientFactory getInstance() {
        if (instance == null) {
            instance = new PaleoMacronutrientFactory();
        }
        return instance;
    }

    public Meal createMeal()
            throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Meal meal = new Meal();
        CarbFactory carbFact = CarbFactory.getInstance();
        FatFactory fatFact = FatFactory.getInstance();
        ProteinFactory protFact = ProteinFactory.getInstance();

        meal.setCarb(carbFact.getCarbs("paleo"));
        meal.setFat(fatFact.getFats("paleo"));
        meal.setProtein(protFact.getProteinBasedOnDiet("paleo"));
        return meal;

    }
}