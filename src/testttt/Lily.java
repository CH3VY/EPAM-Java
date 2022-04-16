package testttt;

//Класс Лилия
public class Lily extends Flower {
    private int lilyCost;

    //Конструктор
    public Lily(int cost, Freshness fresh, int stalk) {
        super(0, fresh, stalk);
        setCost(cost);
    }

    //Переопределение стоимости
    //в зависимости от свежести
    @Override
    public int getCost() {
        return lilyCost;

    }

    @Override
    public void setCost(int value) {
        switch (this.getFresh()) {
            case FullFresh -> lilyCost = value;
            case MiddleFresh -> lilyCost = value - 4;
            case OldFresh -> lilyCost = value - 8;
        }
    }

    //Переопределение ToString();
    @Override
    public String toString() {
        return String.format("%1$s; %2$s", "Lily", super.toString());

    }
}
