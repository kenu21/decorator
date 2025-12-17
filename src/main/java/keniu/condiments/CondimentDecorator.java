package keniu.condiments;

import keniu.beverages.Beverage;

public abstract class CondimentDecorator implements Beverage {
    protected Beverage beverage;

    protected CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public abstract String getDescription();
}
