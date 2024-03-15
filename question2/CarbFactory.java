package question2;

import java.lang.reflect.InvocationTargetException;

import java.util.ArrayList;

public class CarbFactory {
    private static CarbFactory instance;

    private CarbFactory() {
    }

    // singleton implementation
    public static CarbFactory getInstance() {
        if (instance == null) {
            instance = new CarbFactory();
        }
        return instance;
    }

    public Carb getCarbs(String diet)
            throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        ArrayList<Class<? extends Carb>> noRestriction = new ArrayList<>();
        noRestriction.add(Cheese.class);
        noRestriction.add(Bread.class);
        noRestriction.add(Lentils.class);
        noRestriction.add(Pistachio.class);
        
        ArrayList<Class<? extends Carb>> paleo = new ArrayList<>();
        paleo.add(Pistachio.class);

        ArrayList<Class<? extends Carb>> vegan = new ArrayList<>();
        vegan.add(Pistachio.class);
        vegan.add(Lentils.class);
        vegan.add(Bread.class);

        ArrayList<Class<? extends Carb>> nutAllergy = new ArrayList<>();
        nutAllergy.add(Cheese.class);
        nutAllergy.add(Bread.class);
        nutAllergy.add(Lentils.class);

        

        if (diet.equals("paleo")) {
            return paleo.get(RandIndex.random(paleo.size())).getDeclaredConstructor().newInstance();
        } else if (diet.equals("vegan")) {
            return vegan.get(RandIndex.random(vegan.size())).getDeclaredConstructor().newInstance();
        } else if (diet.equals("nut allergy")) {
            return nutAllergy.get(RandIndex.random(nutAllergy.size())).getDeclaredConstructor().newInstance();
        } else {
            return noRestriction.get(RandIndex.random(noRestriction.size())).getDeclaredConstructor().newInstance();
        }

    }

    static class Cheese extends Carb {
        public Cheese() {
            super("Cheese");
        }
    }

    static class Bread extends Carb {
        public Bread() {
            super("Bread");
        }
    }

    static class Lentils extends Carb {
        public Lentils() {
            super("Lentils");
        }
    }

    static class Pistachio extends Carb {
        public Pistachio() {
            super("Pistachio");
        }
    }

}
