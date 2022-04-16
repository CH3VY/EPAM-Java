package testttt;
import java.util.*;

public class Program
{
    public static void main(String[] args)
    {
        //Массив (букет) цветов
        Flower[] flowers = new Flower[]
                {
                        new Rose(120,Freshness.FullFresh,20),
                        new Lily(100,Freshness.OldFresh,25),
                        new Iris(90,Freshness.MiddleFresh,30),
                        new Rose(150,Freshness.OldFresh,26),
                        new Iris(52,Freshness.MiddleFresh,40)
                };

        System.out.println("***** Букет цветов несортированный *****\n");
        for (Flower f : flowers)
        {
            System.out.println(f.toString());
        }

        //Сортируем массив
        Arrays.sort(flowers);

        System.out.println("\n***** Букет цветов отсортированный *****\n");
        for (Flower f : flowers)
        {
            System.out.println(f.toString());
        }

        System.out.println("\n***** Цветы со стеблем больше или равным 40 *****\n");
        for (Flower f : flowers)
        {
            if((f.getStalkLength()) >= 20){
            System.out.println(f);
            }
        }
        new Scanner(System.in).nextLine();
    }
}

