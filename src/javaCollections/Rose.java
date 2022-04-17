package javaCollections;

public class Rose extends Flower {
    private int roseCost;

    public Rose(int cost, Freshness fresh, int stalk) {
        super(0, fresh, stalk);
        setCost(cost);
    }

    @Override
    public int getCost() {
        return roseCost;
    }

    @Override
    public void setCost(int value) {
        switch (this.getFresh()) {
            case Freshest -> roseCost = value;
            case MildFresh -> roseCost = value - 1;
            case OldFresh -> roseCost = value - 2;
        }

    }

    //Переопределение ToString();
    @Override
    public String toString() {
        return String.format("%1$s; %2$s", "Rose", super.toString());

    }
}