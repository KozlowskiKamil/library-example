package com.example.demo.coffee;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class CappuccinoMaker implements CoffeeMaker {
    @Override
    public String makeCoffee() {
        return "Cappuccino";
    }
}
