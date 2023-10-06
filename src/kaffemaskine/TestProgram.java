package kaffemaskine;

public class TestProgram {
    public static void main(String[] args) {
        new TestProgram().run();
    }

    private void run() {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Cup espressoCoffeCup = coffeeMachine.serve(DrinkType.ESPRESSO, DrinkSize.MEDIUM, false);
        System.out.println("Served: " + espressoCoffeCup);

        Cup latteMacchiatoCup = coffeeMachine.serve(DrinkType.LATTE_MACCHIATO, DrinkSize.LARGE, false);
        System.out.println("Served: " + latteMacchiatoCup);

        Cup cacaoMilkCoffeCup = coffeeMachine.serve(DrinkType.COCOA_MILK, DrinkSize.SMALL, true);
        System.out.println("Served: " + cacaoMilkCoffeCup);

    }



}
