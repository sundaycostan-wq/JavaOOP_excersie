package gymMembership;

public class PremiumMembership extends GymMembership {
    boolean personalTrainer;
    boolean spaAccess;

    public PremiumMembership(String memberName, int duration, boolean personalTrainer, boolean spaAccess) {
        super(memberName, "Premium", duration);
        this.personalTrainer = personalTrainer;
        this.spaAccess = spaAccess;
    }

    public boolean specialOffer() {
        return duration > 12;
    }
}