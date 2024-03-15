package question2;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class FatFactory {
    private static FatFactory instance;

    private FatFactory() {
    }

    // singleton implementation
    public static FatFactory getInstance() {
        if (instance == null) {
            instance = new FatFactory();
        }
        return instance;
    }

    public Fat getFats(String diet)
            throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        ArrayList<Class<? extends Fat>> paleo = new ArrayList<>();
        paleo.add(FatFactory.Avocado.class);
        paleo.add(FatFactory.Tuna.class);
        paleo.add(FatFactory.Peanuts.class);

        ArrayList<Class<? extends Fat>> vegan = new ArrayList<>();
        vegan.add(FatFactory.Avocado.class);
        vegan.add(FatFactory.Peanuts.class);

        ArrayList<Class<? extends Fat>> nutAllergy = new ArrayList<>();
        nutAllergy.add(FatFactory.Avocado.class);
        nutAllergy.add(FatFactory.SourCream.class);
        nutAllergy.add(FatFactory.Tuna.class);

        ArrayList<Class<? extends Fat>> noRes = new ArrayList<>();
        noRes.add(FatFactory.Avocado.class);
        noRes.add(FatFactory.SourCream.class);
        noRes.add(FatFactory.Tuna.class);
        noRes.add(FatFactory.Peanuts.class);

        if (diet.equals("paleo")) {
            return paleo.get(RandIndex.random(paleo.size())).getDeclaredConstructor().newInstance();
        } else if (diet.equals("vegan")) {
            return vegan.get(RandIndex.random(vegan.size())).getDeclaredConstructor().newInstance();
        } else if (diet.equals("nut allergy")) {
            return nutAllergy.get(RandIndex.random(nutAllergy.size())).getDeclaredConstructor().newInstance();
        } else {
            return noRes.get(RandIndex.random(noRes.size())).getDeclaredConstructor().newInstance();
        }
    }

    static class Avocado extends Fat {
        public Avocado() {
            super("Avocado");
        }
    }

    static class SourCream extends Fat {
        public SourCream() {
            super("Sour cream");
        }
    }

    static class Tuna extends Fat {
        public Tuna() {
            super("Tuna");
        }
    }

    static class Peanuts extends Fat {
        public Peanuts() {
            super("Peanuts");
        }
    }

}
