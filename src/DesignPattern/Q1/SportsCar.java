package DesignPattern.Q1;

import DesignPattern.Q1.CarDecorator;
import DesignPattern.Q1.ICar;

public class SportsCar extends CarDecorator {

    public SportsCar(ICar car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding features of Sports Car.");
    }
}
