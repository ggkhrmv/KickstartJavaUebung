package ggkhrmv.kickstart.FishingGameSim;

public class RollOutcome {

    String message;
    Integer points;

    public RollOutcome(String message, Integer points) {
        super();
        this.message = message;
        this.points = points;
    }

    public String getMessage() {
        return message;
    }

    public Integer getPoints() {
        return points;
    }
}
