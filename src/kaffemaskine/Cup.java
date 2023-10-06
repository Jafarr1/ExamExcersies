package kaffemaskine;

public class Cup {
    private DrinkSize drinkSize;
    private DrinkType drinkType;
    private boolean whippedCream;


    public Cup(DrinkType drinkType, DrinkSize drinksize, boolean whippedCream) {
        this.drinkSize = drinksize;
        this.drinkType = drinkType;
        this.whippedCream = whippedCream;

    }

    public DrinkSize getDrinkSize() {
        return drinkSize;
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public boolean hasWhippedCream() {
        return whippedCream;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "drinkSize=" + drinkSize +
                ", drinkType=" + drinkType +
                ", whippedCream=" + whippedCream +
                '}';
    }
}

