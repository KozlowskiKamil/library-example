package com.example.demo.coffee;

import org.springframework.stereotype.Component;

@Component
public class CoffeeVendingMachine {
    private final CoffeeMaker coffeeMaker;

    public CoffeeVendingMachine(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    public void serveCoffee() {
        String coffeeName = coffeeMaker.makeCoffee();
        System.out.println("Serving " + coffeeName);
    }
}
