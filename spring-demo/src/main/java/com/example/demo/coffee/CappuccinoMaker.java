package com.example.demo.coffee;

import org.springframework.stereotype.Component;

@Component
public class CappuccinoMaker implements CoffeeMaker {
    @Override
    public String makeCoffee() {
        return "Cappuccino";
    }
}
