package building;

public class ResidentialBuilding extends Building {
    int apartments;
    double rentPerApartment;

    public ResidentialBuilding(String address, int floors, double totalArea, int apartments, double rentPerApartment) {
        super(address, floors, totalArea);
        this.apartments = apartments;
        this.rentPerApartment = rentPerApartment;
    }

    public double totalRent() {
        return apartments * rentPerApartment;
    }
}
