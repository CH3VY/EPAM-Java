package testttt;

//Класс Ирис
public class Iris extends Flower {
    private int irisCost;

    //Конструктор
    public Iris(int cost, Freshness fresh, int stalk) {
        super(0, fresh, stalk);
        setCost(cost);
    }

    //Переопределение стоимости
    //в зависимости от свежести
    @Override
    public int getCost() {
        return irisCost;
    }

    @Override
    public void setCost(int value) {
        switch (this.getFresh()) {
            case FullFresh -> irisCost = value;
            case MiddleFresh -> irisCost = value - 3;
            case OldFresh -> irisCost = value - 6;
        }
    }

    //Переопределение ToString();
    @Override
    public String toString() {
        return String.format("%1$s; %2$s", "Iris", super.toString());
    }
}
