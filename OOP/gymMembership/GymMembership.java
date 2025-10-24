package gymMembership;
public class GymMembership {
    String memberName;
    String membershipType;
    int duration; 

    public GymMembership(String memberName, String membershipType, int duration) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.duration = duration;
    }

    public double calculateFees() {
        if (membershipType.equalsIgnoreCase("basic")) return duration * 20;
        else return duration * 35;
    }
}