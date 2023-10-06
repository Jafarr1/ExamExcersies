package catlimb;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TestProgram {
    public static void main(String[] args) {
        new TestProgram().run();
    }

    private void run() {
        Cat cat1 = new Cat(true);
        Cat cat2 = new Cat(false);
        Cat cat3 = new Cat(true);
        Cat cat4 = new Cat(false);
        Cat cat5 = new Cat(false);
        ArrayList<Cat> cats = new ArrayList<>(Arrays.asList(cat1,cat2,cat3,cat4,cat5));
       Cat registeredCats[] = new Cat[5];
       int count =0;
        for (Cat cat : cats) {
            if (cat.catIsRegistered() && count < 5) {
                registeredCats[count++] = cat;
            }
        }




        }


    }
