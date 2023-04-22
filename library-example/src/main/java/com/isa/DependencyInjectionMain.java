package com.isa;

import com.isa.coffee.CoffeeVendingMachine;
import com.isa.coffee.EspressoMaker;

public class DependencyInjectionMain {
    public static void main(String[] args) {
        EspressoMaker espressoMaker = new EspressoMaker();
        CoffeeVendingMachine espressoVendingMachine = new CoffeeVendingMachine(espressoMaker);
        espressoVendingMachine.serveCoffee();
        /**
         * Zadanie 1
         * Utwórz klasę CappuccinoMaker, która będzie implementowała interfejs CoffeeMaker.
         * Stwórz nowy obiektw CoffeeVendingMachine, do którego wstrzykniesz obiekt nowo utworzonej klasy CappuccinoMaker.
         */
    }
}
