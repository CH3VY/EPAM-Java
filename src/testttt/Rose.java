package testttt;

//Класс Роза
public class Rose extends Flower {
    private int roseCost;

    //Конструктор
    public Rose(int cost, Freshness fresh, int stalk) {
        super(0, fresh, stalk);
        setCost(cost);
    }

    //Переопределение стоимости
    //в зависимости от свежести
    @Override
    public int getCost() {
        return roseCost;
    }

    @Override
    public void setCost(int value) {
        switch (this.getFresh()) {
            case FullFresh -> roseCost = value;
            case MiddleFresh -> roseCost = value - 2;
            case OldFresh -> roseCost = value - 4;
        }

    }

    //Переопределение ToString();
    @Override
    public String toString() {
        return String.format("%1$s; %2$s", "Rose", super.toString());

    }
}
