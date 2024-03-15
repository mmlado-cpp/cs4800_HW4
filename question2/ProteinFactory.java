package question2;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class ProteinFactory {

    private static ProteinFactory instance;

    private ProteinFactory() {
    }

    // singleton implementation
    public static ProteinFactory getInstance() {
        if (instance == null) {
            instance = new ProteinFactory();
        }
        return instance;
    }

    public Protein getProteinBasedOnDiet(String diet)
            throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        ArrayList<Class<? extends Protein>> paleo = new ArrayList<>();
        paleo.add(ProteinFactory.Fish.class);
        paleo.add(ProteinFactory.Chicken.class);
        paleo.add(ProteinFactory.Beef.class);

        ArrayList<Class<? extends Protein>> vegan = new ArrayList<>();
        vegan.add(ProteinFactory.Tofu.class);

        ArrayList<Class<? extends Protein>> nutAllergy = new ArrayList<>();
        nutAllergy.add(ProteinFactory.Fish.class);
        nutAllergy.add(ProteinFactory.Chicken.class);
        nutAllergy.add(ProteinFactory.Chicken.class);
        nutAllergy.add(ProteinFactory.Beef.class);

        ArrayList<Class<? extends Protein>> noRes = new ArrayList<>();
        noRes.add(ProteinFactory.Fish.class);
        noRes.add(ProteinFactory.Chicken.class);
        noRes.add(ProteinFactory.Chicken.class);
        noRes.add(ProteinFactory.Beef.class);

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

    static class Fish extends Protein {
        public Fish() {
            super("Fish");
        }
    }

    static class Chicken extends Protein {
        public Chicken() {
            super("Chicken");
        }
    }

    static class Beef extends Protein {
        public Beef() {
            super("Beef");
        }
    }

    static class Tofu extends Protein {
        public Tofu() {
            super("Tofu");
        }
    }

}
