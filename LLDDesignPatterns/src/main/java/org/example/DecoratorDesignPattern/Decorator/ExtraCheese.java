package org.example.DecoratorDesignPattern.Decorator;

import org.example.DecoratorDesignPattern.BasePizza;

public class ExtraCheese extends ToppingDecorator {
    private BasePizza basePizza;
    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+30;
    }
}
