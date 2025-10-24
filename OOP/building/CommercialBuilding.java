package building;

public class CommercialBuilding extends Building {
    double officeSpace;
    double rentPerSqMeter;

    public CommercialBuilding(String address, int floors, double totalArea, double officeSpace, double rentPerSqMeter) {
        super(address, floors, totalArea);
        this.officeSpace = officeSpace;
        this.rentPerSqMeter = rentPerSqMeter;
    }

    public double totalRent() {
        return officeSpace * rentPerSqMeter;
    }
}