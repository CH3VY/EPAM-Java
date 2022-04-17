package javaCollections;
import java.util.*;

// EPAM Automated Testing: Java Foundations
// Aidyn Seipolla

public class FlowerShop
{
    public static void main(String[] args)
    {
        Flower[] flowers = new Flower[]
                {
                        new Rose(120,Freshness.Freshest,20),
                        new Lily(100,Freshness.OldFresh,25),
                        new Tulip(90,Freshness.MildFresh,30),
                        new Rose(150,Freshness.OldFresh,26),
                        new Tulip(52,Freshness.MildFresh,40)
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
            if((f.getStalkLength()) >= 40){
                System.out.println(f);
            }
        }
    }
}
