package keniu.condiments;

import keniu.beverages.Beverage;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with milk";
    }
}
