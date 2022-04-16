package javaCollections;

public class Flower {
    private int stemLength, cost;
    String freshness;

    public Flower(String freshness, int stemLength, int cost){
        this.freshness = freshness;
        this.stemLength = stemLength;
        this.cost = cost;
    }
    @Override
    public String toString(){
        return "Freshness: " + freshness + "\nStem length: " + stemLength + "\nCost: " + cost;
    }


}


