package javaCollections;

public class Rose extends Flower {
    private int stemLength, cost;
    private String freshness;

    public Rose(String freshness, int stemLength, int cost) {
        super(freshness, stemLength, cost);

        this.freshness = freshness;
        this.stemLength = stemLength;
        this.cost = cost;
    }

}





