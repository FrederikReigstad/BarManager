package bil;

public class DrinkFactory {
    public static IDrink iDrink(){
            return new SchoolSoda();
            //return new SchoolDrink();
        }
    };



