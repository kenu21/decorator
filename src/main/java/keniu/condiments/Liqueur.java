package keniu.condiments;

import keniu.beverages.Beverage;

public class Liqueur extends CondimentDecorator {
    public Liqueur(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with liqueur";
    }
}
