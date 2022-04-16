package testttt;

//Абстрактный класс Цветок
public abstract class Flower implements java.lang.Comparable<Flower>
{
    //Свойства
    private int Cost;
    public int getCost()
    {
        return Cost;
    }
    public void setCost(int value)
    {
        Cost = value;
    }
    private Freshness Fresh = Freshness.values()[0];
    public final Freshness getFresh()
    {
        return Fresh;
    }
    public final void setFresh(Freshness value)
    {
        Fresh = value;
    }
    private int StalkLength;
    public final int getStalkLength()
    {
        return StalkLength;
    }
    public final void setStalkLength(int value)
    {
        StalkLength = value;
    }

    //Конструктор
    public Flower(int cost, Freshness fresh, int stalk)
    {
        setCost(cost);
        setFresh(fresh);
        setStalkLength(stalk);
    }
    //Переопределение ToString();
    @Override
    public String toString()
    {
        return String.format("Cost: {0:N}, Freshness: %2$s, StalkLength: %3$s", getCost(), getFresh(), getStalkLength());
    }

    //Реализация интерфейса IComparable<Flower>(для сортировки)
    public final int compareTo(Flower other)
    {
        return Integer.compare(this.getFresh().getValue(), other.getFresh().getValue());
    }
}

