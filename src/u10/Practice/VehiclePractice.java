package u10.Practice;

public class VehiclePractice {
    private String make;
    private String model;
    private double fuelCapacity;
    private double fuelLevel;
    private double mpg;
    private double totalMiles = 0;

    public VehiclePractice(String make, String model, double fuelCapacity, double fuelLevel, double mpg) {
        this.make = make;
        this.model = model;
        this.fuelCapacity = fuelCapacity;
        this.fuelLevel = fuelLevel;
        this.mpg = mpg;
    }

    public VehiclePractice(String make, String model, double fuelCapacity, double mpg) {
        this(make, model, fuelCapacity, fuelCapacity, mpg);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public double getMpg() {
        return mpg;
    }

    public double getTotalMiles() {
        return totalMiles;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public void addGas(double gas) {
        if (gas + fuelLevel > fuelCapacity) {
            fuelLevel = fuelCapacity;
        }
        else {
            fuelLevel += gas;
        }

    }
    public double getRange() {
        return mpg * fuelLevel;
    }
    public boolean drive(double miles) {
        return true;
    }
}