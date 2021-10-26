package bil;

import barmanager.be.Drink;

public interface IDrink {
    static final String MILD_PROOF = "Mild";
    static final String MEDIUM_PROOF = "Medium";
    static final String STRONG_PROOF = "Strong";

    Drink createDrink(String proofDescription);

    String[] getProducts();
}

/*

    {
        switch (proofDescription)
        {
            case MILD_PROOF:
                return new Drink("Beer", 33);
            case MEDIUM_PROOF:
                return new Drink("Wine", 75);
            case STRONG_PROOF:
                return new Drink("Tequilla shot", 2);
        }
        return null;
    }

    {
        return new String[] {
                "Beer",
                "Wine",
                "Tequilla shot"
        };
    }
 */