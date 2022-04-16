package testttt;

//Перечисление степень свежести
public enum Freshness {
    FullFresh,
    MiddleFresh,
    OldFresh;

    public static final int SIZE = Integer.SIZE;

    public int getValue() {
        return this.ordinal();
    }

    public static Freshness forValue(int value) {
        return values()[value];
    }
}
