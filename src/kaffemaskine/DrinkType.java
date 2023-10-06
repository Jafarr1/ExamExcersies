package kaffemaskine;

public enum DrinkType {
    BLACK_COFFEE(true),
    ESPRESSO(false),
    DOUBLE_ESPRESSO(false),
    TRIPLE_ESPRESSO(false),
    LATTE_MACCHIATO(true),
    COCOA_MILK(true),
    CHOCOLATE_DRINK(true);

   private boolean canHaveSize;

    DrinkType(boolean canHaveSize) {
        this.canHaveSize = canHaveSize;
    }

    public boolean CanHaveSize() {
        return canHaveSize;
    }
}
