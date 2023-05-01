package com.example.demo.coffee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class Controler {
    private  CoffeeVendingMachine coffeeVendingMachine;

    public Controler(CoffeeVendingMachine coffeeVendingMachine){
        this.coffeeVendingMachine = coffeeVendingMachine;
    }

    @GetMapping("/")
    public void serviceCoffe(){
     coffeeVendingMachine.serveCoffee();
    }
}
