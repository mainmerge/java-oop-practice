public class PremiumMembership extends GymMembership {
    private boolean personalTrainer;
    private boolean spaAccess;

    public PremiumMembership(String memberName, int duration,
                             boolean personalTrainer, boolean spaAccess) {
        super(memberName, "Premium", duration);
        this.personalTrainer = personalTrainer;
        this.spaAccess = spaAccess;
    }

    @Override
    public double calculateFee() {
        return duration * 100;
    }

    public boolean hasSpecialOffer() {
        return duration >= 12;
    }
}
