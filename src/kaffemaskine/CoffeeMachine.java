package kaffemaskine;

public class CoffeeMachine {
    public Cup serve(DrinkType drinkType, DrinkSize drinkSize, boolean whippedCream) {
        if (!drinkType.CanHaveSize()) {
            drinkSize = null;
        }
        return new Cup(drinkType, drinkSize, whippedCream);

    }


}
