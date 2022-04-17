package javaCollections;

public class Lily extends Flower {
    private int lilyCost;

    public Lily(int cost, Freshness fresh, int stalk) {
        super(0, fresh, stalk);
        setCost(cost);
    }

    @Override
    public int getCost() {return lilyCost;
    }

    @Override
    public void setCost(int value) {
        switch (this.getFresh()) {
            case Freshest -> lilyCost = value;
            case MildFresh -> lilyCost = value - 1;
            case OldFresh -> lilyCost = value - 2;
        }
    }

    @Override
    public String toString() {return String.format("%1$s; %2$s", "Lily", super.toString());
    }
}