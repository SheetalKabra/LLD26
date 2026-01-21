package org.example.DecoratorDesignPattern;

import org.example.DecoratorDesignPattern.Decorator.ExtraCheese;
import org.example.DecoratorDesignPattern.Decorator.Mushroom;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new VegDelight();
        BasePizza basePizzaWithExtraCheese = new ExtraCheese(basePizza);
        BasePizza basePizzaWithExtraCheeseWithMushroom = new Mushroom(basePizzaWithExtraCheese);
        System.out.println(basePizzaWithExtraCheeseWithMushroom.cost());
    }
}
