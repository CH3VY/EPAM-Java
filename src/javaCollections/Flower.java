package javaCollections;

public abstract class Flower implements java.lang.Comparable<Flower>
{

    private int Cost, StalkLength;
    private Freshness Fresh = Freshness.values()[0];


    public int getCost() {return Cost;}
    public final Freshness getFresh(){return Fresh;}
    public final int getStalkLength() {return StalkLength;}

    public void setCost(int value) {Cost = value;}
    public final void setFresh(Freshness value) {Fresh = value;}
    public final void setStalkLength(int value) {StalkLength = value;}

    public Flower(int cost, Freshness fresh, int stalk)
    {
        setCost(cost);
        setFresh(fresh);
        setStalkLength(stalk);
    }

    @Override
    public String toString() {
        return String.format("Cost: %1$s | Freshness: %2$s | Stalk length: %3$s", getCost(), getFresh(), getStalkLength());
    }

    public final int compareTo(Flower other) {
        return Integer.compare(this.getFresh().getValue(), other.getFresh().getValue());
    }
}
