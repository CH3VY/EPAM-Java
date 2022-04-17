package javaCollections;
import java.util.*;

// EPAM Automated Testing: Java Foundations
// Aidyn Seipolla

public class FlowerShop
{
    private static int totalCost = 0;

    public static void main(String[] args)
    {
        Flower[] flowers = new Flower[]
                {
                        new Rose(12,Freshness.Freshest,18),
                        new Lily(10,Freshness.OldFresh,31),
                        new Tulip(9,Freshness.MildFresh,24),
                        new Rose(15,Freshness.OldFresh,25),
                        new Rose(20,Freshness.Freshest,15),
                        new Lily(20,Freshness.Freshest,16),
                        new Tulip(11,Freshness.MildFresh,19)
                };

        System.out.println("Unsorted list of flowers:");
        for (Flower f : flowers)
        {
            System.out.println(f.toString());
        }

        Arrays.sort(flowers);
        System.out.println("\nSorted list of flowers in a bouquet:");
        for (Flower f : flowers)
        {
            totalCost += f.getCost();
            System.out.println(f);
        }
        System.out.println("\nTotal cost of the bouquet: " + totalCost + "$");

        System.out.println("\nFlowers with stalk length more than 20cm:");
        for (Flower f : flowers)
        {
            if((f.getStalkLength()) >= 20){
                System.out.println(f);
            }
        }
    }
}
