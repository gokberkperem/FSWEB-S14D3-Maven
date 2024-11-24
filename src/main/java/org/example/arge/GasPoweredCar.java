package org.example.arge;

public class GasPoweredCar extends CarSkeleton{

    private double averageKmPerLiter;
    private int Cylinders;

    public GasPoweredCar(String name, String description, double averageKmPerLiter, int cylinders) {
        super(name, description);
        this.averageKmPerLiter = averageKmPerLiter;
        Cylinders = cylinders;
    }

    @Override
    public String drive() {
        return "run from GasPowered car";
    }

    @Override
    public String startEngine() {
        runEngine(this);
        return getName()+ " car starting..";
    }

    public double getAverageKmPerLiter() {
        return averageKmPerLiter;
    }

    public int getCylinders() {
        return Cylinders;
    }
}
