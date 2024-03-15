package question2;

import java.lang.reflect.InvocationTargetException;

public class Driver {
    public static void main(String[] args)
            throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Customer[] customers = {
                new Customer("Martin", "no restriction"),
                new Customer("Nima", "no restriction"),
                new Customer("Walter", "paleo"),
                new Customer("Jesse", "vegan"),
                new Customer("Mike", "nut allergy"),
                new Customer("Saul", "paleo")
        };

        for (Customer customer : customers) {
            Meal meal = new Meal();
            customer.setMeal(meal.getMacronutrientFactory(customer).createMeal());
            customer.displayMeal();
        }

    }
}
