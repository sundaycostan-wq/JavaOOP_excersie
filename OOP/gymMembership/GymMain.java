package gymMembership;
public class GymMain {
    public static void main(String[] args) {
        PremiumMembership pm = new PremiumMembership("Lucas", 14, true, true);
        System.out.println("Total fees: " + pm.calculateFees());
        System.out.println("Eligible for special offer: " + pm.specialOffer());
    }
}
