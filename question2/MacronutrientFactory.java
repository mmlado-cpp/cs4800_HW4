package question2;

import java.lang.reflect.InvocationTargetException;

public abstract class MacronutrientFactory {
    public abstract Meal createMeal()
            throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException;
}
