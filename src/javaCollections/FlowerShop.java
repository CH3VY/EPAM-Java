package javaCollections;
import java.util.*;


public class FlowerShop {
    public static void main(String[] args) {
        System.out.println("Welcome to our Flower Shop!");

        Flower[] flowerList = new Flower[5];
        flowerList[0] = new Flower("Rose", 5, 3);
        flowerList[1] = new Flower("Tulip", 3, 2);
        flowerList[2] = new Flower("Lily", 1, 1);
        flowerList[3] = new Flower("Sunflower", 10, 5);

        Arrays.sort(flowerList, new Comparator<Flower>() {

       public int compare(Flower o1, Flower o2) {
           return o1.freshness.compareTo(o2.freshness);
       }
   });
        System.out.println(Arrays.asList(flowerList));
    }
}
