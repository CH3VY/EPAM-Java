package javaCollections;

public enum Freshness {
    Freshest(0),
    MildFresh(1),
    OldFresh(2);

    public static Freshness toFreshness(int freshness) {
        switch (freshness) {
            case 0:
                return Freshness.Freshest;
            case 1:
                return Freshness.MildFresh;
            case 2:
                return Freshness.OldFresh;
            default:
                throw new IllegalArgumentException("Freshness value is invalid: " + freshness);
        }
    }

    public int value;
    private Freshness(final Integer value) {
        this.value = value;
    }
    public Integer getValue() {
        return value;
    }
}