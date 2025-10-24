package building;

public class BuildingMain {
    public static void main(String[] args) {
        ResidentialBuilding rb = new ResidentialBuilding("123 Street", 5, 2000, 10, 800);
        CommercialBuilding cb = new CommercialBuilding("456 Avenue", 10, 5000, 3000, 15);
        System.out.println("Residential total rent: " + rb.totalRent());
        System.out.println("Commercial total rent: " + cb.totalRent());
    }
}
