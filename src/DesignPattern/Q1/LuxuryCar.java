package DesignPattern.Q1;

import DesignPattern.Q1.CarDecorator;
import DesignPattern.Q1.ICar;

public class LuxuryCar extends CarDecorator {

    public LuxuryCar(ICar car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding features of Luxury Car.");
    }
}
