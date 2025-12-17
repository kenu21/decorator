package keniu;

import keniu.beverages.Americano;
import keniu.beverages.Espresso;
import keniu.condiments.Liqueur;
import keniu.condiments.Milk;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Milk(new Espresso()).getDescription());
        System.out.println(new Liqueur(new Americano()).getDescription());
        System.out.println(new Liqueur(new Milk(new Espresso())).getDescription());
    }
}
