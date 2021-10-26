package bil;

import barmanager.be.Drink;

public class SchoolSoda implements IDrink{
    @Override
    public Drink createDrink(String proofDescription) {
        switch (proofDescription)
        {
            case MILD_PROOF:
                return new Drink("SportCola", 33);
            case MEDIUM_PROOF:
                return new Drink("CocaCola", 50);
            case STRONG_PROOF:
                return new Drink("CocaCola Lemon", 125);
        }
        return null;
    }

    @Override
    public String[] getProducts() {
        return new String[] {
                "SportCola",
                "CocaCola",
                "CocaCola Lemon"
        };
    }
}
