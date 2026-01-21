package org.example.DecoratorDesignPattern.Decorator;

import org.example.DecoratorDesignPattern.BasePizza;

public class Mushroom extends ToppingDecorator{
    private BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+40;
    }
}
