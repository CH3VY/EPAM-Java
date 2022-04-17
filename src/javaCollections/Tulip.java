package javaCollections;

public class Tulip extends Flower {
    private int irisCost;

    public Tulip(int cost, Freshness fresh, int stalk) {
        super(0, fresh, stalk);
        setCost(cost);
    }

    @Override
    public int getCost() {return irisCost;
    }

    @Override
    public void setCost(int value) {
        switch (this.getFresh()) {
            case Freshest -> irisCost = value;
            case MildFresh -> irisCost = value - 1;
            case OldFresh -> irisCost = value - 2;
        }
    }

    @Override
    public String toString() {return String.format("%1$s; %2$s", "Iris", super.toString());
    }
}