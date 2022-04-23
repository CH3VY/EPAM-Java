package javaExceptions;

import java.util.List;

public class Subject {
    private final String name;
    private final List<Double> scores;

    public Subject(String name, List<Double> scores) {
        this.name = name;
        this.scores = scores;
    }

    public List<Double> getScores() {
        return scores;
    }

    public String getName() {
        return name;
    }

    public double getAverageScore() throws InvalidScoreException {
        double sum = 0;
        for (double score : scores) {
            if (score > 10 || score < 0) {
                throw new InvalidScoreException();
            }
            sum += score;
        }
        return sum / scores.size();
    }
}
