package com.example.demo.coffee;

import org.springframework.stereotype.Component;

@Component
public class EspressoMaker implements CoffeeMaker{
    @Override
    public String makeCoffee() {
        return "Espresso";
    }
}
